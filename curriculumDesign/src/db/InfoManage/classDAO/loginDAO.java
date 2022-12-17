package db.InfoManage.classDAO;

import db.InfoManage.class_.login;

public interface loginDAO {
    public void addInfo(login lg);
    public void delInfo(String id);
    public void updateInfo(String pw);
}
