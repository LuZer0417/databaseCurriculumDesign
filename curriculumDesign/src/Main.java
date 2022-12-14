import db.DAO.DAOFactory.DAOFactory;
import db.TA.function.managerFunction;
import db.TA.function.teacherFunction;
import db.publicClass_.Course;
import db.publicClass_.Student;
import db.publicClass_.Teacher;
import db.TA.function.studentFunction;
import java.util.Scanner;

public class Main {

    public static void studentSystem1(){
        //假设现在登录的学生身份：s_id = 0417的学生
        String s_id = "0123";

        System.out.println("------欢迎使用研究生助教子系统------\n" +
                "1.查看当前助教的政策\n" +
                "2.查看自身的助教成果与助教记录\n" +
                "3.对当前需要助教的课程进行提交助教申请\n" +
                "4.对当前学期的助教工作进行助教自述\n" +
                "5.查看授课老师对自己的评价与最终通过结果\n");
        System.out.println("请输入你的选择：");
        Scanner input = new Scanner(System.in);

        //studentFunction对象
        studentFunction sFunc = new studentFunction();

        int choose;
        choose = input.nextInt();
        if(choose == 1){
            System.out.println("还没实现");
        }
        else if(choose == 2){
            sFunc.MyassistantResult(s_id);
        }
        else if(choose == 3){
            sFunc.applyForAssistant(s_id);
        }
        else if (choose == 4){
            sFunc.updateMyEvaluation(s_id);
        }
        else if (choose == 5 ){
            sFunc.checkMyAssistantWork(s_id);
        }
        //关闭scanner对象
        input.close();
    }

    public static void teacherSystem1(){

        //假设现在登录的教师身份：t_id = 0417的教师
        String t_id = "0417";

        System.out.println("------欢迎使用研究生助教子系统(教师)------\n" +
                "1.对学生提交给自己所授课程的助教申请进行评判通过与不通过\n" +
                "2.对学生的助教过程给予评价并评判通过与不通过\n" +
                "3.查看自身课程和助教的相关信息（课程以及学生的相关信息）\n" +
                "4.导入自己教授的课程\n" +
                "5.结束系统");
        System.out.println("请输入你的选择：");
        Scanner input = new Scanner(System.in);
        while (true){
            String c = input.nextLine();
            teacherFunction tFunc = new teacherFunction();
            if (c.equals("1")){

                tFunc.ManageAssistantApply();
            }else if (c.equals("2")) {
                tFunc.EvaluateAssistantWork();
            }else if (c.equals("3")){
                tFunc.Search_Course_and_Assistant_info("0123");
            }else if (c.equals("4")){
                tFunc.addOneCourse(t_id);
            }
        }
    }


    public static void managerSystem1(){

        //假设现在登录的管理员身份身份：m_id = 021的教师
        String m_id = "021";

        System.out.println("-----欢迎使用研究生助教子系统(管理员)---\n" +
                "1.发布选课的通知\n" +
                "2.结束选课\n" +
                "3.查看本学期所有的课程\n" +
                "4.查看本学期仍然缺助教的课程信息\n" +
                "5.查看所有学生已认定的助教工作的参与次数\n" +
                "6.查看所有助教工作表中的信息\n" +
                "7.退出该子系统");
        System.out.println("请输入你的选择：");
        Scanner input = new Scanner(System.in);
        while (true){

            String c = input.nextLine();
            managerFunction mFunc = new managerFunction();
            if (c.equals("1")){
                System.out.println("发布通知");

            }else if (c.equals("2")) {
                System.out.println("结束选课");
            }else if (c.equals("3")){
                mFunc.overviewCourse();
            }else if (c.equals("4")){
                mFunc.checkCourseWithoutTA();
            }else if (c.equals("5")){
                mFunc.checkTACount();
            }else if (c.equals("6")){
                mFunc.workCertify();
            }
        }


    }








    public static void system1(){
        System.out.println("1.学生身份登录");
        System.out.println("2.教师身份登录");
        System.out.println("3.管理员身份登录");
        Scanner input = new Scanner(System.in);
        while (true){
            String c = input.nextLine();
            if(c.equals("1")){
                studentSystem1();
            }else if(c.equals("2")){
                teacherSystem1();
            }else if(c.equals("3")){
                managerSystem1();

            }
        }

    }

    public static void main(String[] args) {
        System.out.println("**********************\n欢迎使用研究生综合管理系统");
        System.out.println("1.研究生助教子系统\n" +
                "2.子系统2\n" +
                "3.子系统3\n" +
                "4.对当前学期的助教工作进行助教自述\n" +
                "5.退出");
        System.out.println("*******BY 键值队*******");
        System.out.println("请输入你的选择：");
        Scanner input = new Scanner(System.in);
        while (true) {
            String c = input.nextLine();
            if (c.equals("1")){
                // 开始运行子系统 1
                system1();
            }
            // 设置结束条件
            if(c.equals("0")){
                break;
            }

        }


    }

}


