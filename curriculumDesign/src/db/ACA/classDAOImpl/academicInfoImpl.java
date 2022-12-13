package db.ACA.classDAOImpl;

import db.ACA.classDAO.academicInfoDAO;
import db.DAO.dbconnection.ConnectionImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class academicInfoImpl extends ConnectionImpl implements academicInfoDAO {

    //学生功能2： 向导师提交个人的学术交流信息
    @Override
    public void SubmitInfo(String a_id,String a_name,String s_id){
        Connection con = null;
        String sql="INSERT INTO  academic_info(a_id,a_name,s_id) VALUES(?,?,?)";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1,a_id);
            psmt.setString(2,a_name);
            psmt.setString(3,s_id);
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

    //学生功能3.1：查看学术交流信息的审批进度
    @Override
    public void ViewACA_info(String a_id,String s_id){
        Connection con = null;
        String sql="SELECT * FROM academic_info where a_id=?,s_id=?";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, a_id);
            psmt.setString(1, s_id);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()){
                String aid=rs.getString(1);
                String aname=rs.getString(2);
                String sid=rs.getString(3);
                String postscript=rs.getString(4);
                String t_audit=rs.getString(5);
                String m_audit=rs.getString(6);
                System.out.println(aid+" "+aname+" "+sid+" "+postscript+" "+t_audit+" "+m_audit);
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

    //学生功能3.2:撤回已提交的学术交流信息
    @Override
    public void Withdraw_Aplc(String a_id,String s_id){
        Connection con = null;
        String sql="DELETE FROM academic_info where a_id=?,s_id=?";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, a_id);
            psmt.setString(1, s_id);
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

    //教师功能2：审核所指导的学生提交的学术申请，给予同意/不同意
    @Override
    public void Review_aplc1(String t_audit,String a_id,String s_id){
        Connection con = null;
        String sql="UPDATE academic_info SET t_audit=? WHERE a_id=? AND s_id=?";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1,t_audit);
            psmt.setString(2,a_id);
            psmt.setString(3,s_id);
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

    //管理员功能2：审核所指导的学生提交的学术申请，给予同意/不同意
    @Override
    public void Review_aplc2(String m_audit,String a_id,String s_id){
        Connection con = null;
        String sql="UPDATE academic_info SET m_audit=? WHERE a_id=? AND s_id=?";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1,m_audit);
            psmt.setString(2,a_id);
            psmt.setString(3,s_id);
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

    //管理员功能3：查看研究生对应的学术交流信息次数的毕业条件是否满足要求
    @Override
    public void CheckTimes(String s_id){
        Connection con = null;
        String sql="SELECT s_id,COUNT(*)AS a_times FROM academic_info WHERE s_id=? GROUP BY s_id";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, s_id);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()){
                String sid=rs.getString(1);
                String atimes=rs.getString(2);
                System.out.println(sid+" "+atimes);
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
