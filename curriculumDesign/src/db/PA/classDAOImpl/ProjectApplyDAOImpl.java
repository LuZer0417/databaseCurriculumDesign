package db.PA.classDAOImpl;

import db.DAO.dbconnection.ConnectionImpl;
import db.PA.classDAO.ProjectApplyDAO;
import db.PA.class_.ProjectApply;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class ProjectApplyDAOImpl extends ConnectionImpl implements ProjectApplyDAO {
    //学生功能3，学生对项目的申请
    @Override
    public void studentSubmit(ProjectApply pe){
        Connection con = null;
        String sql="INSERT INTO project_apply(s_id,p_id,s_job,p_teacher_adopt,p_manager_adopt) VALUES(?,?,?,?,?)";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1,pe.getS_id());
            psmt.setString(2,pe.getP_id());
            psmt.setString(3,pe.getS_job());
            psmt.setString(4,pe.getP_is_tutor_adopt());
            psmt.setString(5,pe.getP_is_responsible_adopt());
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

    //教师功能2，教师审批学生提交项目的申请
    @Override
    public void teacherExamine(String s_id,String p_id){
        Connection con = null;
        String sql="UPDATE project_apply SET p_teacher_adopt=? WHERE s_id=? AND p_id=?";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1,"通过");
            psmt.setString(2,s_id);
            psmt.setString(3,p_id);
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
    //管理员功能3，管理员对学生提交的项目进行审核
    @Override
    public void managerExamine(String s_id,String p_id){
        Connection con = null;
        String sql="UPDATE project_apply SET p_manager_adopt=? WHERE s_id=? AND p_id=?";
        try{
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1,"通过");
            psmt.setString(2,s_id);
            psmt.setString(3,p_id);
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

    public LinkedList<String> studentView(String s_id) throws Exception {
        Connection con = null;
        String sql = "SELECT * FROM project_apply WHERE s_id=? AND p_manager_adopt=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1, s_id);
        psmt.setString(2, "通过");
        ResultSet rs = psmt.executeQuery();
        LinkedList<String> paList = new LinkedList<String>();
        while (rs.next()) {
            String pid = rs.getString(2);
            paList.add(pid);
        }
        psmt.close();
        return paList;
    }

}
