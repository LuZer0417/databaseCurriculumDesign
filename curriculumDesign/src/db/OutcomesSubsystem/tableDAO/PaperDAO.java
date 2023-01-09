package db.OutcomesSubsystem.tableDAO;

import db.OutcomesSubsystem.table.Paper;

public interface PaperDAO {
    void insertPaper(Paper paper) throws Exception;
    Paper selectPaper(String RNO) throws Exception;
    void deletePaper(String RNO) throws Exception;
}
