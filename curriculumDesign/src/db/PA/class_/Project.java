package db.PA.class_;

public class Project {
    private String p_id;                //项目id
    private String p_name;              //项目名称
    private String p_status;            //项目状态
    private String p_responsible_id;    //负责人id
    private String p_type;              //项目类型
    private String p_funds;             //项目经费
    private String p_begin_time;        //开始时间
    private String p_end_time;          //结束时间
    private String p_is_adopt;          //是否通过

    public Project(){}

    public Project(String p_id, String p_name, String p_status, String p_responsible_id, String p_type, String p_begin_time, String p_end_time) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_status = p_status;
        this.p_responsible_id = p_responsible_id;
        this.p_type = p_type;
        this.p_funds = "";
        this.p_begin_time = p_begin_time;
        this.p_end_time = p_end_time;
        this.p_is_adopt = "未通过";
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_status() {
        return p_status;
    }

    public void setP_status(String p_status) {
        this.p_status = p_status;
    }

    public String getP_responsible_id() {
        return p_responsible_id;
    }

    public void setP_responsible_id(String p_responsible_id) {
        this.p_responsible_id = p_responsible_id;
    }

    public String getP_type() {
        return p_type;
    }

    public void setP_type(String p_type) {
        this.p_type = p_type;
    }

    public String getP_funds() {
        return p_funds;
    }

    public void setP_funds(String p_funds) {
        this.p_funds = p_funds;
    }

    public String getP_begin_time() {
        return p_begin_time;
    }

    public void setP_begin_time(String p_begin_time) {
        this.p_begin_time = p_begin_time;
    }

    public String getP_end_time() {
        return p_end_time;
    }

    public void setP_end_time(String p_end_time) {
        this.p_end_time = p_end_time;
    }

    public String getP_is_adopt() {
        return p_is_adopt;
    }

    public void setP_is_adopt(String p_is_adopt) {
        this.p_is_adopt = p_is_adopt;
    }

    @Override
    public String toString() {
        return "projectinfo{" +
                "p_id='" + p_id + '\'' +
                ", p_name='" + p_name + '\'' +
                ", p_status='" + p_status + '\'' +
                ", p_responsible_id='" + p_responsible_id + '\'' +
                ", p_type='" + p_type + '\'' +
                ", p_funds='" + p_funds + '\'' +
                ", p_begin_time='" + p_begin_time + '\'' +
                ", p_end_time='" + p_end_time + '\'' +
                ", p_is_adopt='" + p_is_adopt + '\'' +
                '}';
    }
}
