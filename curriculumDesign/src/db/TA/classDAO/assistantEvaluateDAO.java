package db.TA.classDAO;

import db.TA.class_.assistantEvaluate;

public interface assistantEvaluateDAO {
    public void SearchEvaluation(String s_id);
    public void update_myeva(String s_id,String c_id,String my_eva);
    public void searcheva(String s_id,String c_id);
    public void add_assistant_evaluate(assistantEvaluate assis_eva);
    public void update_t_eva(String s_id,String c_id,String teacher_eva,String is_qualified);
    public void select_ta_sum();
    public void Searchqualified();
}
