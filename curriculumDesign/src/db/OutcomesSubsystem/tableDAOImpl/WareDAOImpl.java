package db.OutcomesSubsystem.tableDAOImpl;

import db.DAO.dbconnection.ConnectionImpl;
import db.OutcomesSubsystem.table.Ware;
import db.OutcomesSubsystem.tableDAO.WareDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class WareDAOImpl extends ConnectionImpl implements WareDAO {

    //添加平台
    public void insertWare(Ware ware) throws Exception {
        Connection con = null;
        String sql = "insert into ware(RNO,ware_name,ware_company,ware_time,ware_rank,ware_source) values(?,?,?,?,?,?)";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1,ware.getRNO());
        psmt.setString(2,ware.getWare_name());
        psmt.setString(3,ware.getWare_company());
        psmt.setString(4,ware.getWare_time());
        psmt.setString(5,ware.getWare_rank());
        psmt.setString(6,ware.getWare_source());
        psmt.executeUpdate();
        con.close();
    }

    //查询平台
    public Ware selectWare(String RNO) throws Exception {
        Connection con = null;
        String sql = "select * from ware where RNO=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1,RNO);
        ResultSet rs = psmt.executeQuery();

        Ware w = new Ware();
        while (rs.next()) {
            w.setRNO(rs.getString(1));
            w.setWare_name(rs.getString(2));
            w.setWare_company(rs.getString(3));
            w.setWare_time(rs.getString(4));
            w.setWare_rank(rs.getString(5));
            w.setWare_source(rs.getString(6));
        }
        psmt.close();
        con.close();
        return w;
    }

    //删除平台
    public void deleteWare(String RNO) throws Exception {
        Connection con = null;
        String sql = "delete from ware where RNO=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);

        psmt.setString(1,RNO);
        psmt.executeUpdate();
    }


}
