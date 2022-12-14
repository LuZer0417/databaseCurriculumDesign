package db.ACA.function;

import db.ACA.class_.academicActivity;
import db.DAO.DAOFactory.DAOFactory;

public class managerFunction {
    public void f1(String a_id){
        DAOFactory.getInstance().getacademicActivityDAO().ViewACA_activities(a_id);
    }

    public void f2(String m_audit,String a_id,String s_id){
        DAOFactory.getInstance().getacademicInfoDAO().Review_aplc2(m_audit,a_id,s_id);
    }

    public void f3(String s_id){
        DAOFactory.getInstance().getacademicInfoDAO().CheckTimes(s_id);
    }
}
