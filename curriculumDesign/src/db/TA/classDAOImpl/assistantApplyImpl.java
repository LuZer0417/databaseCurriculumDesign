package db.TA.classDAOImpl;

import db.DAO.dbconnection.ConnectionImpl;
import db.TA.classDAO.assistantApplyDAO;
import db.TA.class_.assistantApply;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class assistantApplyImpl extends ConnectionImpl implements assistantApplyDAO {

    //学生功能3：对当前需要助教的课程进行提交助教申请
    @Override
    public void addapply(assistantApply apply){
        Connection con = null;
        String sql="INSERT INTO  assistant_apply(s_id,c_id,choice_priority,apply_time,apply_status) VALUES(?,?,?,?,?)";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1,apply.getS_id());
            psmt.setString(2,apply.getC_id());
            psmt.setString(3,apply.getChoice_priority());
            psmt.setString(4,apply.getApply_time());
            psmt.setString(5,apply.getApply_status());
            System.out.println("已成功提交申请！");
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

    //教师功能1：审批学生提交的助教申请，查看该c_id对应课程的申请列表
    @Override
    public void search_apply(String c_id){
        Connection con = null;
        String sql="SELECT * FROM assistant_apply WHERE c_id=?";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, c_id);
            ResultSet rs=psmt.executeQuery();
            while(rs.next()){
                String sid=rs.getString(1);
                String cid=rs.getString(2);
                String choice_priority=rs.getString(3);
                String apply_time=rs.getString(4);
                String apply_status=rs.getString(5);
                System.out.println(sid+" "+cid+" "+choice_priority+" "+apply_time+" "+apply_status);
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

    //教师功能1：审批学生提交的助教申请,设置为通过/不通过
    @Override
    public void update_apply(String Status,String s_id,String c_id){
        Connection con = null;
        String sql="UPDATE assistant_apply SET apply_status=? WHERE s_id=? AND c_id=?";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, Status);
            psmt.setString(2, s_id);
            psmt.setString(3, c_id);
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
