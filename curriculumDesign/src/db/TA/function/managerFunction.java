package db.TA.function;

import db.DAO.DAOFactory.DAOFactory;
import db.TA.class_.courseAssistant;

public class managerFunction {

    // 功能1：可以发布选课的通知
    public void releaseNotice(){
        System.out.println("可以选课啦！");
    }

    //功能2：可以结束选课
    public void forbidSelection(){
        System.out.println("禁止选课！");
    }

    //功能3：可以查看本学期所有的课程,查看没成为助教的学生信息，并指定其为助教
    public void overviewCourse(){
// <<<<<<< HEAD
        DAOFactory.getInstance().getCourseDAO().SearchCourse1();
        DAOFactory.getInstance().getassistantApplyDAO().Select_stu();
        courseAssistant assis=new courseAssistant();
        DAOFactory.getInstance().getcourseAssistantDAO().addAssistant(assis);

// =======
        DAOFactory.getInstance().getCourseDAO().getAllCourse();
// >>>>>>> 194454261115e456ec96c4379c7b2024f4daa58c
    }

    //功能4：查看本学期仍然缺助教的课程信息
    public void checkCourseWithoutTA(){
        int count = DAOFactory.getInstance().getCourseDAO().SearchCourse1();
        System.out.println("已经返回" + count + "条记录");
    }

    //功能5：查看所有学生已认定的助教工作的参与次数
    public void checkTACount(){
        DAOFactory.getInstance().getassistantEvaluateDAO().select_ta_sum();
    }

    //功能6：工作认证
    public void workCertify(){
        DAOFactory.getInstance().getassistantEvaluateDAO().Searchqualified();
    }

}
