package db.InfoManage.class_;

public class login {
    private String id;//登录id
    private String password;//登录密码
    private String idt;//身份，教师/学生/管理员

    public login() {
    }

    public login(String id, String password, String idt) {
        this.id = id;
        this.password = password;
        this.idt = idt;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdt() {
        return idt;
    }

    public void setIdt(String idt) {
        this.idt = idt;
    }
}
