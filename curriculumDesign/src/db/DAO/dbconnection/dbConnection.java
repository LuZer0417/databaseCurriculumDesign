package db.DAO.dbconnection;
import java.sql.Connection;

public interface dbConnection {
    Connection getConnection() throws Exception;// 接口
    //Connection getDBclose();
}
