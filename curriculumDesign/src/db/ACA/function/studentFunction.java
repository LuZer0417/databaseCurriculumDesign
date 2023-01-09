package db.ACA.function;

import db.DAO.DAOFactory.DAOFactory;

import java.util.Scanner;

public class studentFunction {

    public studentFunction() {
    }

    /**
     * @parameter 学生号s_id
     * 查看个人可以参加的学术交流活动
     * @return
     */
    public void f1(){
        DAOFactory.getInstance().getacademicActivityDAO().SearchACA_activities();
        //int count = DAOFactory.getInstance().getacademicActivityDAO().SearchACA_activities();
        //System.out.println("可参加的活动有" + count + "个");
    }

    /**
     * 学生功能2：向导师提交个人的学术交流信息
     *
     * @param s_id
     */

    public void f2(String s_id){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入活动全称：");
        String a_name = input.nextLine();
        System.out.println("请输入活动ID：");
        String a_id = input.nextLine();
        DAOFactory.getInstance().getacademicInfoDAO().SubmitInfo(a_id,a_name,s_id);
    }



    /*
    @para: 一个是活动编号，一个是学生学号
     */
    public void f3_1(String a_id,String s_id){
        DAOFactory.getInstance().getacademicInfoDAO().ViewACA_info(a_id,s_id);
    }

    public void f3_2(String a_id,String s_id){
        DAOFactory.getInstance().getacademicInfoDAO().Withdraw_Aplc(a_id,s_id);
    }


}
