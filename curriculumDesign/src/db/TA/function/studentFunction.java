package db.TA.function;

import db.DAO.DAOFactory.DAOFactory;
import db.TA.class_.assistantApply;

public class studentFunction {
    //学生功能2
    public void MyassistantResult(String s_id){
        DAOFactory.getInstance().getassistantEvaluateDAO().SearchEvaluation(s_id);
    }

    //学生功能3
    public void ApplyforAssistant(){
        DAOFactory.getInstance().getCourseDAO().SearchCourse1();
        assistantApply apply=new assistantApply();//需要初始化数据
        DAOFactory.getInstance().getassistantApplyDAO().addapply(apply);
    }

    //学生功能4
    public void updateMyEvaluation(){
        String s_id="",c_id="",my_eva="";
        DAOFactory.getInstance().getassistantEvaluateDAO().update_myeva(s_id,c_id,my_eva);
    }

    //学生功能5
    public void checkMyAssistantWork(){
        String s_id="",c_id="";
        DAOFactory.getInstance().getassistantEvaluateDAO().searcheva(s_id,c_id);
    }














}
