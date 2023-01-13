package db.InfoManage.function;

import db.DAO.DAOFactory.DAOFactory;
import db.InfoManage.class_.login;
import db.publicClass_.Course;
import db.publicClass_.Student;
import db.publicClass_.Teacher;

import java.util.Scanner;

public class managerFunction {
    //增加一个账户
    public void add_account(){
        login lg=new login();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户账号");
        lg.setId(input.nextLine());
        System.out.println("请输入用户密码");
        lg.setIdt(input.nextLine());
        System.out.println("请输入身份(教师/学生/管理员)");
        lg.setIdt(input.nextLine());
        DAOFactory.getInstance().getloginDAO().addInfo(lg);
    }

    //删除一个账户
    public void del_account(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要删除的用户账号：");
        String id = input.nextLine();
        DAOFactory.getInstance().getloginDAO().delInfo(id);
    }

    //修改账户密码，可引入加密算法
    public void changepw(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入新密码：");
        String pw = input.nextLine();

        DAOFactory.getInstance().getloginDAO().updateInfo(pw);
    }

    //增加课程
    public void add_crs(){
        Course crs = new Course();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入课程id：");
        crs.setC_id(input.nextLine());
        System.out.println("请输入课程名称：");
        crs.setC_name(input.nextLine());
        System.out.println("请输入课程是否为必修：(true/false)");
        crs.setIs_compulsory(Boolean.parseBoolean(input.nextLine()));
        System.out.println("请输入课程容量：");
        crs.setC_size(Integer.parseInt(input.nextLine()));
        System.out.println("请输入课程学分：");
        crs.setC_credit(Integer.parseInt(input.nextLine()));
        System.out.println("请输入面向学生类型：");
        crs.setC_target_stu(input.nextLine());
        System.out.println("请输入课程开始时间");
        crs.setC_start_time(input.nextLine());
        System.out.println("请输入课时数量：");
        crs.setC_hour(Integer.parseInt(input.nextLine()));
        System.out.println("请输入课程优先级：");
        crs.setC_priority(Integer.parseInt(input.nextLine()));
        System.out.println("请输入课程是否有助教（true/false）：");
        crs.setC_with_TA(Boolean.parseBoolean(input.nextLine()));
        System.out.println("请输入课程教师id：");
        crs.setC_teacher_id(input.nextLine());


        DAOFactory.getInstance().getCourseDAO().addCourse(crs);
    }

    //删除课程
    public void del_crs(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入课程id：");
        String c_id = input.nextLine();
        DAOFactory.getInstance().getCourseDAO().deleteCourse(c_id);
    }

    //修改课程信息
    public void change_crs(String c_id){
        // 同增加一门课
    }

    //增加教师信息
    public void add_tea(){

        Teacher tea = new Teacher();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入教师id：");
        tea.setT_id(input.nextLine());
        System.out.println("请输入教师名称：");
        tea.setT_name(input.nextLine());
        System.out.println("专业ID");
        tea.setMajor_id(input.nextLine());
        DAOFactory.getInstance().getTeacherDAO().addTeacher(tea);
    }

    //删除教师信息
    public void del_tea(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入教师id：");
        String t_id = input.nextLine();
        DAOFactory.getInstance().getTeacherDAO().deleteTeacher(t_id);
    }
    //修改教师信息
    public void change_tea(){
        // 同增加教师信息
        // DAOFactory.getInstance().getTeacherDAO().updateTeacher(tea);
    }

    //将入学的新生与导师建立好联系,即在学生表中新增一条学生记录
    public void add_stu(){

        Student stu = new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生id：");
        stu.setS_id(input.nextLine());
        System.out.println("请输入学生姓名：");
        stu.setS_name(input.nextLine());
        System.out.println("专业ID");
        stu.setMajor_id(input.nextLine());
        System.out.println("导师ID");
        stu.setTutor_id(input.nextLine());
        System.out.println("学生类型");
        stu.setS_type(input.nextLine());

        DAOFactory.getInstance().getStudentDAO().addStudent(stu);
    }

}
