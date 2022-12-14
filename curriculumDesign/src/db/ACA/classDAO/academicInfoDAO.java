package db.ACA.classDAO;

public interface academicInfoDAO {
    public void SubmitInfo(String a_id,String a_name,String s_id);
    public void ViewACA_info(String a_id,String s_id);
    public void Withdraw_Aplc(String a_id,String s_id);
    public void Review_aplc1(String t_audit,String a_id,String s_id);
    public void Review_aplc2(String m_audit,String a_id,String s_id);
    public void CheckTimes(String s_id);
}
