package db.OutcomesSubsystem.tableDAOImpl;

import db.DAO.dbconnection.ConnectionImpl;
import db.OutcomesSubsystem.table.Result;
import db.OutcomesSubsystem.tableDAO.ResultDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ResultDAOImpl extends ConnectionImpl implements ResultDAO {

    /*
     添加成果基本信息
     */
    public void insertResult(Result result) throws Exception {
        Connection con = null;
        String sql = "insert into results(RNO,stu_id,degree,result_class,state_teacher,state_manager) values(?,?,?,?,?,?)";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1,result.getRNO());
        psmt.setString(2,result.getStu_id());
        psmt.setString(3,result.getDegree());
        psmt.setString(4,result.getResult_class());
        psmt.setString(5,result.getState_teacher());
        psmt.setString(6,result.getState_manager());
        psmt.executeUpdate();
        con.close();
    }

    /*
     根据成果id查询指定学生的成果基本信息
     */
    public Result selectResult(String RNO) throws Exception {
        Connection con = null;
        String sql = "select * from results where RNO=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1,RNO);
        ResultSet rs = psmt.executeQuery();

        Result r = new Result();
        while (rs.next()) {
            r.setRNO(rs.getString(1));
            r.setStu_id(rs.getString(2));
            r.setDegree(rs.getString(3));
            r.setResult_class(rs.getString(4));
            r.setState_teacher(rs.getString(5));
            r.setState_manager(rs.getString(6));
        }
        psmt.close();
        con.close();
        return r;
    }

    /*
     根据学生id查询该同学的全部成果基本信息
     */

    /*
     根据成果id进行初审状态更改
     */
    public void updateFirCensor(String RNO) throws Exception {
        String sql = "update results set state_teacher=? where RNO=?";
        Connection con = null;
        con = getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,"通过");
        ps.setString(2,RNO);
        ps.executeUpdate();
    }

    /*
     根据成果id进行终审状态更改
     */
    public void updateSecCensor(String RNO) throws Exception {
        String sql = "update results set state_manager=? where RNO=?";
        Connection con = null;
        con = getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,"通过");
        ps.setString(2,RNO);
        ps.executeUpdate();
    }

    /*
     根据成果id对指定成果基本信息进行删除
     */
    public void deleteResult(String RNO) throws Exception {
        Connection con = null;
        String sql = "delete from results where RNO=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);

        psmt.setString(1,RNO);
        psmt.executeUpdate();
    }

}
