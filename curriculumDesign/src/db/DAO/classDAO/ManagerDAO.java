package db.DAO.classDAO;

import db.DAO.Utils.SearchCriteria;
import db.publicClass_.Manager;

import java.util.List;

public interface ManagerDAO {
    // 这里是接口，5个功能：get 和 增、删、改、查

    void addManager(Manager manager);
    void updateManager(Manager manager);
    void deleteManager(String manager_id);
    Manager getManager(String manager_id);
    List<Manager> findStudent(SearchCriteria searchCriteria);

}
