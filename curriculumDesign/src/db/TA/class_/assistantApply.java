package db.TA.class_;

public class assistantApply {
    private String s_id;//学生学号
    private String c_id;//课程号
    private String choice_priority;//申请时的志愿优先级？
    private String apply_time;//申请时间
    private String apply_status;//申请的状态，是否通过？

    public assistantApply(String s_id, String c_id, String choice_priority, String apply_time, String apply_status) {
        this.s_id = s_id;
        this.c_id = c_id;
        this.choice_priority = choice_priority;
        this.apply_time = apply_time;
        this.apply_status = apply_status;
    }
    public assistantApply(){}


    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getChoice_priority() {
        return choice_priority;
    }

    public void setChoice_priority(String choice_priority) {
        this.choice_priority = choice_priority;
    }

    public String getApply_time() {
        return apply_time;
    }

    public void setApply_time(String apply_time) {
        this.apply_time = apply_time;
    }

    public String getApply_status() {
        return apply_status;
    }

    public void setApply_status(String apply_status) {
        this.apply_status = apply_status;
    }

    @Override
    public String toString() {
        return "asistantApply{" +
                "s_id='" + s_id + '\'' +
                ", c_id='" + c_id + '\'' +
                ", choice_priority='" + choice_priority + '\'' +
                ", apply_time='" + apply_time + '\'' +
                ", apply_status='" + apply_status + '\'' +
                '}';
    }
}


