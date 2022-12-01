package db.class_;

public class Manager {
    private String manager_no;
    private String manager_name;
    private String manager_tel;

    //构造函数


    public Manager(String manager_no, String manager_name, String manager_tel) {
        this.manager_no = manager_no;
        this.manager_name = manager_name;
        this.manager_tel = manager_tel;
    }

    public String getManager_no() {
        return manager_no;
    }

    public void setManager_no(String manager_no) {
        this.manager_no = manager_no;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public String getManager_tel() {
        return manager_tel;
    }

    public void setManager_tel(String manager_tel) {
        this.manager_tel = manager_tel;
    }


    //

    @Override
    public String toString() {
        return "Manager{" +
                "manager_no='" + manager_no + '\'' +
                ", manager_name='" + manager_name + '\'' +
                ", manager_tel='" + manager_tel + '\'' +
                '}';
    }
}
