package db.TA.classDAOImpl;

import db.DAO.dbconnection.ConnectionImpl;
import db.TA.classDAO.courseAssistantDAO;
import db.TA.class_.courseAssistant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class courseAssistantImpl extends ConnectionImpl implements courseAssistantDAO {

    //添加一条完整的记录
    public void addAssistant(courseAssistant assis){
        Connection con = null;
        String sql="INSERT INTO course_assistant(s_id,c_id) VALUES(?,?)";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1,assis.getS_id());
            psmt.setString(2,assis.getC_id());
            psmt.executeUpdate();
            System.out.println("成功输入该助教的信息！");
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

    //教师功能3：查看自身课程和助教的相关信息
    public void select_CourseAndStu(String t_id){
        Connection con = null;
        String sql="select c_id,c_name,c_size,c_start_time, s_id,s_name,major_id,tutor_id,s_type form course,student,course_assistant \n" +
                "where course.c_teacher_id =?\n" +
                "and course.c_id = course_assistant.c_id\n" +
                "and student.s_id = course_assistant.s_id";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1,t_id);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()){
                String cid=rs.getString(1);
                String cname=rs.getString(2);
                String csize=rs.getString(3);
                String start_time=rs.getString(4);
                String sid=rs.getString(5);
                String sname=rs.getString(6);
                String majorid=rs.getString(7);
                String tutorid=rs.getString(8);
                String stype=rs.getString(9);
                System.out.println("打印一下学生信息。补充");
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
