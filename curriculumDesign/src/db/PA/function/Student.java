package db.PA.function;

import db.DAO.DAOFactory.DAOFactory;
import db.PA.class_.Project;
import db.PA.class_.ProjectApply;

import java.util.LinkedList;
import java.util.Scanner;

public class Student {

    //查看自己导师的项目
    public static void searchTeacherProject(){
        System.out.println("请输入自己的编号");//严格来讲这里不该是自己输入，而是用select语句去查找
        Scanner sc = new Scanner(System.in);
        String t_id = sc.nextLine();
        System.out.println("**********导师项目界面**********");
        DAOFactory.getInstance().getProjectDAO().studentViewTeacher(t_id);
        System.out.println("**********导师项目界面**********");
    }

    //查看自己申请通过的项目
    public static void searchStudentProject(String s_id) throws Exception {
        System.out.println("**********学生申请项目查询界面**********");
        LinkedList<String> paList = DAOFactory.getInstance().getProjectApplyDAO().studentView(s_id);
        LinkedList<Project> pList = new LinkedList<Project>();
        for(int i = 0;i < paList.size();i++){
            pList.add(DAOFactory.getInstance().getProjectDAO().studentSelfView(paList.get(i)));
        }
        for (int i = 0;i < pList.size();i++){
            System.out.println(pList.get(i));
        }
        System.out.println("**********学生申请项目查询界面**********");
    }

    //申请项目
    public static void projectApply(){
        System.out.println("**********项目申请界面**********");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入申请的详细信息：");
        System.out.print("学生编号：");
        String s_id = sc.nextLine();
        System.out.print("项目编号：");
        String p_id = sc.nextLine();
        System.out.print("负责项目工作：");
        String work = sc.nextLine();
        ProjectApply pa = new ProjectApply(p_id,s_id,work);
        DAOFactory.getInstance().getProjectApplyDAO().studentSubmit(pa);
        System.out.println("**********项目申请界面**********");
    }

}
