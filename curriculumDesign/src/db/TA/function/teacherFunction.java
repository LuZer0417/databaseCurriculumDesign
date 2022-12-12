package db.TA.function;

import db.DAO.DAOFactory.DAOFactory;
import db.TA.class_.assistantEvaluate;

public class teacherFunction {
    //教师功能1
    public void ManageAssistantApply(){
        String c_id="";
        DAOFactory.getInstance().getassistantApplyDAO().search_apply(c_id);
        String Status="",s_id="";
        DAOFactory.getInstance().getassistantApplyDAO().update_apply(Status,s_id,c_id);
        assistantEvaluate assis_eva=new assistantEvaluate();
        DAOFactory.getInstance().getassistantEvaluateDAO().add_assistant_evaluate(assis_eva);
        Boolean with_TA=Boolean.TRUE;
        DAOFactory.getInstance().getCourseDAO().updateCourse(c_id,with_TA);

        //还有不通过的部分：
       /* Boolean with_TA=Boolean.FALSE;
        DAOFactory.getInstance().getCourseDAO().updateCourse(c_id,with_TA);*/
    }

    //教师功能2
    public void EvaluateAssistantWork(){
        String s_id="",c_id="",teacher_eva="",is_qualified="";
        DAOFactory.getInstance().getassistantEvaluateDAO().update_t_eva(s_id,c_id,teacher_eva,is_qualified);
    }

    //教师功能3
    public void Search_Course_and_Assistant_info(){

    }





}
