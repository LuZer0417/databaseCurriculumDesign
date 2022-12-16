package db.ACA.classDAO;

import db.ACA.class_.academicActivity;

public interface academicActivityDAO {
    public int SearchACA_activities();
    public void ViewACA_activities(String a_id);
    public void PostACA_activities(academicActivity ACA);
}
