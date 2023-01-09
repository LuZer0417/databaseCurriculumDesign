package db.OutcomesSubsystem.tableDAO;

import db.OutcomesSubsystem.table.Standard;

public interface StandardDAO {
    void insertStandard(Standard standard) throws Exception;
    Standard selectStandard(String RNO) throws Exception;
    void deleteStandard(String RNO) throws Exception;
}
