package db.DAO.classDAOImpl;
import db.DAO.Utils.SearchCriteria;
import db.DAO.classDAO.StudentDAO;
import db.DAO.dbconnection.ConnectionImpl;
import db.publicClass_.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class StudentDAOImpl extends ConnectionImpl implements StudentDAO {
    private static final String STUDENT_INSERT_SQL = "INSERT INTO student(s_id,s_name,major_id,tutor_id,s_type) VALUES(?,?,?,?,?) ";
    private static final String STUDENT_DELETE_SQL = "delete from student where s_id=?";
    private static final String STUDENT_UPDATE_SQL = "update student set s_name=?,major_id=?,tutor_id=?,s_type=? where s_id=?";
    private static final String STUDENT_SELECT_SQL = "SELECT s_id,s_name,major_id,tutor_id,s_type FROM student WHERE s_id=?";
    //private static final String STUDENT_SELECT_ALL_SQL = "SELECT Sno,Sn,Sex,Class,Birthdate,Telephone FROM student WHERE Sno=?";


    @Override
    public void addStudent(Student student) {
        Connection con = null;
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(STUDENT_INSERT_SQL);
            psmt.setString(1, student.getS_id());
            psmt.setString(2, student.getS_name());
            psmt.setString(3, student.getMajor_id());
            psmt.setString(4, student.getTutor_id());
            psmt.setString(5, student.getS_type());
            psmt.executeUpdate();

            System.out.println("成功输入"+student.getS_name()+"同学的信息！");
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

    // display 不是必须写的
    public void display(){
        Connection con = null;
        try{
            con=getConnection();
            PreparedStatement psmt=con.prepareStatement("select * from student");
            ResultSet rs=psmt.executeQuery();
            while(rs.next()){
                String id=rs.getString(1);
                String name=rs.getString(2);
                String major=rs.getString(3);
                String tutor=rs.getString(4);
                String type=rs.getString(5);
                System.out.println(id+" "+name+" "+major+" "+tutor+" "+type);
            }
            rs.close();
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
    public void deleteStudent(String s_id) {
        Connection con = null;
        Student student = new Student();
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(STUDENT_DELETE_SQL);
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

    @Override
    public void updateStudent(Student student) {
        Connection con = null;
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(STUDENT_UPDATE_SQL);
            psmt.setString(1, student.getS_name());
            psmt.setString(2, student.getMajor_id());
            psmt.setString(3, student.getTutor_id());
            psmt.setString(4, student.getS_type());
            psmt.setString(5, student.getS_id());
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
    public Student getStudent(String student_no) {
        Connection con = null;
        Student student = new Student();

        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(STUDENT_SELECT_SQL);
            psmt.setString(1, student_no);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()){
                student.setS_id(rs.getString("s_id"));
                student.setS_name(rs.getString("s_name"));
                student.setMajor_id(rs.getString("major_id"));
                student.setTutor_id(rs.getString("tutor_id"));
                student.setS_type(rs.getString("s_type"));
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

        return student;
    }

    @Override
    //
    public List<Student> findStudent(SearchCriteria searchCriteria) {
        return null;
    }

}
