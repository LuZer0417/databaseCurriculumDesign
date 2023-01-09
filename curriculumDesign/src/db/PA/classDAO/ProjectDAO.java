package db.PA.classDAO;
import db.PA.class_.Project;

import java.util.LinkedList;

public interface ProjectDAO {
    public void studentViewTeacher(String p_responsible_id);                             //学生查看自己导师的所有项目
    public Project studentSelfView(String p_id) throws Exception;                                            //学生查看自己申请到的项目详细信息
    public void teacherSelfView(String p_responsible_id);                                //导师自己对自己拥有的项目的查看
    public void leaderSetBudget(String p_id,String budget) throws Exception;             //学科负责人对项目经费的批复
    public void leaderExamine(String p_id) throws Exception;                             //学科负责人对项目的审核
    public void managerApply(Project PA);                                                //管理员对导师项目的录入
}
