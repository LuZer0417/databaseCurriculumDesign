package db.TA.function;

import db.DAO.DAOFactory.DAOFactory;
import db.TA.class_.assistantEvaluate;
import db.publicClass_.Course;

import java.util.Scanner;

public class teacherFunction {
    //教师功能1：可以对学生提交给自己所授课程的助教申请进行评判（即通过与不通过）
    public void ManageAssistantApply(){
        Scanner input = new Scanner(System.in);
        // 想查看哪些该门课下有哪些助教，打印出来
        System.out.println("请问您要查找哪门课下的助教？请输入课程号：");
        String c_id = input.nextLine();
        if(DAOFactory.getInstance().getassistantApplyDAO().searchApply(c_id) == 0){
            System.out.println("可操作的记录有0条，即将退出");
        }
        else {
            System.out.println("可操作的记录有" + DAOFactory.getInstance().getassistantApplyDAO().searchApply(c_id) + "条");
            System.out.println("请输入您要进行评判的学生记录：");
            String s_id = input.nextLine();
            System.out.println("请输入您的评判：（通过/不通过）");
            String Status = input.nextLine();
            DAOFactory.getInstance().getassistantApplyDAO().update_apply(Status,s_id,c_id);
            // 添加对助教的评论（真的需要给评论嘛？我觉得不用
//            assistantEvaluate assis_eva=new assistantEvaluate();
//            DAOFactory.getInstance().getassistantEvaluateDAO().add_assistant_evaluate(assis_eva);
            if(Status=="通过"){
                // 更改course表中是否有助教的选项
                Boolean with_TA=Boolean.TRUE;
                DAOFactory.getInstance().getCourseDAO().updateCourse(c_id,with_TA);
            }else{
                //还有不通过的部分：
                Boolean with_TA=Boolean.FALSE;
                DAOFactory.getInstance().getCourseDAO().updateCourse(c_id,with_TA);
            }
        }
    }

    //教师功能2：助教工作结束后可以对学生的助教过程给予评价并评判通过与不通过
    public void EvaluateAssistantWork(){
        Scanner input = new Scanner(System.in);
        // 需要输入的有：
        System.out.println("请输入学生序号：");
        String s_id = input.nextLine();
        System.out.println("请输入课程号：");
        String c_id = input.nextLine();
        System.out.println("请输入教师评价：");
        String teacher_eva = input.nextLine();
        System.out.println("请输入（通过/不通过）");
        String is_qualified = input.nextLine();
        DAOFactory.getInstance().getassistantEvaluateDAO().update_t_eva(s_id,c_id,teacher_eva,is_qualified);
    }

    //教师功能3：可以查看自身课程和助教的相关信息（课程以及学生的相关信息）
    public void Search_Course_and_Assistant_info(String t_id){
        DAOFactory.getInstance().getcourseAssistantDAO().select_CourseAndStu(t_id);
    }
    //教师功能4：
    public void addOneCourse(String t_id){
        Scanner input = new Scanner(System.in);
        //初始化一个Course类对象
        Course course = new Course();
        System.out.println("请输入课程编号");
        course.setC_id(input.nextLine());
        System.out.println("请输入课程名称");
        course.setC_name(input.nextLine());
        System.out.println("该课的类型是（选修课/必修课）");
        String s = input.nextLine();
        if (s.equals("选修课")){
            course.setIs_compulsory(true);
        }else {
            course.setIs_compulsory(false);
        }
        // 设置本课教师号
        course.setC_teacher_id(t_id);
        DAOFactory.getInstance().getCourseDAO().addCourse(course);
    }




}
