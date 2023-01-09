package db.PA.classDAOImpl;

import db.DAO.dbconnection.ConnectionImpl;
import db.PA.classDAO.ProjectDAO;
import db.PA.class_.Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class ProjectDAOImpl extends ConnectionImpl implements ProjectDAO {

    public void studentViewTeacher(String p_responsible_id) {
        Connection con = null;
        String sql = "SELECT * FROM project WHERE p_responsible_id=?";
        System.out.println("项目ID\t项目名称\t项目状态\t项目负责人ID\t项目类型\t项目经费\t开始时间\t结束时间\t是否通过");
        try {
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, p_responsible_id);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                String pid = rs.getString(1);
                String pname = rs.getString(2);
                String pstatus = rs.getString(3);
                String presponsible = rs.getString(4);
                String ptype = rs.getString(5);
                String pfunds=rs.getString(6);
                String pbegin=rs.getString(7);
                String pend=rs.getString(8);
                String pisadopt=rs.getString(9);
                System.out.println(pid + "\t" + pname + "\t" + pstatus + "\t" + presponsible + "\t" + ptype+"\t"+pfunds+"\t"+pbegin+"\t"+pend+"\t"+pisadopt);
            }
            psmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Project studentSelfView(String p_id) throws Exception {
        Connection con = null;
        con = getConnection();
            String sql="SELECT * FROM project WHERE p_id=?";
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, p_id);
            ResultSet rs = psmt.executeQuery();
        Project p = new Project();
            while(rs.next()){
                String pid = rs.getString(1);
                String pname = rs.getString(2);
                String pstatus = rs.getString(3);
                String presponsible = rs.getString(4);
                String ptype = rs.getString(5);
                String pfunds=rs.getString(6);
                String pbegin=rs.getString(7);
                String pend=rs.getString(8);
                String pisadopt=rs.getString(9);
                p.setP_id(pid);
                p.setP_name(pname);
                p.setP_begin_time(pbegin);
                p.setP_end_time(pend);
                p.setP_status(pstatus);
                p.setP_responsible_id(presponsible);
                p.setP_type(ptype);
                p.setP_funds(pfunds);
                p.setP_is_adopt(pisadopt);
            }
        psmt.close();
        return p;
    }

    public void teacherSelfView(String p_responsible_id){
        Connection con = null;
        String sql="SELECT * FROM project WHERE p_responsible_id=?";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, p_responsible_id);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()){
                String pid = rs.getString(1);
                String pname = rs.getString(2);
                String pstatus = rs.getString(3);
                String presponsible = rs.getString(4);
                String ptype = rs.getString(5);
                String pfunds=rs.getString(6);
                String pbegin=rs.getString(7);
                String pend=rs.getString(8);
                String pisadopt=rs.getString(9);
                System.out.println(pid + "\t" + pname + "\t" + pstatus + "\t" + presponsible + "\t" + ptype+"\t"+pfunds+"\t"+pbegin+"\t"+pend+"\t"+pisadopt);
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

    public void leaderSetBudget(String p_id,String budget) throws Exception {
        String sql = "update project set p_funds=? where p_id=?";
        Connection con = null;
        con = getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,budget);
        ps.setString(2,p_id);
        ps.executeUpdate();
    }

    public void leaderExamine(String p_id) throws Exception {
        String sql = "update project set p_is_adopt=? where p_id=?";
        Connection con = null;
        con = getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,"通过");
        ps.setString(2,p_id);
        ps.executeUpdate();
    }

    public void managerApply(Project PA){
        Connection con = null;
        String sql="INSERT INTO project(p_id,p_name,p_status,p_responsible_id,p_type,p_funds,p_begin_time,p_end_time,p_is_adopt) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1,PA.getP_id() );
            psmt.setString(2, PA.getP_name());
            psmt.setString(3, PA.getP_status());
            psmt.setString(4, PA.getP_responsible_id());
            psmt.setString(5, PA.getP_type());
            psmt.setString(6,PA.getP_funds());
            psmt.setString(7,PA.getP_begin_time());
            psmt.setString(8,PA.getP_end_time());
            psmt.setString(9,PA.getP_is_adopt());
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
