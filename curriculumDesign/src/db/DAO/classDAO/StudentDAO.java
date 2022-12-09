package db.DAO.classDAO;

import db.publicClass_.Student;

public interface StudentDAO {
    void addStudent(Student student);
    void deleteStudent(String student_no);
    void updateStudent(Student student);
    Student getStudent(String student_no);
}
