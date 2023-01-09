package db.OutcomesSubsystem.tableDAOImpl;

import db.DAO.dbconnection.ConnectionImpl;
import db.OutcomesSubsystem.table.Reward;
import db.OutcomesSubsystem.tableDAO.RewardDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RewardDAOImpl extends ConnectionImpl implements RewardDAO {

    //增加奖励
    public void insertReward(Reward reward) throws Exception {
        Connection con = null;
        String sql = "insert into reward(RNO,reward_name,reward_type,reward_level,reward_rank,reward_time,reward_source) values(?,?,?,?,?,?,?)";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1,reward.getRNO());
        psmt.setString(2,reward.getReward_name());
        psmt.setString(3,reward.getReward_type());
        psmt.setString(4,reward.getReward_level());
        psmt.setString(5,reward.getReward_rank());
        psmt.setString(6,reward.getReward_time());
        psmt.setString(7,reward.getReward_source());
        psmt.executeUpdate();
        con.close();
    }

    //查询奖励
    public Reward selectReward(String RNO) throws Exception {
        Connection con = null;
        String sql = "select * from reward where RNO=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1,RNO);
        ResultSet rs = psmt.executeQuery();

        Reward r = new Reward();
        while (rs.next()) {
            r.setRNO(rs.getString(1));
            r.setReward_name(rs.getString(2));
            r.setReward_type(rs.getString(3));
            r.setReward_level(rs.getString(4));
            r.setReward_rank(rs.getString(5));
            r.setReward_time(rs.getString(6));
            r.setReward_source(rs.getString(7));
        }
        psmt.close();
        con.close();
        return r;
    }

    //删除奖励
    public void deleteReward(String RNO) throws Exception {
        Connection con = null;
        String sql = "delete from reward where RNO=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);

        psmt.setString(1,RNO);
        psmt.executeUpdate();
    }

}
