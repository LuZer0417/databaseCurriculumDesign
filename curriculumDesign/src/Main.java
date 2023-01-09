import db.DAO.DAOFactory.DAOFactory;
import db.TA.function.managerFunction;
import db.TA.function.teacherFunction;
import db.TA.function.studentFunction;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static String uid = "";// 当前系统登录用户
    private static String psw = "";// 当前系统密码
    private static String idf = "";// 当前身份认证

    //-----------------------------------子系统1：研究生助教系统----------------------------------
    public static void studentSystem1() throws Exception {
        //假设现在登录的学生身份：s_id = 0417的学生

        System.out.println("------欢迎使用研究生助教子系统(学生)------\n" +
                "1.查看当前助教的政策\n" +
                "2.查看自身的助教成果与助教记录\n" +
                "3.对当前需要助教的课程进行提交助教申请\n" +
                "4.对当前学期的助教工作进行助教自述\n" +
                "5.查看授课老师对自己的评价与最终通过结果\n" +
                "6.返回主页面\n" +
                "7.退出");
        System.out.println("请输入你的选择：");
        Scanner input = new Scanner(System.in);

        //studentFunction对象
        studentFunction sFunc = new studentFunction();

        while(true){
            String choose = "";
            choose = input.nextLine();
            //
            if(choose.equals("1")){
                System.out.println("助教政策\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                studentSystem1();
            }
            else if(choose.equals("2")){
                sFunc.MyassistantResult(uid);
                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                studentSystem1();
            }
            else if(choose.equals("3")){
                sFunc.applyForAssistant(uid);
                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                studentSystem1();
            }
            else if (choose.equals("4")){
                sFunc.updateMyEvaluation(uid);
                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                studentSystem1();
            }
            else if (choose.equals("5")){
                sFunc.checkMyAssistantWork(uid);
                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                studentSystem1();
            }else if (choose.equals("6")){
                homePage();
            }else if (choose.equals("7")){
                System.out.println("BYE!");
                // 退出
                return;
            }
        }
    }

    public static void teacherSystem1() throws Exception {

        //假设现在登录的教师身份：t_id = 0417的教师

        System.out.println("------欢迎使用研究生助教子系统(教师)------\n" +
                "1.对学生提交给自己所授课程的助教申请进行评判通过与不通过\n" +
                "2.对学生的助教过程给予评价并评判通过与不通过\n" +
                "3.查看自身课程和助教的相关信息（课程以及学生的相关信息）\n" +
                "4.导入自己教授的课程\n" +
                "5.返回主页面\n" +
                "6.结束系统");
        System.out.println("请输入你的选择：");
        Scanner input = new Scanner(System.in);
        while (true){
            String c = input.nextLine();
            teacherFunction tFunc = new teacherFunction();
            if (c.equals("1")){
                tFunc.ManageAssistantApply();
                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                teacherSystem1();
            }else if (c.equals("2")) {
                tFunc.EvaluateAssistantWork();

                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                teacherSystem1();

            }else if (c.equals("3")){
                tFunc.Search_Course_and_Assistant_info("123");

                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                teacherSystem1();
            }else if (c.equals("4")){
                tFunc.addOneCourse(idf);

                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                teacherSystem1();

            }else if (c.equals("5")){
                homePage();
            }else if (c.equals("6")){
                return;
            }
        }
    }


    public static void managerSystem1() throws Exception {

        //假设现在登录的管理员身份身份：m_id = 021的教师

        System.out.println("-----欢迎使用研究生助教子系统(管理员)---\n" +
                "1.发布选课的通知\n" +
                "2.结束选课\n" +
                "3.查看本学期所有的课程\n" +
                "4.查看本学期仍然缺助教的课程信息\n" +
                "5.查看所有学生已认定的助教工作的参与次数\n" +
                "6.查看所有助教工作表中的信息\n" +
                "7.返回主页面" +
                "8.退出该子系统");
        System.out.println("请输入你的选择：");
        Scanner input = new Scanner(System.in);
        while (true){

            String c = input.nextLine();
            managerFunction mFunc = new managerFunction();
            if (c.equals("1")){
                System.out.println("发布通知如下：");

                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                managerSystem1();

            }else if (c.equals("2")) {
                System.out.println("结束选课");

                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                managerSystem1();
            }else if (c.equals("3")){
                mFunc.overviewCourse();

                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                managerSystem1();
            }else if (c.equals("4")){
                mFunc.checkCourseWithoutTA();

                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                managerSystem1();
            }else if (c.equals("5")){
                mFunc.checkTACount();

                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                managerSystem1();
            }else if (c.equals("6")){
                mFunc.workCertify();

                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                managerSystem1();
            }else if (c.equals("8")){
                System.out.println("感谢使用该系统，再见！");
                return;
            }else if (c.equals("7")){
                homePage();
            }
        }

    }
    // 选择系统1

    public static void system1() throws Exception {

        while (true){
            if(idf.equals("学生")){
                studentSystem1();
                break;
            }else if(idf.equals("教师")){
                teacherSystem1();
                break;
            }else if(idf.equals("管理员")){
                managerSystem1();
                break;
            }
        }
    }

    //-------------------------------子系统2：学术活动系统----------------------------------------------


    public static void studentSystem2() throws Exception {
        //假设现在登录的学生身份：s_id = 0417的学生
        // String idf = "0123";

        System.out.println("------欢迎使用学术活动认证子系统(学生)------\n" +
                "1.查看当前可以参加的学术交流活动\n" +
                "2.向导师提交个人的学术交流信息\n" +
                "3.查看学术交流信息的审批进度\n" +
                "4.返回主页面\n" +
                "5.退出");
        System.out.println("请输入你的选择：");
        Scanner input = new Scanner(System.in);

        //studentFunction对象
        db.ACA.function.studentFunction sFunc = new db.ACA.function.studentFunction();

        int choose;
        choose = input.nextInt();
        if(choose == 1){
            sFunc.f1();

            System.out.println("执行完毕\n");
            System.out.println("按任意键后返回上个界面");
            input.nextLine();
            studentSystem2();
        }
        else if(choose == 2){
            sFunc.f2(idf);

            System.out.println("执行完毕\n");
            System.out.println("按任意键后返回上个界面");
            input.nextLine();
            studentSystem2();
        }
        else if(choose == 3){
            Scanner in = new Scanner(System.in);
            System.out.println("请输入活动编号：");
            String a_id = in.nextLine();
            sFunc.f3_1(a_id, idf);
            System.out.println("请问是否要撤销该条申请？(是/否)");
            String c = in.nextLine();
            if (c == "是"){
                sFunc.f3_2(a_id, idf);
            }else if (c == "否"){
                System.out.println("好的，不撤销了");
            }
        }
        else if (choose == 5){
            // 返回界面
            System.out.println("BYE!");
            return;
        }else if (choose == 4){
            homePage();
        }

        //关闭scanner对象
        input.close();
    }

    public static void teacherSystem2(){

        System.out.println("------欢迎使用学术活动认证子系统(教师)------\n" +
                "1.查询指定学术交流信息\n" +
                "2.审核《研究生学术交流统计表》\n" +
                "3.发布该学科可参与的学术交流活动信息\n" +
                "4.返回主页面\n" +
                "5.退出");
        System.out.println("请输入你的选择：");
        Scanner input = new Scanner(System.in);

        //studentFunction对象
        db.ACA.function.teacherFunction tFunc = new db.ACA.function.teacherFunction();

        int choose;
        choose = input.nextInt();
        if(choose == 1){
            tFunc.f1();

            System.out.println("执行完毕\n");
            System.out.println("按任意键后返回上个界面");
            input.nextLine();
            teacherSystem2();
        }
        else if(choose == 2){
            tFunc.f2();

            System.out.println("执行完毕\n");
            System.out.println("按任意键后返回上个界面");
            input.nextLine();
            teacherSystem2();
        }
        else if(choose == 3){
            tFunc.f3();

            System.out.println("执行完毕\n");
            System.out.println("按任意键后返回上个界面");
            input.nextLine();
            teacherSystem2();
        }
        else if (choose == 4){
            System.out.println("Bye!");
            return;
            // 返回界面
        }
        //关闭scanner对象
        input.close();
    }

    public static void managerSystem2(){
        //假设现在登录的学生身份：s_id = 0417的学生


        System.out.println("------欢迎使用学术活动认证子系统(管理员)------\n" +
                "1.查询指定学术交流信息\n" +
                "2.审核《研究生学术交流统计表》\n" +
                "3.查看研究生对应的学术交流信息次数的毕业条件是否满足要求\n" +
                "4.退出");
        System.out.println("请输入你的选择：");
        Scanner input = new Scanner(System.in);

        //studentFunction对象
        db.ACA.function.managerFunction mFunc = new db.ACA.function.managerFunction();

        int choose;
        choose = input.nextInt();
        if(choose == 1){
            mFunc.f1();

            System.out.println("执行完毕\n");
            System.out.println("按任意键后返回上个界面");
            input.nextLine();
            managerSystem2();
        }
        else if(choose == 2){
            mFunc.f2();

            System.out.println("执行完毕\n");
            System.out.println("按任意键后返回上个界面");
            input.nextLine();
            managerSystem2();
        }
        else if(choose == 3){
            mFunc.f3();

            System.out.println("执行完毕\n");
            System.out.println("按任意键后返回上个界面");
            input.nextLine();
            managerSystem2();
        }
        else if (choose == 4){
            return;
            // 返回界面
        }
        //关闭scanner对象
        input.close();
    }

    public static void system2() throws Exception {
        while (true){
            if(idf.equals("学生")){
                studentSystem2();
                break;
            }else if(idf.equals("教师")){
                teacherSystem2();
                break;
            }else if(idf.equals("管理员")){
                managerSystem2();
                break;
            }
        }
    }

    //---------------------------------------子系统3研究生项目系统------------------------------
    public static void studentSystem3() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("请问您是否为项目负责人？（是/否）");
        // 如果学生的话，先判断是不是leader
        String is_leader = input.nextLine();
        while (true){
            if (is_leader.equals("是")){// leader的功能选项
                System.out.println("------欢迎使用研究生项目系统(学生)------\n" +
                        "1.查看导师的项目\n" +
                        "2.对导师的项目进行审核\n" +
                        "3.对导师的项目进行资金批复\n" +
                        "4.返回主页面\n" +
                        "5.退出");
                System.out.println("请输入你的选择：");
                db.PA.function.Leader lFunc = new db.PA.function.Leader();
                while(true){
                    String choose = "";
                    choose = input.nextLine();
                    if(choose.equals("1")){
                        lFunc.searchProject();

                        System.out.println("执行结束\n按任意键后返回上个界面");
                        input.nextLine();
                        studentSystem3();
                    }
                    else if(choose.equals("2")){
                        lFunc.examineProject();
                        System.out.println("执行完毕\n");
                        System.out.println("按任意键后返回上个界面");
                        input.nextLine();
                        studentSystem3();
                    }
                    else if(choose.equals("3")){
                        lFunc.setProjectFunds();
                        System.out.println("执行完毕\n");
                        System.out.println("按任意键后返回上个界面");
                        input.nextLine();
                        studentSystem3();
                    }
                    else if (choose.equals("4")){
                        homePage();
                    }
                    else if (choose.equals("5")){
                        System.out.println("Bye!");
                        return;
                    }
                }
                // break;// 记得跳出for循环

            }else if (is_leader.equals("否")){// 执行student的功能
                System.out.println("------欢迎使用研究生项目系统(学生)------\n" +
                        "1.查看自己导师的项目\n" +
                        "2.查看自己申请通过的项目\n" +
                        "3.申请项目\n" +
                        "4.返回主页面\n" +
                        "5.退出");
                System.out.println("请输入你的选择：");
                db.PA.function.Student sFunc = new db.PA.function.Student();
                while(true){
                    String choose = "";
                    choose = input.nextLine();
                    if(choose.equals("1")){
                        sFunc.searchTeacherProject();

                        System.out.println("执行结束\n按任意键后返回上个界面");
                        input.nextLine();
                        studentSystem3();
                    }
                    else if(choose.equals("2")){
                        sFunc.searchStudentProject(uid);//传入学生的id

                        System.out.println("执行完毕\n");
                        System.out.println("按任意键后返回上个界面");
                        input.nextLine();
                        studentSystem3();
                    }
                    else if(choose.equals("3")){
                        sFunc.projectApply();

                        System.out.println("执行完毕\n");
                        System.out.println("按任意键后返回上个界面");
                        input.nextLine();
                        studentSystem3();
                    }
                    else if (choose.equals("4")){
                        homePage();
                    }
                    else if (choose.equals("5")){
                        System.out.println("Bye!");
                        return;
                    }
                }
            }
        }
    }

    public static void teacherSystem3() throws Exception {

        System.out.println("-----欢迎使用研究生项目子系统(教师)---\n" +
                "1.查看自己的项目\n" +
                "2.做为导师对学生申请进行初审\n" +
                "3.做为项目负责人对学生申请进行终审\n" +
                "4.返回主页面\n" +
                "5.退出该子系统");
        System.out.println("请输入你的选择：");
        Scanner input = new Scanner(System.in);
        while (true){
            String c = input.nextLine();
            db.PA.function.Teacher tFunc = new db.PA.function.Teacher();
            if (c.equals("1")){
                tFunc.searchSelfProject(uid);

                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                teacherSystem3();

            }else if (c.equals("2")) {
                tFunc.firExamineApply();

                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                teacherSystem3();
            }else if (c.equals("3")) {
                tFunc.secExamineApply();

                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                teacherSystem3();
            }else if (c.equals("4")) {
                homePage();
            }else if (c.equals("5")) {
                System.out.println("Bye!");
                return;
            }
        }
    }

    public static void managerSystem3() throws Exception {

        System.out.println("-----欢迎使用研究生项目子系统(管理员)---\n" +
                "1.管理员对项目的信息输入\n" +
                "2.返回主页面\n" +
                "3.退出该子系统");
        System.out.println("请输入你的选择：");
        Scanner input = new Scanner(System.in);
        while (true){
            String c = input.nextLine();
            db.PA.function.Manager mFunc = new db.PA.function.Manager();
            if (c.equals("1")){
                mFunc.managerInsertProject();

                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                managerSystem3();

            }else if (c.equals("2")) {
                homePage();
            }else if (c.equals("3")){
                System.out.println("Bye!");
                return;
            }

        }
    }

    public static void system3() throws Exception {

        while (true){
            if(idf.equals("学生")){
                studentSystem3();
                break;
            }else if(idf.equals("教师")){
                teacherSystem3();
                break;
            }else if(idf.equals("管理员")){
                managerSystem3();
                break;
            }
        }
    }










    //------------------------------------子系统4研究生成果系统--------------------------------
    public static void studentSystem4() throws Exception {

        System.out.println("------欢迎使用研究生成果系统(学生)------\n" +
                "1.成果申请\n" +
                "2.查看成果基本信息\n" +
                "3.撤销成果\n" +
                "4.返回主页面\n" +
                "5.退出");
        System.out.println("请输入你的选择：");
        Scanner input = new Scanner(System.in);

        //studentFunction对象
        db.OutcomesSubsystem.functions.StudentFunctions sFunc = new db.OutcomesSubsystem.functions.StudentFunctions();

        while(true){
            String choose = "";
            choose = input.nextLine();
            //自行判断是不是博士生
            if(choose.equals("1")){
                System.out.println("请问你是否为博士生？（是/否）");
                String isPHD = input.nextLine();
                if (isPHD.equals("是")){
                    sFunc.resultApply(true);
                }else if (isPHD.equals("否")){
                    sFunc.resultApply(false);
                }else {
                    System.out.println("Error:wrong input");
                    return;
                }

                System.out.println("执行结束\n按任意键后返回上个界面");
                input.nextLine();
                studentSystem4();
            }
            else if(choose.equals("2")){
                sFunc.resultSearch();
                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                studentSystem4();
            }
            else if(choose.equals("3")){
                sFunc.resultDelete();
                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                studentSystem4();
            }
            else if (choose.equals("4")){
                homePage();
            }
            else if (choose.equals("5")){
                System.out.println("Bye!");
                return;
            }
        }
    }

    public static void teacherSystem4() throws Exception {

        System.out.println("------欢迎使用研究生成果子系统(教师)------\n" +
                "1.成果详情查看\n" +
                "2.成果初审\n" +
                "3.返回主页面\n" +
                "4.结束系统");
        System.out.println("请输入你的选择：");
        Scanner input = new Scanner(System.in);
        db.OutcomesSubsystem.functions.TeacherFunctions tFunc = new db.OutcomesSubsystem.functions.TeacherFunctions();
        while (true){
            String c = input.nextLine();

            if (c.equals("1")){
                tFunc.resultSearch();
                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                teacherSystem4();

            }else if (c.equals("2")) {
                tFunc.resultFirCensor();
                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                teacherSystem4();

            }else if (c.equals("3")){
                homePage();
            }else if (c.equals("4")){
                System.out.println("Bye!");
                return;
            }
        }
    }


    public static void managerSystem4() throws Exception {

        System.out.println("-----欢迎使用研究生成果子系统(管理员)---\n" +
                "1.成果详情查看\n" +
                "2.成果终审\n" +
                "3.返回主页面" +
                "4.退出该子系统");
        System.out.println("请输入你的选择：");
        Scanner input = new Scanner(System.in);
        while (true){

            String c = input.nextLine();
            db.OutcomesSubsystem.functions.ManagerFunctions mFunc = new db.OutcomesSubsystem.functions.ManagerFunctions();
            if (c.equals("1")){
                mFunc.resultSearch();
                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                managerSystem4();

            }else if (c.equals("2")) {
                mFunc.resultSecCensor();
                System.out.println("执行完毕\n");
                System.out.println("按任意键后返回上个界面");
                input.nextLine();
                managerSystem4();

            }else if (c.equals("3")){
                homePage();
            }else if (c.equals("4")){
                System.out.println("Bye!");
                return;
            }
        }
    }

    public static void system4() throws Exception {

        while (true){
            if(idf.equals("学生")){
                studentSystem4();
                break;
            }else if(idf.equals("教师")){
                teacherSystem4();
                break;
            }else if(idf.equals("管理员")){
                managerSystem4();
                break;
            }
        }
    }

    //-----------------------------------子系统5身份信息管理子系统------------------------------
    public static void managerSystem5(){

    }
    // 这里还没写！
    public static void teacherSystem5(){

    }

    public static void system5(){
        System.out.println("1.管理员身份登录");
        System.out.println("2.学科负责人身份登录");
        Scanner input = new Scanner(System.in);
        while (true){
            if(idf.equals("管理员")){
                managerSystem5();
            }else if(idf.equals("教师")){
                teacherSystem5();
            }
        }
    }

    // -------------------------------homepage 主页面--------------------------------

    /**
     * homepage()
     * @throws Exception
     */
    public static void homePage() throws Exception {
        Scanner input = new Scanner(System.in);
        // 进入主界面
        System.out.println("**********************\n欢迎使用研究生综合管理系统");
        System.out.println("1.研究生助教系统\n" +
                "2.研究生学术活动认证系统\n" +
                "3.研究生项目系统\n" +
                "4.研究生成果系统\n" +
                "5.身份信息管理系统\n" +
                "6.退出");
        System.out.println("*******BY 键值队*******");
        System.out.println("请输入你的选择：");
        while (true) {
            String c = input.nextLine();
            if (c.equals("1")){
                // 开始运行子系统 1
                system1();
                break;
            }else if (c.equals("2")){
                system2();
                break;
            }else if (c.equals("3")){
                system3();
                break;
            }else if (c.equals("4")) {
                system4();
                break;
            }
            else if (c.equals("5")){
                system5();
                break;
            }

            // 设置结束条件
            if(c.equals("6")){
                break;
            }
        }

    }




    //---------------------------------------------main----------------------------------------------------------

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("**********************\n欢迎使用研究生综合管理系统");
            System.out.println("请输入账号：");
            uid = input.nextLine();
            System.out.println("请输入密码：");
            psw = input.nextLine();
            System.out.println("请输入身份：(学生/教师/管理员)");
            while (true){
                idf = input.nextLine();
                if ((!idf.equals("学生")) & (!idf.equals("教师")) & (!idf.equals("管理员"))){
                    System.out.println("身份输入有误，请重新输入！");
                }else {
                    break;
                }
            }
            // 判断身份
            if(DAOFactory.getInstance().getloginDAO().checkLogin(uid, psw) == 1){
                System.out.println("登录成功！\n");
                break;

            }else {
                System.out.println("登录失败");
            }
        }

        // 操作主页面
        homePage();

    }

}


