package db.InfoManage.classDAOImpl;

import db.DAO.dbconnection.ConnectionImpl;
import db.InfoManage.classDAO.loginDAO;
import db.InfoManage.class_.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
        String sql="select * from login where id=? and password=?";
        int resultCount = 0;
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, uid);
            psmt.setString(2,psw);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()){
                resultCount++;
                String sid=rs.getString(1);
                String atimes=rs.getString(2);
                System.out.println(sid+" "+atimes);
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