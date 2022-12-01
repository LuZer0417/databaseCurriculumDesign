package db.DAO;

import db.DAO.classDAO.CourseDAO;
import db.DAO.classDAO.StudentDAO;
import db.DAO.classDAOImpl.StudentDAOImpl;

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


    //后面要自己改

//    //找学生类的接口
//    public static StudentDAO getStudentDAO(){
//        return (StudentDAO) new StudentDAOImpl();
//    }
//
//
//    // 找课程类接口
//    public static CourseDAO getCourseDAO(){
//        return new CourseDAOImpl();
//    }


}
