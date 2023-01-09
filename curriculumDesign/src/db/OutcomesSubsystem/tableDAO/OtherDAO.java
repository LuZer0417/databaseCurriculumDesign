package db.OutcomesSubsystem.tableDAO;

import db.OutcomesSubsystem.table.Other;

public interface OtherDAO {
    void insertOther(Other other) throws Exception;
    Other selectOther(String RNO) throws Exception;
    void deleteOther(String RNO) throws Exception;
}
