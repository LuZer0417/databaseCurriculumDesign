package db.ACA.function;

import db.DAO.DAOFactory.DAOFactory;

public class studentFunction {
    public void f1(){
        DAOFactory.getInstance().getacademicActivityDAO().SearchACA_activities();
    }

    public void f2(String a_id,String a_name,String s_id){
        DAOFactory.getInstance().getacademicInfoDAO().SubmitInfo(a_id,a_name,s_id);
    }

    public void f3_1(String a_id,String s_id){
        DAOFactory.getInstance().getacademicInfoDAO().ViewACA_info(a_id,s_id);
    }

    public void f3_2(String a_id,String s_id){
        DAOFactory.getInstance().getacademicInfoDAO().Withdraw_Aplc(a_id,s_id);
    }


}
