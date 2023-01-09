package db.OutcomesSubsystem.tableDAOImpl;

import db.DAO.dbconnection.ConnectionImpl;
import db.OutcomesSubsystem.table.Standard;
import db.OutcomesSubsystem.tableDAO.StandardDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StandardDAOImpl extends ConnectionImpl implements StandardDAO {

    //添加标准
    public void insertStandard(Standard standard) throws Exception {
        Connection con = null;
        String sql = "insert into standard(RNO,standard_type,standard_time,standard_source) values(?,?,?,?)";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1,standard.getRNO());
        psmt.setString(2,standard.getStandard_type());
        psmt.setString(3,standard.getStandard_time());
        psmt.setString(4,standard.getStandard_source());
        psmt.executeUpdate();
        con.close();
    }

    //查询标准
    public Standard selectStandard(String RNO) throws Exception {
        Connection con = null;
        String sql = "select * from standard where RNO=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1,RNO);
        ResultSet rs = psmt.executeQuery();

        Standard s = new Standard();
        while (rs.next()) {
            s.setRNO(rs.getString(1));
            s.setStandard_type(rs.getString(2));
            s.setStandard_time(rs.getString(3));
            s.setStandard_source(rs.getString(4));
        }
        psmt.close();
        con.close();
        return s;
    }

    //删除标准
    public void deleteStandard(String RNO) throws Exception {
        Connection con = null;
        String sql = "delete from standard where RNO=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);

        psmt.setString(1,RNO);
        psmt.executeUpdate();
    }

}
