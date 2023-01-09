package db.OutcomesSubsystem.tableDAOImpl;

import db.DAO.dbconnection.ConnectionImpl;
import db.OutcomesSubsystem.table.Patent;
import db.OutcomesSubsystem.tableDAO.PatentDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PatentDAOImpl extends ConnectionImpl implements PatentDAO {

    //添加专利
    public void insertPatent(Patent patent) throws Exception {
        Connection con = null;
        String sql = "insert into patent(RNO,patent_name,patent_type,patent_id,patent_time,patent_state,patent_rank,patent_source) values(?,?,?,?,?,?,?,?)";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1,patent.getRNO());
        psmt.setString(2,patent.getPatent_name());
        psmt.setString(3,patent.getPatent_type());
        psmt.setString(4,patent.getPatent_id());
        psmt.setString(5,patent.getPatent_time());
        psmt.setString(6,patent.getPatent_state());
        psmt.setString(7,patent.getPatent_rank());
        psmt.setString(8,patent.getPatent_source());
        psmt.executeUpdate();
        con.close();
    }

    //查询专利
    public Patent selectPatent(String RNO) throws Exception {
        Connection con = null;
        String sql = "select * from patent where RNO=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1,RNO);
        ResultSet rs = psmt.executeQuery();

        Patent p = new Patent();
        while (rs.next()) {
            p.setRNO(rs.getString(1));
            p.setPatent_name(rs.getString(2));
            p.setPatent_type(rs.getString(3));
            p.setPatent_id(rs.getString(4));
            p.setPatent_time(rs.getString(5));
            p.setPatent_state(rs.getString(6));
            p.setPatent_rank(rs.getString(7));
            p.setPatent_source(rs.getString(8));
        }
        psmt.close();
        con.close();
        return p;
    }

    //删除专利
    public void deletePatent(String RNO) throws Exception {
        Connection con = null;
        String sql = "delete from patent where RNO=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);

        psmt.setString(1,RNO);
        psmt.executeUpdate();
    }

}
