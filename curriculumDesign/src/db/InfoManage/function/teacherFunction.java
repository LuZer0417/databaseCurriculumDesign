package db.InfoManage.function;

import db.DAO.DAOFactory.DAOFactory;

import java.util.Scanner;

public class teacherFunction {
    //学科负责人功能：查看学科下的导师信息以及研究生培养情况。
    public void f1(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入专业id：");
        String major_id = input.nextLine();
        DAOFactory.getInstance().getTeacherDAO().Select1(major_id);
    }

    public void f2(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入专业id：");
        String major_id = input.nextLine();
        DAOFactory.getInstance().getStudentDAO().Select1(major_id);
    }

}
