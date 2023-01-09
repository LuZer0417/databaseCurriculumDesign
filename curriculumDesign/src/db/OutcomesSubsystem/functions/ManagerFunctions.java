package db.OutcomesSubsystem.functions;

import db.DAO.DAOFactory.DAOFactory;
import db.OutcomesSubsystem.table.Result;

import java.util.Scanner;

public class ManagerFunctions {
    //成果详情查看
    public static void resultSearch() throws Exception {
        System.out.println("**********成果查看界面**********");
        System.out.print("请输入你要查询的成果id：");
        Scanner sc = new Scanner(System.in);
        String RNO = sc.nextLine();
        Result result = DAOFactory.getInstance().getResultDAO().selectResult(RNO);
        System.out.println(result);
        switch (result.getResult_class()){
            case "论文":
                System.out.println(DAOFactory.getInstance().getPaperDAO().selectPaper(RNO).toString());
                break;
            case "奖励":
                System.out.println(DAOFactory.getInstance().getRewardDAO().selectReward(RNO));
                break;
            case "标准":
                System.out.println(DAOFactory.getInstance().getStandardDAO().selectStandard(RNO));
                break;
            case "专利":
                System.out.println(DAOFactory.getInstance().getPatentDAO().selectPatent(RNO));
                break;
            case "报告":
                System.out.println(DAOFactory.getInstance().getReportDAO().selectReport(RNO));
                break;
            case "软硬件平台":
                System.out.println(DAOFactory.getInstance().getWareDAO().selectWare(RNO));
                break;
            case "教材":
                System.out.println(DAOFactory.getInstance().getBookDAO().selectBook(RNO));
                break;
            case "其它":
                System.out.println(DAOFactory.getInstance().getOtherDAO().selectOther(RNO));
                break;
        }
        System.out.println("**********成果查看成功**********");
    }

    //成果终审
    public static void resultSecCensor() throws Exception {
        System.out.println("**********成果终审界面**********");
        System.out.print("请输入你要通过的成果id：");
        Scanner sc = new Scanner(System.in);
        String RNO = sc.nextLine();
        DAOFactory.getInstance().getResultDAO().updateSecCensor(RNO);
        System.out.println("**********终审更改成功**********");
    }
}
