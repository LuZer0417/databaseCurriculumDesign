package db.ACA.function;

import db.ACA.class_.academicActivity;
import db.DAO.DAOFactory.DAOFactory;

import java.util.Scanner;

public class managerFunction {
    public void f1(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入活动编号");
        String a_id = input.nextLine();
        DAOFactory.getInstance().getacademicActivityDAO().ViewACA_activities(a_id);
    }

    public void f2(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入活动编号");
        String a_id = input.nextLine();
        System.out.println("请输入学生编号");
        String s_id = input.nextLine();
        System.out.println("请输入审核结果(通过/不通过)");
        String m_audit = input.nextLine();
        DAOFactory.getInstance().getacademicInfoDAO().Review_aplc2(m_audit,a_id,s_id);
    }

    public void f3(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String s_id = input.nextLine();
        DAOFactory.getInstance().getacademicInfoDAO().CheckTimes(s_id);
    }
}
