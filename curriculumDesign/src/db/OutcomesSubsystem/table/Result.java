package db.OutcomesSubsystem.table;

public class Result {
    private String RNO;                 //成果id
    private String stu_id;              //对应学生id
    private String degree;              //对应学生学位（硕士/博士）
    private String result_class;        //对应成果类别
    private String state_teacher;       //初审状态
    private String state_manager;       //终审状态

    public Result(){}
    public Result(String RNO, String stu_id, String degree, String result_class) {
        this.RNO = RNO;
        this.stu_id = stu_id;
        this.degree = degree;
        this.result_class = result_class;
        this.state_teacher = "未通过";
        this.state_manager = "未通过";
    }

    public String getRNO() {
        return RNO;
    }

    public void setRNO(String RNO) {
        this.RNO = RNO;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getResult_class() {
        return result_class;
    }

    public void setResult_class(String result_class) {
        this.result_class = result_class;
    }

    public String getState_teacher() {
        return state_teacher;
    }

    public void setState_teacher(String state_teacher) {
        this.state_teacher = state_teacher;
    }

    public String getState_manager() {
        return state_manager;
    }

    public void setState_manager(String state_manager) {
        this.state_manager = state_manager;
    }

    @Override
    public String toString() {
        return "Result{" +
                "RNO='" + RNO + '\'' +
                ", stu_id='" + stu_id + '\'' +
                ", degree='" + degree + '\'' +
                ", result_class='" + result_class + '\'' +
                ", state_teacher='" + state_teacher + '\'' +
                ", state_manager='" + state_manager + '\'' +
                '}';
    }
}
