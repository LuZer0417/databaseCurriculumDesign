package db.OutcomesSubsystem.tableDAOImpl;

import db.DAO.dbconnection.ConnectionImpl;
import db.OutcomesSubsystem.table.Other;
import db.OutcomesSubsystem.tableDAO.OtherDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OtherDAOImpl extends ConnectionImpl implements OtherDAO {
    //添加其它成果
    public void insertOther(Other other) throws Exception {
        Connection con = null;
        String sql = "insert into Other(RNO,result_describe) values(?,?)";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1,other.getRNO());
        psmt.setString(2,other.getResult_describe());
        psmt.executeUpdate();
        con.close();
    }

    //查询其他成果
    public Other selectOther(String RNO) throws Exception {
        Connection con = null;
        String sql = "select * from other where RNO=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1,RNO);
        ResultSet rs = psmt.executeQuery();

        Other o = new Other();
        while (rs.next()) {
            o.setRNO(rs.getString(1));
            o.setResult_describe(rs.getString(2));
        }
        psmt.close();
        con.close();
        return o;
    }

    //删除其他成果
    public void deleteOther(String RNO) throws Exception {
        Connection con = null;
        String sql = "delete from other where RNO=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);

        psmt.setString(1,RNO);
        psmt.executeUpdate();

    }
}
