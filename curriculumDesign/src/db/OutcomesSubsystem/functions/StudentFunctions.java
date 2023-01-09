package db.OutcomesSubsystem.functions;

import db.DAO.DAOFactory.DAOFactory;
import db.OutcomesSubsystem.table.*;

import java.util.Scanner;

public class StudentFunctions {

    //成果申请
    public static void resultApply(boolean isPHD) throws Exception {
        System.out.println("**********成果申请界面**********");
        Scanner sc = new Scanner(System.in);
        //研究生申请
        if (!isPHD) {
            //输入成果基本信息
            System.out.println("请输入成果基本信息：");
            System.out.print("成果ID：");
            String RNO = sc.nextLine();
            System.out.print("学生ID：");
            String stu_id = sc.nextLine();
            System.out.print("学位：");
            String degree = sc.nextLine();
            System.out.print("成果类型：");
            String type = sc.nextLine();
            Result result = new Result(RNO, stu_id, degree, type);
            //写入成果基本信息表
            DAOFactory.getInstance().getResultDAO().insertResult(result);

            //输入对应类别的成果详细信息
            switch (type) {
                case "论文":
                    System.out.println("请输入论文详细信息：");
                    System.out.print("论文名称：");
                    String paper_name = sc.nextLine();
                    System.out.print("期刊：");
                    String paper_magazine = sc.nextLine();
                    System.out.print("论文状态（已发/未发）：");
                    String paper_state = sc.nextLine();
                    System.out.print("发表时间：");
                    String paper_time = sc.nextLine();
                    System.out.print("索引类型：");
                    String index_type = sc.nextLine();
                    System.out.print("所属学院库：");
                    String store = sc.nextLine();
                    System.out.print("论文内容（材料）：");
                    String paper_souce = sc.nextLine();
                    Paper paper = new Paper(RNO, paper_name, paper_magazine, paper_state, paper_time, index_type, store, paper_souce);
                    DAOFactory.getInstance().getPaperDAO().insertPaper(paper);
                    System.out.println("**********成果申请成功**********");
                    break;
                case "奖励":
                    System.out.println("请输入奖励详细信息：");
                    System.out.print("奖励名称：");
                    String reward_name = sc.nextLine();
                    System.out.print("奖励类型：");
                    String reward_type = sc.nextLine();
                    System.out.print("奖励等级：");
                    String reward_level = sc.nextLine();
                    System.out.print("奖励排名：");
                    String reward_rank = sc.nextLine();
                    System.out.print("奖励时间：");
                    String reward_time = sc.nextLine();
                    System.out.print("奖励内容：");
                    String reward_source = sc.nextLine();
                    Reward reward = new Reward(RNO, reward_name, reward_type, reward_level, reward_rank, reward_time, reward_source);
                    DAOFactory.getInstance().getRewardDAO().insertReward(reward);
                    System.out.println("**********成果申请成功**********");
                    break;
                case "标准":
                    System.out.println("请输入标准详细信息：");
                    System.out.print("标准类型：");
                    String standard_type = sc.nextLine();
                    System.out.print("标准时间：");
                    String standar_time = sc.nextLine();
                    System.out.print("标准内容：");
                    String standard_source = sc.nextLine();
                    Standard standard = new Standard(RNO, standard_type, standar_time, standard_source);
                    DAOFactory.getInstance().getStandardDAO().insertStandard(standard);
                    System.out.println("**********成果申请成功**********");
                    break;
                case "其它":
                    System.out.println("请输入其它详细信息：");
                    System.out.print("详细内容：");
                    String source = sc.nextLine();
                    Other other = new Other(RNO, source);
                    DAOFactory.getInstance().getOtherDAO().insertOther(other);
                    System.out.println("**********成果申请成功**********");
                    break;
            }
        }
        //博士生申请
        else {
            //输入成果基本信息
            System.out.println("请输入成果基本信息：");
            System.out.print("成果ID：");
            String RNO = sc.nextLine();
            System.out.print("学生ID：");
            String stu_id = sc.nextLine();
            System.out.print("学位：");
            String degree = sc.nextLine();
            System.out.print("成果类型：");
            String type = sc.nextLine();
            Result result = new Result(RNO, stu_id, degree, type);
            //写入成果基本信息表
            DAOFactory.getInstance().getResultDAO().insertResult(result);

            //输入对应类别的成果详细信息
            switch (type) {
                case "论文":
                    System.out.println("请输入论文详细信息：");
                    System.out.print("论文名称：");
                    String paper_name = sc.nextLine();
                    System.out.print("期刊：");
                    String paper_magazine = sc.nextLine();
                    System.out.print("论文状态（已发/未发）：");
                    String paper_state = sc.nextLine();
                    System.out.print("发表时间：");
                    String paper_time = sc.nextLine();
                    System.out.print("索引类型：");
                    String index_type = sc.nextLine();
                    System.out.print("所属学院库：");
                    String store = sc.nextLine();
                    System.out.print("论文内容（材料）：");
                    String paper_souce = sc.nextLine();
                    Paper paper = new Paper(RNO, paper_name, paper_magazine, paper_state, paper_time, index_type, store, paper_souce);
                    DAOFactory.getInstance().getPaperDAO().insertPaper(paper);
                    System.out.println("**********成果申请成功**********");
                    break;
                case "标准":
                    System.out.println("请输入标准详细信息：");
                    System.out.print("标准类型：");
                    String standard_type = sc.nextLine();
                    System.out.print("标准时间");
                    String standar_time = sc.nextLine();
                    System.out.print("标准内容：");
                    String standard_source = sc.nextLine();
                    Standard standard = new Standard(RNO, standard_type, standar_time, standard_source);
                    DAOFactory.getInstance().getStandardDAO().insertStandard(standard);
                    System.out.println("**********成果申请成功**********");
                    break;
                case "专利":
                    System.out.println("请输入专利详细信息：");
                    System.out.print("专利名称：");
                    String patent_name = sc.nextLine();
                    System.out.print("专利类型：");
                    String patent_type = sc.nextLine();
                    System.out.print("专利号：");
                    String patent_id = sc.nextLine();
                    System.out.print("专利时间：");
                    String patent_time = sc.nextLine();
                    System.out.print("专利状态：");
                    String patent_state = sc.nextLine();
                    System.out.print("专利等级：");
                    String patent_rank = sc.nextLine();
                    System.out.print("专利内容：");
                    String patent_source = sc.nextLine();
                    Patent patent = new Patent(RNO, patent_name, patent_type, patent_id, patent_time, patent_state, patent_rank, patent_source);
                    DAOFactory.getInstance().getPatentDAO().insertPatent(patent);
                    System.out.println("**********成果申请成功**********");
                    break;
                case "报告":
                    System.out.println("请输入报告详细信息：");
                    System.out.print("报告名称：");
                    String report_name = sc.nextLine();
                    System.out.print("报告类型：");
                    String report_type = sc.nextLine();
                    System.out.print("报告所属：");
                    String report_company = sc.nextLine();
                    System.out.print("报告时间：");
                    String report_time = sc.nextLine();
                    System.out.print("报告排名：");
                    String report_rank = sc.nextLine();
                    System.out.print("报告内容：");
                    String report_source = sc.nextLine();
                    Report report = new Report(RNO, report_name, report_type, report_company, report_time, report_rank, report_source);
                    DAOFactory.getInstance().getReportDAO().insertReport(report);
                    System.out.println("**********成果申请成功**********");
                    break;
                case "软硬件平台":
                    System.out.println("请输入软硬件详细信息：");
                    System.out.print("软硬件名称：");
                    String ware_name = sc.nextLine();
                    System.out.print("软硬件所属：");
                    String ware_company = sc.nextLine();
                    System.out.print("软硬件时间：");
                    String ware_time = sc.nextLine();
                    System.out.print("软硬件排名：");
                    String ware_rank = sc.nextLine();
                    System.out.print("软硬件内容：");
                    String ware_source = sc.nextLine();
                    Ware ware = new Ware(RNO, ware_name, ware_company, ware_time, ware_rank, ware_source);
                    DAOFactory.getInstance().getWareDAO().insertWare(ware);
                    System.out.println("**********成果申请成功**********");
                    break;
                case "教材":
                    System.out.println("请输入教材详细信息：");
                    System.out.print("教材名称：");
                    String book_name = sc.nextLine();
                    System.out.print("教材所属：");
                    String book_company = sc.nextLine();
                    System.out.print("教材排名：");
                    String book_rank = sc.nextLine();
                    System.out.print("教材内容：");
                    String book_source = sc.nextLine();
                    Book book = new Book(RNO, book_name, book_company, book_rank, book_source);
                    DAOFactory.getInstance().getBookDAO().insertBook(book);
                    System.out.println("**********成果申请成功**********");
                    break;
                case "其它":
                    System.out.println("请输入其它详细信息：");
                    System.out.print("详细内容：");
                    String source = sc.nextLine();
                    Other other = new Other(RNO, source);
                    DAOFactory.getInstance().getOtherDAO().insertOther(other);
                    System.out.println("**********成果申请成功**********");
                    break;
            }
        }
    }


    //查看成果基本信息
    public static void resultSearch() throws Exception {
        System.out.println("**********成果查看界面**********");
        System.out.print("请输入你要查询的成果id：");
        Scanner sc = new Scanner(System.in);
        String RNO = sc.nextLine();
        Result result = DAOFactory.getInstance().getResultDAO().selectResult(RNO);
        System.out.println(result);
        System.out.println("**********成果查看成功**********");
    }

    //撤销成果
    public static void resultDelete() throws Exception {
        System.out.println("**********成果撤销界面**********");
        System.out.print("请输入你要撤销的成果id：");
        Scanner sc = new Scanner(System.in);
        String RNO = sc.nextLine();
        //首先查找对应成果类型
        Result result = DAOFactory.getInstance().getResultDAO().selectResult(RNO);
        //根据成果类型进行相应的删除
        switch (result.getResult_class()) {
            case "论文":
                DAOFactory.getInstance().getPaperDAO().deletePaper(RNO);
                break;
            case "奖励":
                DAOFactory.getInstance().getRewardDAO().deleteReward(RNO);
                break;
            case "标准":
                DAOFactory.getInstance().getStandardDAO().deleteStandard(RNO);
                break;
            case "专利":
                DAOFactory.getInstance().getPatentDAO().deletePatent(RNO);
                break;
            case "报告":
                DAOFactory.getInstance().getReportDAO().deleteReport(RNO);
                break;
            case "软硬件平台":
                DAOFactory.getInstance().getWareDAO().deleteWare(RNO);
                break;
            case "教材":
                DAOFactory.getInstance().getBookDAO().deleteBook(RNO);
                break;
            case "其它":
                DAOFactory.getInstance().getOtherDAO().deleteOther(RNO);
                break;
        }
        DAOFactory.getInstance().getResultDAO().deleteResult(RNO);
        System.out.println("**********成果撤销成功**********");
    }
}
