package db.OutcomesSubsystem.tableDAOImpl;

import db.DAO.dbconnection.ConnectionImpl;
import db.OutcomesSubsystem.table.Paper;
import db.OutcomesSubsystem.tableDAO.PaperDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PaperDAOImpl extends ConnectionImpl implements PaperDAO {

    //添加论文
    public void insertPaper(Paper paper) throws Exception {
        Connection con = null;
        String sql = "insert into paper(RNO,paper_name,paper_magzine,paper_state,paper_time,index_type,store,paper_source) values(?,?,?,?,?,?,?,?)";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1,paper.getRNO());
        psmt.setString(2,paper.getPaper_name());
        psmt.setString(3,paper.getPaper_magazine());
        psmt.setString(4,paper.getPaper_state());
        psmt.setString(5,paper.getPaper_time());
        psmt.setString(6,paper.getIndex_typr());
        psmt.setString(7,paper.getStore());
        psmt.setString(8,paper.getPaper_source());
        psmt.executeUpdate();
        con.close();
    }

    //查找论文
    public Paper selectPaper(String RNO) throws Exception {
        Connection con = null;
        String sql = "select * from paper where RNO=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1,RNO);
        ResultSet rs = psmt.executeQuery();

        Paper p = new Paper();
        while (rs.next()) {
            p.setRNO(rs.getString(1));
            p.setPaper_name(rs.getString(2));
            p.setPaper_magazine(rs.getString(3));
            p.setPaper_state(rs.getString(4));
            p.setPaper_time(rs.getString(5));
            p.setIndex_typr(rs.getString(6));
            p.setStore(rs.getString(7));
            p.setPaper_source(rs.getString(8));
        }
        psmt.close();
        con.close();
        return p;
    }

    //删除论文
    public void deletePaper(String RNO) throws Exception {
        Connection con = null;
        String sql = "delete from paper where RNO=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);

        psmt.setString(1,RNO);
        psmt.executeUpdate();
    }

}
