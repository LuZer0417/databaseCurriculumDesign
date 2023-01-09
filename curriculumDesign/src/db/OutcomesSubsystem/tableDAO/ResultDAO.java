package db.OutcomesSubsystem.tableDAO;

import db.OutcomesSubsystem.table.Result;

public interface ResultDAO {
    void insertResult(Result result)throws Exception;
    Result selectResult(String RNO) throws Exception;
    void deleteResult(String RNO) throws Exception;
    void updateFirCensor(String RNO) throws Exception;
    void updateSecCensor(String RNO) throws Exception;
}
