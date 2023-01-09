package db.OutcomesSubsystem.tableDAO;

import db.OutcomesSubsystem.table.Patent;

public interface PatentDAO {
    void insertPatent(Patent patent) throws Exception;
    Patent selectPatent(String RNO) throws Exception;
    void deletePatent(String RNO) throws Exception;
}
