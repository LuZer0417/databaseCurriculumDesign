package db.DAO.classDAOImpl;
import db.DAO.Utils.SearchCriteria;
import db.DAO.classDAO.TeacherDAO;
import db.DAO.dbconnection.ConnectionImpl;
import db.publicClass_.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class TeacherDAOImpl  extends ConnectionImpl implements TeacherDAO {
    private static final String TEACHER_INSERT_SQL = "INSERT INTO teacher(teacher_id,teacher_name,major_id,is_tutor,is_leader,is_teacher) VALUES(?,?,?,?,?,?) ";
    private static final String TEACHER_DELETE_SQL = "delete from teacher where teacher_id=?";
    private static final String TEACHER_UPDATE_SQL = "update teacher set teacher_name=?,major_id=?,is_tutor=?,is_leader=?,is_teacher=? where teacher_id=?";
    private static final String TEACHER_SELECT_SQL = "SELECT teacher_id,teacher_name,major_id,is_tutor,is_leader,is_teacher FROM teacher WHERE teacher_id=?";

    @Override
    public void addTeacher(Teacher teacher) {
        Connection con = null;
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(TEACHER_INSERT_SQL);
            psmt.setString(1, teacher.getT_id());
            psmt.setString(2, teacher.getT_name());
            psmt.setString(3, teacher.getMajor_id());
            psmt.setString(4, Boolean.toString(teacher.isIs_tutor()));// 这里需要把Boolean类型转String
            psmt.setString(5, Boolean.toString(teacher.isIs_leader()));
            psmt.setString(6, Boolean.toString(teacher.isIs_teacher()));

            psmt.executeUpdate();

            System.out.println("成功输入"+teacher.getT_name()+"老师的信息！");
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
    public void updateTeacher(Teacher teacher) {
        Connection con = null;
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(TEACHER_UPDATE_SQL);
            psmt.setString(1, teacher.getT_name());
            psmt.setString(2, teacher.getMajor_id());
            psmt.setString(3, Boolean.toString(teacher.isIs_tutor()));
            psmt.setString(4, Boolean.toString(teacher.isIs_leader()));
            psmt.setString(5, Boolean.toString(teacher.isIs_teacher()));
            psmt.setString(6, teacher.getT_id());
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
    public void deleteTeacher(String teacher_id) {
        Connection con = null;
        // Teacher student = new Teacher();
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(TEACHER_DELETE_SQL);
            psmt.setString(1, teacher_id);
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
    public Teacher getTeacher(String teacher_id) {
        Connection con = null;
        Teacher teacher = new Teacher();
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(TEACHER_SELECT_SQL);
            psmt.setString(1, teacher_id);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()){
                teacher.setT_id(rs.getString("teacher_id"));
                teacher.setT_name(rs.getString("teacher_name"));
                teacher.setMajor_id(rs.getString("major_id"));
                teacher.setIs_tutor(rs.getBoolean("is_tutor"));
                teacher.setIs_leader(rs.getBoolean("is_leader"));
                teacher.setIs_teacher(rs.getBoolean("is_teacher"));
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

        return teacher;
    }

    @Override
    public void Select1(String major_id){
        Connection con = null;
        String sql="SELECT FROM teacher WHERE major_id=?";
        Teacher teacher = new Teacher();
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, major_id);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()){
                teacher.setT_id(rs.getString("teacher_id"));
                teacher.setT_name(rs.getString("teacher_name"));
                teacher.setMajor_id(rs.getString("major_id"));
                teacher.setIs_tutor(rs.getBoolean("is_tutor"));
                teacher.setIs_leader(rs.getBoolean("is_leader"));
                teacher.setIs_teacher(rs.getBoolean("is_teacher"));
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

