package db.DAO.DAOFactory;

import db.ACA.classDAO.academicActivityDAO;
import db.ACA.classDAO.academicInfoDAO;
import db.ACA.classDAOImpl.academicActivityImpl;
import db.ACA.classDAOImpl.academicInfoImpl;
import db.DAO.classDAO.CourseDAO;
import db.DAO.classDAO.StudentDAO;
import db.DAO.classDAO.TeacherDAO;
import db.DAO.classDAOImpl.CourseDAOImpl;
import db.DAO.classDAOImpl.StudentDAOImpl;
import db.DAO.classDAOImpl.TeacherDAOImpl;
import db.InfoManage.classDAO.loginDAO;
import db.InfoManage.classDAOImpl.loginDAOImpl;
import db.OutcomesSubsystem.tableDAO.*;
import db.OutcomesSubsystem.tableDAOImpl.*;
import db.PA.classDAO.ProjectApplyDAO;
import db.PA.classDAO.ProjectDAO;
import db.PA.classDAOImpl.ProjectApplyDAOImpl;
import db.PA.classDAOImpl.ProjectDAOImpl;
import db.TA.classDAO.assistantApplyDAO;
import db.TA.classDAO.assistantEvaluateDAO;
import db.TA.classDAO.courseAssistantDAO;
import db.TA.classDAOImpl.assistantApplyImpl;
import db.TA.classDAOImpl.assistantEvaluateImpl;
import db.TA.classDAOImpl.courseAssistantImpl;

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

    public static assistantEvaluateDAO getassistantEvaluateDAO(){return new assistantEvaluateImpl(); }
    public static assistantApplyDAO getassistantApplyDAO(){return new assistantApplyImpl();}

    public static courseAssistantDAO getcourseAssistantDAO(){return new courseAssistantImpl();}

    // 子系统2
    public static academicActivityDAO getacademicActivityDAO(){return new academicActivityImpl(); }

    public static academicInfoDAO getacademicInfoDAO(){return new academicInfoImpl(); }

    public static loginDAO getloginDAO(){return new loginDAOImpl();}



    //子系统4 成果
    public ResultDAO getResultDAO() { return new ResultDAOImpl();
    }
    //论文类
    public PaperDAO getPaperDAO() { return new PaperDAOImpl();
    }
    //奖励类
    public RewardDAO getRewardDAO() { return new RewardDAOImpl();
    }
    //标准类
    public StandardDAO getStandardDAO() { return new StandardDAOImpl();
    }
    //专利类
    public PatentDAO getPatentDAO() { return new PatentDAOImpl();
    }
    //报告类
    public ReportDAO getReportDAO() { return new ReportDAOImpl();
    }
    //软硬件平台类
    public WareDAO getWareDAO() { return new WareDAOImpl();
    }
    //教材类
    public BookDAO getBookDAO() { return new BookDAOImpl();
    }
    //其它成果类
    public OtherDAO getOtherDAO() { return new OtherDAOImpl();
    }


    public ProjectDAO getProjectDAO() {
        return new ProjectDAOImpl();
    }

    public ProjectApplyDAO getProjectApplyDAO() {
        return new ProjectApplyDAOImpl();
    }
}
