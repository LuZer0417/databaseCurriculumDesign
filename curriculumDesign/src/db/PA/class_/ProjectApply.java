package db.PA.class_;

public class ProjectApply {
    private String p_id;//项目id
    private String s_id;//学生id
    private String s_job;//学生工作
    private String p_is_tutor_adopt;//导师是否通过
    private String p_is_responsible_adopt;//项目负责人是否通过

    public ProjectApply(){
    }
    public ProjectApply(String p_id, String s_id, String s_job) {
        this.p_id = p_id;
        this.s_id = s_id;
        this.s_job = s_job;
        this.p_is_tutor_adopt = "未通过";
        this.p_is_responsible_adopt = "未通过";
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getS_job() {
        return s_job;
    }

    public void setS_job(String s_job) {
        this.s_job = s_job;
    }

    public String getP_is_tutor_adopt() {
        return p_is_tutor_adopt;
    }

    public void setP_is_tutor_adopt(String p_is_tutor_adopt) {
        this.p_is_tutor_adopt = p_is_tutor_adopt;
    }

    public String getP_is_responsible_adopt() {
        return p_is_responsible_adopt;
    }

    public void setP_is_responsible_adopt(String p_is_responsible_adopt) {
        this.p_is_responsible_adopt = p_is_responsible_adopt;
    }

    @Override
    public String toString() {
        return "projectEvaluate{" +
                "p_id='" + p_id + '\'' +
                ", s_id='" + s_id + '\'' +
                ", s_job='" + s_job + '\'' +
                ", p_is_tutor_adopt='" + p_is_tutor_adopt + '\'' +
                ", p_is_responsible_adopt='" + p_is_responsible_adopt + '\'' +
                '}';
    }
}
