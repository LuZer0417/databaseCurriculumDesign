package db.OutcomesSubsystem.tableDAOImpl;

import db.DAO.dbconnection.ConnectionImpl;
import db.OutcomesSubsystem.table.Report;
import db.OutcomesSubsystem.tableDAO.ReportDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReportDAOImpl extends ConnectionImpl implements ReportDAO {

    //添加报告
    public void insertReport(Report report) throws Exception {
        Connection con = null;
        String sql = "insert into report(RNO,report_name,report_type,report_company,report_time,report_rank,report_source) values(?,?,?,?,?,?,?)";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1,report.getRNO());
        psmt.setString(2,report.getReport_name());
        psmt.setString(3,report.getReport_type());
        psmt.setString(4,report.getReport_company());
        psmt.setString(5,report.getReport_time());
        psmt.setString(6,report.getReport_rank());
        psmt.setString(7,report.getReport_source());
        psmt.executeUpdate();
        con.close();
    }

    //查询报告
    public Report selectReport(String RNO) throws Exception {
        Connection con = null;
        String sql = "select * from report where RNO=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1,RNO);
        ResultSet rs = psmt.executeQuery();

        Report r = new Report();
        while (rs.next()) {
            r.setRNO(rs.getString(1));
            r.setReport_name(rs.getString(2));
            r.setReport_type(rs.getString(3));
            r.setReport_company(rs.getString(4));
            r.setReport_time(rs.getString(5));
            r.setReport_rank(rs.getString(6));
            r.setReport_source(rs.getString(7));
        }
        psmt.close();
        con.close();
        return r;
    }

    //删除报告
    public void deleteReport(String RNO) throws Exception {
        Connection con = null;
        String sql = "delete from report where RNO=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);

        psmt.setString(1,RNO);
        psmt.executeUpdate();
    }

}
