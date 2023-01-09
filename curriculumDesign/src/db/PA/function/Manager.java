package db.PA.function;

import db.DAO.DAOFactory.DAOFactory;
import db.PA.class_.Project;
import java.util.Scanner;

public class Manager {

    //管理员对项目的信息输入
    public static void managerInsertProject(){
        System.out.println("**********项目信息输入界面**********");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入项目的详细信息：");
        System.out.print("项目编号：");
        String p_id = sc.nextLine();
        System.out.print("项目名称：");
        String p_name = sc.nextLine();
        System.out.print("项目状态：");
        String p_state = sc.nextLine();
        System.out.print("负责人编号：");
        String p_responsible_id = sc.nextLine();
        System.out.print("项目类型：");
        String p_type = sc.nextLine();
        System.out.print("开始时间：");
        String p_begin = sc.nextLine();
        System.out.print("结束时间：");
        String p_end = sc.nextLine();
        Project p = new Project(p_id,p_name,p_state,p_responsible_id,p_type,p_begin,p_end);
        DAOFactory.getInstance().getProjectDAO().managerApply(p);
        System.out.println("**********项目信息输入完成**********");
    }
}
