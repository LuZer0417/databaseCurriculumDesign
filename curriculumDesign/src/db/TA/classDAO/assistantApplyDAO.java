package db.TA.classDAO;

import db.TA.class_.assistantApply;

public interface assistantApplyDAO {
    public void addapply(assistantApply apply);
    public int searchApply(String c_id);
    public void update_apply(String Status,String s_id,String c_id);
    public void Select_stu();



}
