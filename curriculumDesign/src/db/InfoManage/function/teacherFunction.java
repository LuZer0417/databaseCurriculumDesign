package db.InfoManage.function;

import db.DAO.DAOFactory.DAOFactory;

public class teacherFunction {
    //学科负责人功能：查看学科下的导师信息以及研究生培养情况。
    public void f1(String major_id){
        DAOFactory.getInstance().getTeacherDAO().Select1(major_id);
        DAOFactory.getInstance().getStudentDAO().Select1(major_id);
    }

}
