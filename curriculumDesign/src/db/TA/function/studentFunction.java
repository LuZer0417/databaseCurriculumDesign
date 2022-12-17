package db.TA.function;

import db.DAO.DAOFactory.DAOFactory;
import db.TA.class_.assistantApply;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class studentFunction {


    // 学生功能2：可以查看自身的助教成果（已通过）与助教记录（通过或不通过）
    public void MyassistantResult(String s_id){
        DAOFactory.getInstance().getassistantEvaluateDAO().SearchEvaluation(s_id);
    }

    //学生功能3：可以对当前需要助教的课程进行提交助教申请
    public void applyForAssistant(String s_id){
        // 判断有几行返回结果
        if(DAOFactory.getInstance().getCourseDAO().SearchCourse1() == 0){
            System.out.println("所有课程均有助教");
        }
        else {
            assistantApply apply=new assistantApply();// 需要初始化数据
            // 这里应该加上个提供给用户的输出输出的内容，初始化一个apply
            Scanner input = new Scanner(System.in);
            System.out.println("请输入课程号：");
            apply.setC_id(input.nextLine());
            System.out.println("已经申请课程id：" + apply.getC_id());
            // 获得当前时间
            Date queueDate = new Date();
            SimpleDateFormat queueDateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
            String now = queueDateFormat.format(queueDate);
            System.out.println("现在时间是:" + now);
            apply.setApply_time(now);
            // 设置优先级
            System.out.println("申请的志愿优先级是：(1/2)");
            apply.setChoice_priority(input.nextLine());
            System.out.println("已经申请课程id：" + apply.getC_id());
            // 设置学生学号
            apply.setS_id(s_id);
            DAOFactory.getInstance().getassistantApplyDAO().addapply(apply);

        }
    }

    //学生功能4：可以对当前学期的助教工作进行助教自述
    public void updateMyEvaluation(String s_id){
        System.out.println("请问您需要对哪一门课进行助教自述？输入课程号：");
        Scanner input = new Scanner(System.in);
        String c_id = input.nextLine();
        System.out.println("请输入自述：（以换行结束）");
        String my_eva = input.nextLine();
        // 输入输出助教自述
        DAOFactory.getInstance().getassistantEvaluateDAO().update_myeva(s_id, c_id, my_eva);
    }

    //学生功能5：可以查看授课老师对自己的评价与最终通过结果
    public void checkMyAssistantWork(String s_id){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入课程号：");
        String c_id = input.nextLine();
        DAOFactory.getInstance().getassistantEvaluateDAO().searcheva(s_id,c_id);
    }


}
