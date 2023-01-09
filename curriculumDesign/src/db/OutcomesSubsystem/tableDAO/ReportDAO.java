package db.OutcomesSubsystem.tableDAO;

import db.OutcomesSubsystem.table.Report;

public interface ReportDAO {
    void insertReport(Report report) throws Exception;
    Report selectReport(String RNO) throws Exception;
    void deleteReport(String RNO) throws Exception;
}
