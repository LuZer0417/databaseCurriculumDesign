package db.ACA.classDAOImpl;

import db.ACA.classDAO.academicActivityDAO;
import db.ACA.class_.academicActivity;
import db.DAO.dbconnection.ConnectionImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class academicActivityImpl extends ConnectionImpl implements academicActivityDAO {

    //学生功能1：查看个人可以参加的学术交流活动
    @Override
    public void SearchACA_activities(){
        Connection con = null;
        String sql="SELECT * FROM academic_activity";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()){
                String aid=rs.getString(1);
                String aname=rs.getString(2);
                String a_address=rs.getString(3);
                String asubject=rs.getString(4);
                String adate=rs.getString(5);
                System.out.println(aid+" "+aname+" "+a_address+" "+asubject+" "+adate);
            }
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

    //教师功能1：使用关键字查询指定学术交流信息
    @Override
    public void ViewACA_activities(String a_id){
        Connection con = null;
        String sql="SELECT FROM academic_activity WHERE a_id=?";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, a_id);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()){
                String aid=rs.getString(1);
                String aname=rs.getString(2);
                String a_address=rs.getString(3);
                String asubject=rs.getString(4);
                String adate=rs.getString(5);
                System.out.println(aid+" "+aname+" "+a_address+" "+asubject+" "+adate);
            }
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

    //教师功能3：发布该学科可参与的学术交流活动信息
    @Override
    public void PostACA_activities(academicActivity ACA){
        Connection con = null;
        String sql="INSERT INTO  academic_activity(a_id,a_name,a_address,a_subject,a_date) VALUES(?,?,?,?,?)";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, ACA.getA_id());
            psmt.setString(2, ACA.getA_name());
            psmt.setString(3, ACA.getA_address());
            psmt.setString(4, ACA.getA_subject());
            psmt.setString(5, ACA.getA_date());
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