package db.PA.function;

import db.DAO.DAOFactory.DAOFactory;

import java.util.Scanner;

public class Leader {
    //查看导师的项目
    public static void searchProject(){
        System.out.println("**********查看导师项目界面**********");
        Scanner sc = new Scanner(System.in);
        System.out.print("导师编号：");
        String t_id = sc.nextLine();
        DAOFactory.getInstance().getProjectDAO().teacherSelfView(t_id);
        System.out.println("**********查看导师项目界面**********");
    }

    //对导师的项目进行审核
    public static void examineProject() throws Exception {
        System.out.println("**********项目审核界面**********");
        Scanner sc = new Scanner(System.in);
        System.out.print("通过项目编号：");
        String p_id = sc.nextLine();
        DAOFactory.getInstance().getProjectDAO().leaderExamine(p_id);
        System.out.println("**********项目审核界面**********");
    }

    //对导师的项目进行资金批复
    public static void setProjectFunds() throws Exception {
        System.out.println("**********资金批复界面**********");
        Scanner sc = new Scanner(System.in);
        System.out.print("通过项目编号：");
        String p_id = sc.nextLine();
        System.out.print("分配资金：");
        String funds = sc.nextLine();
        DAOFactory.getInstance().getProjectDAO().leaderSetBudget(p_id,funds);
        System.out.println("**********资金批复界面**********");
    }

}
