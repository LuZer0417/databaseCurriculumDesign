package db.DAO.classDAOImpl;

import db.DAO.Utils.SearchCriteria;
import db.DAO.classDAO.CourseDAO;
import db.DAO.dbconnection.ConnectionImpl;
import db.publicClass_.Course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class CourseDAOImpl  extends ConnectionImpl implements CourseDAO {

    private static final String COURSE_INSERT_SQL = "INSERT INTO course(c_id,c_name,is_compulsory,c_size,c_credit,c_target_stu,c_start_time,c_hour,c_priority,c_with_TA,assistant_id,c_teacher_id) VALUES(?,?,?,?,?,?,?,?,?,?,?,?) ";
    private static final String COURSE_DELETE_SQL = "delete from course where c_id=?";
    private static final String COURSE_UPDATE_SQL = "update course set c_name=?,is_compulsory=?,c_size=?,c_credit=?,c_target_stu=?,c_start_time=?,c_hour=?,c_priority=?,c_with_TA=?,assistant_id=?,c_teacher_id=? where c_id=?";
    private static final String COURSE_SELECT_SQL = "SELECT c_id,c_name,is_compulsory,c_size,c_credit,c_target_stu,c_start_time,c_hour,c_priority,c_with_TA,assistant_id,c_teacher_id FROM course WHERE c_id=?";
    //private static final String STUDENT_SELECT_ALL_SQL = "SELECT Sno,Sn,Sex,Class,Birthdate,Telephone FROM student WHERE Sno=?";

    @Override
    public void addCourse(Course course) {
        Connection con = null;
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(COURSE_INSERT_SQL);
            psmt.setString(1, course.getC_id());
            psmt.setString(2, course.getC_name());
            psmt.setString(3, Boolean.toString(course.isIs_compulsory()));
            psmt.setString(4, Integer.toString(course.getC_size()));
            psmt.setString(5, Integer.toString(course.getC_credit()));
            psmt.setString(6, course.getC_target_stu());
            psmt.setString(7, course.getC_start_time());
            psmt.setString(8, Integer.toString(course.getC_hour()));
            psmt.setString(9, Integer.toString(course.getC_priority()));
            psmt.setString(10, Boolean.toString(course.isC_with_TA()));
            psmt.setString(11, course.getAssistant_id());
            psmt.setString(12, course.getC_teacher_id());

            psmt.executeUpdate();

            System.out.println("成功输入"+course.getC_name()+"同学的信息！");
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
    public void updateCourse(Course course) {
        Connection con = null;
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(COURSE_UPDATE_SQL);

            psmt.setString(1, course.getC_name());
            psmt.setString(2, Boolean.toString(course.isIs_compulsory()));
            psmt.setString(3, Integer.toString(course.getC_size()));
            psmt.setString(4, Integer.toString(course.getC_credit()));
            psmt.setString(5, course.getC_target_stu());
            psmt.setString(6, course.getC_start_time());
            psmt.setString(7, Integer.toString(course.getC_hour()));
            psmt.setString(8, Integer.toString(course.getC_priority()));
            psmt.setString(9, Boolean.toString(course.isC_with_TA()));
            psmt.setString(10, course.getAssistant_id());
            psmt.setString(11, course.getC_teacher_id());
            psmt.setString(12, course.getC_id());

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
    public void deleteCourse(String course_id) {
        Connection con = null;
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(COURSE_DELETE_SQL);
            psmt.setString(1, course_id);
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
    public Course getCourse(String course_id) {
        Connection con = null;
        Course course = new Course();

        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(COURSE_SELECT_SQL);
            psmt.setString(1, course_id);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()){
                course.setC_id(rs.getString("c_id"));
                course.setC_name(rs.getString("c_name"));
                course.setC_name(rs.getString("is_compulsory"));
                course.setC_name(rs.getString("c_size"));
                course.setC_name(rs.getString("c_credit"));
                course.setC_name(rs.getString("c_target_stu"));
                course.setC_name(rs.getString("c_start_time"));
                course.setC_name(rs.getString("c_hour"));
                course.setC_name(rs.getString("c_priority"));
                course.setC_name(rs.getString("c_with_TA"));
                course.setC_name(rs.getString("assistant_id"));
                course.setC_name(rs.getString("c_teacher_id"));

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

        return course;
    }

    @Override
    public List<Course> findStudent(SearchCriteria searchCriteria) {
        return null;
    }

    //TA:学生功能3-对当前需要助教的课程进行提交助教申请
    public void SearchCourse1(){
        String sql="SELECT c_id,c_name,c_size,c_hour FROM course WHERE c_with_TA=0";
        Connection con = null;
        try{
            con=getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            ResultSet rs = psmt.executeQuery();
            System.out.println("课程号    课程名称   课程容量    课时数");
            while (rs.next()){
                String cid=rs.getString(1);
                String cname=rs.getString(2);
                String csize=rs.getString(3);
                String chour=rs.getString(4);
                System.out.println(cid+" "+cname+" "+csize+" "+chour+" ");
            }

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

    //TA:教师功能1-将课程状态设置为有助教
    public void updateCourse(String c_id,Boolean with_TA) {
        Connection con = null;
        String sql="update course set c_with_TA=? where c_id=?";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, Boolean.toString(with_TA));
            psmt.setString(2,c_id);
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

