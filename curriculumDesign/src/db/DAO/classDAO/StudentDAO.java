package db.DAO.classDAO;

import db.DAO.Utils.SearchCriteria;
import db.publicClass_.Student;

import java.util.List;

public interface StudentDAO {
    // 这里是接口，5个功能：get 和 增、删、改、查

    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(String student_no);
    Student getStudent(String student_no);
    void Select1(String major_id);


}
