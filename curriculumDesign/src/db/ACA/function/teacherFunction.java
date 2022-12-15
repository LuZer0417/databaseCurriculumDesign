package db.ACA.function;

import db.ACA.class_.academicActivity;
import db.DAO.DAOFactory.DAOFactory;

import java.util.Scanner;

public class teacherFunction {
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
        String t_audit = input.nextLine();

        DAOFactory.getInstance().getacademicInfoDAO().Review_aplc1(t_audit,a_id,s_id);
    }

    public void f3(){
        academicActivity aAct = new academicActivity();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入活动编号：");
        aAct.setA_id(input.nextLine());
        System.out.println("请输入活动名称：");
        aAct.setA_name(input.nextLine());
        System.out.println("请输入活动地址：");
        aAct.setA_address(input.nextLine());
        System.out.println("请输入所属学科：");
        aAct.setA_subject(input.nextLine());
        System.out.println("请输入活动日期：");
        aAct.setA_date(input.nextLine());

        DAOFactory.getInstance().getacademicActivityDAO().PostACA_activities(aAct);
    }
}
