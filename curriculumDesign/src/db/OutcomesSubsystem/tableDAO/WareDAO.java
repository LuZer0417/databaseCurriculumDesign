package db.OutcomesSubsystem.tableDAO;

import db.OutcomesSubsystem.table.Ware;

public interface WareDAO {
    void insertWare(Ware ware) throws Exception;
    Ware selectWare(String RNO) throws Exception;
    void deleteWare(String RNO) throws Exception;
}
