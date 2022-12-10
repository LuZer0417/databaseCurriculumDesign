package db.DAO.classDAO;

import db.DAO.Utils.SearchCriteria;
import db.publicClass_.Course;

import java.util.List;

public interface CourseDAO {

    void addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourse(String course_id);
    Course getCourse(String course_id);
    List<Course> findStudent(SearchCriteria searchCriteria);



}
