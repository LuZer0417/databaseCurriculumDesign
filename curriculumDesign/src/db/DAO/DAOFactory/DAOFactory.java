package db.DAO.DAOFactory;

import db.DAO.classDAO.CourseDAO;
import db.DAO.classDAO.StudentDAO;
import db.DAO.classDAO.TeacherDAO;
import db.DAO.classDAOImpl.CourseDAOImpl;
import db.DAO.classDAOImpl.StudentDAOImpl;
import db.DAO.classDAOImpl.TeacherDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;
    static {
        daoFactory = new DAOFactory();
    }
    // 构造函数
    private DAOFactory(){

    }


    //后面函数理解：getinstance用来返回一个工厂实例，返回的工厂实例再去调用自身的方法
    public static DAOFactory getInstance(){
        return daoFactory;
    }

    //找学生类的接口
    public static StudentDAO getStudentDAO(){
        return new StudentDAOImpl();
    }

    public static TeacherDAO getTeacherDAO(){
        return new TeacherDAOImpl();
    }

    public static CourseDAO getCourseDAO(){
        return new CourseDAOImpl();
    }



}
