package db.DAO.classDAOImpl;

import db.DAO.Utils.SearchCriteria;
import db.DAO.classDAO.ManagerDAO;
import db.DAO.dbconnection.ConnectionImpl;
import db.publicClass_.Manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class ManagerDAOImpl  extends ConnectionImpl implements ManagerDAO {

    private static final String MANAGER_INSERT_SQL = "INSERT INTO manager(m_id,m_name,m_tel) VALUES(?,?,?) ";
    private static final String MANAGER_DELETE_SQL = "delete from manager where m_id=?";
    private static final String MANAGER_UPDATE_SQL = "update manager set m_name=?,m_tel=? where m_id=?";
    private static final String MANAGER_SELECT_SQL = "SELECT m_id,m_name,m_tel FROM manager WHERE m_id=?";
    //private static final String STUDENT_SELECT_ALL_SQL = "SELECT Sno,Sn,Sex,Class,Birthdate,Telephone FROM student WHERE Sno=?";

    @Override
    public void addManager(Manager manager) {
        Connection con = null;
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(MANAGER_INSERT_SQL);
            psmt.setString(1, manager.getM_id());
            psmt.setString(2, manager.getM_name());
            psmt.setString(3, manager.getM_tel());
            psmt.executeUpdate();
            System.out.println("成功输入"+manager.getM_name()+"同学的信息！");
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
    public void updateManager(Manager manager) {
        Connection con = null;
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(MANAGER_UPDATE_SQL);
            psmt.setString(1, manager.getM_name());
            psmt.setString(3, manager.getM_id());
            psmt.setString(2, manager.getM_tel());

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
    public void deleteManager(String manager_id) {
        Connection con = null;
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(MANAGER_DELETE_SQL);
            psmt.setString(1, manager_id);
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
    public Manager getManager(String manager_id) {
        Connection con = null;
        Manager manager = new Manager();

        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(MANAGER_SELECT_SQL);
            psmt.setString(1, manager_id);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()){
                manager.setM_id(rs.getString("m_id"));
                manager.setM_name(rs.getString("m_name"));
                manager.setM_tel(rs.getString("m_tel"));
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
        return manager;
    }

    @Override
    public List<Manager> findStudent(SearchCriteria searchCriteria) {
        return null;
    }
}
