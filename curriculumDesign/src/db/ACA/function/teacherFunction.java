package db.ACA.function;

import db.ACA.class_.academicActivity;
import db.DAO.DAOFactory.DAOFactory;

public class teacherFunction {
    public void f1(String a_id){
        DAOFactory.getInstance().getacademicActivityDAO().ViewACA_activities(a_id);
    }

    public void f2(String t_audit,String a_id,String s_id){
        DAOFactory.getInstance().getacademicInfoDAO().Review_aplc1(t_audit,a_id,s_id);
    }

    public void f3(academicActivity ACA){
        DAOFactory.getInstance().getacademicActivityDAO().PostACA_activities(ACA);
    }
}
