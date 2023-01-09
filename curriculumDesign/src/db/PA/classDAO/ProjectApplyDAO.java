package db.PA.classDAO;
import db.PA.class_.ProjectApply;
import java.util.LinkedList;

public interface ProjectApplyDAO {
    public void studentSubmit(ProjectApply pe);                 //学生对导师项目的申请
    public LinkedList<String> studentView(String s_id) throws Exception;   //学生对自己申请到的项目查看
    public void teacherExamine(String s_id,String p_id);        //教师审批学生提交项目的申请
    public void managerExamine(String s_id,String p_id);        //管理员对学生提交的项目进行审核
}
