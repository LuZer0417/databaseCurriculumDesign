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
    private static final String COURSE_SELECT_ALL_SQL = "SELECT c_id,c_name,is_compulsory,c_size,c_credit,c_target_stu,c_start_time,c_hour,c_priority,c_with_TA,assistant_id,c_teacher_id FROM course";

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

    public void getAllCourse() {
        Connection con = null;
        Course course = new Course();
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(COURSE_SELECT_ALL_SQL);
            ResultSet rs = psmt.executeQuery();
            System.out.println("课程号\t课程名\t课程类型\t课容量\t学分\t目标学生\t开始时间\t学时\t课程优先级\t有助教\t助教号\t老师ID");
            while (rs.next()){
                course.setC_id(rs.getString("c_id"));
                course.setC_name(rs.getString("c_name"));
                course.setIs_compulsory(rs.getBoolean("is_compulsory"));
                course.setC_size(rs.getInt("c_size"));
                course.setC_credit(rs.getInt("c_credit"));
                course.setC_target_stu(rs.getString("c_target_stu"));
                course.setC_start_time(rs.getString("c_start_time"));
                course.setC_hour(rs.getInt("c_hour"));
                course.setC_priority(rs.getInt("c_priority"));
                course.setC_with_TA(rs.getBoolean("c_with_TA"));
                course.setAssistant_id(rs.getString("assistant_id"));
                course.setC_teacher_id(rs.getString("c_teacher_id"));
                System.out.println(course.getC_id() + "\t" + course.getC_name() + "\t" + course.isIs_compulsory() + "\t" +
                        course.getC_size() + "\t" + course.getC_credit() + "\t" + course.getC_target_stu() + "\t" + course.getC_start_time() + "\t" +
                        course.getC_hour() + "\t" + course.getC_priority() + "\t" + course.isC_with_TA() + "\t" + course.getAssistant_id() + "\t" +
                        course.getC_teacher_id());
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

    //TA:学生功能3-对当前需要助教的课程进行提交助教申请 && 管理员功能4
    public int SearchCourse1(){
        String sql="SELECT c_id,c_name,c_size,c_hour FROM course WHERE c_with_TA=0 ORDER BY c_size DESC,c_hour DESC ";
        Connection con = null;
        try{
            con=getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            ResultSet rs = psmt.executeQuery();
            System.out.println("以下课程还没有助教：");
            System.out.println("课程号\t\t课程名称\t\t课程容量\t\t课时数");

            int  rowCount = 0;

            while (rs.next()){
                String cid=rs.getString(1);
                String cname=rs.getString(2);
                String csize=rs.getString(3);
                String chour=rs.getString(4);
                System.out.println(cid+"\t\t"+cname+"\t\t"+csize+"\t\t"+chour);
                rowCount++;// 看看几行
            }

            return rowCount;

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        return 0;
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


