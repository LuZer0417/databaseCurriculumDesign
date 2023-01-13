package db.InfoManage.classDAOImpl;

import db.DAO.dbconnection.ConnectionImpl;
import db.InfoManage.classDAO.loginDAO;
import db.InfoManage.class_.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static Encryption.RSAUtils.decrypt;

public class loginDAOImpl extends ConnectionImpl implements loginDAO {

    @Override
    public void addInfo(login lg){
        Connection con = null;
        String sql="INSERT INTO  login(id,password,idt) VALUES(?,?,?)";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1,lg.getId());
            psmt.setString(2,lg.getPassword());
            psmt.setString(3, lg.getIdt());
            psmt.executeUpdate();
            psmt.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void delInfo(String id){
        Connection con = null;
        String sql="DELETE FROM login where id=?";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, id);
            psmt.executeUpdate();
            psmt.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void updateInfo(String pw){
        Connection con = null;
        String sql="UPDATE login SET password=?";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1,pw);
            psmt.executeUpdate();
            psmt.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    public int checkLogin(String uid, String psw){
        Connection con = null;
        String sql="select * from login where id=?";
        int resultCount = 0;
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, uid);
            //psmt.setString(2,psw);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()){
                String secretPW=rs.getString(2);
                // 这里比对一下密码是否正确
                String passwordDe = decrypt(secretPW, "MIIBUwIBADANBgkqhkiG9w0BAQEFAASCAT0wggE5AgEAAkEArJ7uIdQAKhbGOT+J8x01kAEdp1l1e6g/32r6npy3sNL30KVhJuDmodVPTHUy4pWYBKt3qlzgXc5bUpLtnH5ivQIDAQABAkAFHSI121dz57/Qk1rNWnirPvU3b3WFB8t4nW02RLNGaDT96JYIclsx/OKMoYbWeGXpBDtDM2muvmqRMZGcZEZ7AiEA8g0ow0nN0JesZyAs74umxz/IVYDclIa3Hq8uoddVQfcCIQC2kYC2QLT8z0ZwHYEY8rDK6agXOheNJ5OJbits7/aT6wIgYAI+N+/vVhzDQohtqnp/Jas0AE5DsBobSm18Fq+93pMCIFmlxxM3YOgHC+p/wmWyvjdVVvHY17m7ZkoErBQ5HNZzAiAss1IYmEQ9/TQbaREuA/OieQMBKgyuH3fZ5QbmEEIX1A==");
                if(psw.equals(passwordDe)){
                    resultCount++;// 说明匹配到了
                }
            }
            psmt.close();
            return resultCount;
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return resultCount;
    }

}






/*
    Connection con = null;
    String sql="";
        try{
                con = getConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
                psmt.close();
                }catch(Exception e){
                e.printStackTrace();
                }finally {
                try{
                con.close();
                }catch (Exception e){
                e.printStackTrace();
                }
                }*/