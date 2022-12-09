package db.DAO.classDAOImpl;

import db.DAO.classDAO.CourseDAO;
import db.DAO.classDAO.ManagerDAO;
import db.DAO.classDAO.TeacherDAO;
import db.DAO.classDAOImpl.CourseDAOImpl;
import db.DAO.classDAO.StudentDAO;

public class DAOFactory {
    private static DAOFactory daoFactory;
    //private StudentDAOImpl studentImpl;

    static {daoFactory = new DAOFactory();}
    private DAOFactory(){
    }

    //后面函数理解：getinstance用来返回一个工厂实例，返回的工厂实例再去调用自身的方法
    public static DAOFactory getInstance(){
        return daoFactory;
    }

/*    public StudentDAOImpl getStuImap() {
        if(studentImpl==null)
            studentImpl=new StudentDAOImpl();
        return studentImpl;
    }*/

    public static StudentDAO getStudentDAO(){
        return new StudentDAOImpl();
    }

    public static CourseDAO getCourseDAO(){
        return new CourseDAOImpl();
    }

    public static ManagerDAO getManagerDAO(){
        return new ManagerDAOImpl();
    }

    public static TeacherDAO getTeacherDAO(){
        return new TeacherDAOImpl();
    }

}
