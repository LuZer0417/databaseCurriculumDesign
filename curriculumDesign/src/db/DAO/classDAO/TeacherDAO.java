package db.DAO.classDAO;
import db.DAO.Utils.SearchCriteria;
import db.publicClass_.Teacher;

import java.util.List;


public interface TeacherDAO {
    // 这里是接口，5个功能：get 和 增、删、改、查

    void addTeacher(Teacher teacher);
    void updateTeacher(Teacher teacher);
    void deleteTeacher(String teacher_id);
    Teacher getStudent(String teacher_id);
    List<Teacher> findStudent(SearchCriteria searchCriteria);




}
