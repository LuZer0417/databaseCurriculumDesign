package db.InfoManage.function;

import db.DAO.DAOFactory.DAOFactory;
import db.InfoManage.class_.login;
import db.publicClass_.Course;
import db.publicClass_.Student;
import db.publicClass_.Teacher;

public class managerFunction {
    //增加一个账户
    public void add_account(){
        login lg=new login();
        DAOFactory.getInstance().getloginDAO().addInfo(lg);
    }

    //删除一个账户
    public void del_account(String id){
        DAOFactory.getInstance().getloginDAO().delInfo(id);
    }

    //修改账户密码，可引入加密算法
    public void changepw(String pw){
        DAOFactory.getInstance().getloginDAO().updateInfo(pw);
    }

    //增加课程
    public void add_crs(Course crs){
        DAOFactory.getInstance().getCourseDAO().addCourse(crs);
    }

    //删除课程
    public void del_crs(Course crs){
        DAOFactory.getInstance().getCourseDAO().updateCourse(crs);
    }

    //修改课程信息
    public void change_crs(String c_id){
        DAOFactory.getInstance().getCourseDAO().deleteCourse(c_id);
    }

    //增加教师信息
    public void add_tea(Teacher tea){
        DAOFactory.getInstance().getTeacherDAO().addTeacher(tea);
    }

    //删除教师信息
    public void del_tea(String t_id){
        DAOFactory.getInstance().getTeacherDAO().deleteTeacher(t_id);
    }
    //修改教师信息
    public void change_tea(Teacher tea){
        DAOFactory.getInstance().getTeacherDAO().updateTeacher(tea);
    }

    //将入学的新生与导师建立好联系,即在学生表中新增一条学生记录
    public void add_stu(Student stu){
        DAOFactory.getInstance().getStudentDAO().addStudent(stu);
    }






}
