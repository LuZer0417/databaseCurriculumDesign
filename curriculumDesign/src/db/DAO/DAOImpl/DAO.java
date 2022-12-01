package db.DAO.DAOImpl;
import java.sql.Connection;

public interface DAO {
    Connection getConnection() throws Exception;// 接口
}
