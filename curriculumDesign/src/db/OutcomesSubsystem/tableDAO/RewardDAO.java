package db.OutcomesSubsystem.tableDAO;

import db.OutcomesSubsystem.table.Reward;

public interface RewardDAO {
    void insertReward(Reward reward) throws Exception;
    Reward selectReward(String RNO) throws Exception;
    void deleteReward(String RNO) throws Exception;
}
