package db.InfoManage.classDAOImpl;

import db.DAO.dbconnection.ConnectionImpl;
import db.InfoManage.classDAO.loginDAO;
import db.InfoManage.class_.login;
import db.TA.classDAO.assistantApplyDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

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