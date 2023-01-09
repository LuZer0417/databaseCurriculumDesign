package db.PA.function;
import db.DAO.DAOFactory.DAOFactory;
import java.util.Scanner;

public class Teacher {

    //查看自己的项目
    public static void searchSelfProject(String t_id){
        System.out.println("**********老师查看项目界面**********");
        DAOFactory.getInstance().getProjectDAO().teacherSelfView(t_id);
        System.out.println("**********老师查看项目界面**********");
    }

    //做为导师对学生申请进行初审
    public static void firExamineApply(){
        System.out.println("**********学生申请初审界面**********");
        Scanner sc = new Scanner(System.in);
        System.out.print("学生编号：");
        String s_id = sc.nextLine();
        System.out.print("项目编号：");
        String p_id = sc.nextLine();
        DAOFactory.getInstance().getProjectApplyDAO().teacherExamine(s_id,p_id);
        System.out.println("**********学生申请初审通过**********");
    }

    //做为项目负责人对学生申请进行终审
    public static void secExamineApply(){
        System.out.println("**********学生申请终审界面**********");
        Scanner sc = new Scanner(System.in);
        System.out.print("学生编号：");
        String s_id = sc.nextLine();
        System.out.print("项目编号：");
        String p_id = sc.nextLine();
        DAOFactory.getInstance().getProjectApplyDAO().managerExamine(s_id,p_id);
        System.out.println("**********学生申请终审通过**********");

    }

}
