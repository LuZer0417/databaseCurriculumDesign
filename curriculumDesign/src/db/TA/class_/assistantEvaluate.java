package db.TA.class_;

public class assistantEvaluate {
    private String s_id;//学生学号
    private String c_id;//课程号
    private String my_eva;//自我评价
    private String teacher_eva;//教师评价
    private String is_qualified;//助教工作是否合格

    public assistantEvaluate() {
    }

    public assistantEvaluate(String s_id, String c_id, String my_eva, String teacher_eva, String is_qualified) {
        this.s_id = s_id;
        this.c_id = c_id;
        this.my_eva = my_eva;
        this.teacher_eva = teacher_eva;
        this.is_qualified = is_qualified;
    }

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

    public String getMy_eva() {
        return my_eva;
    }

    public void setMy_eva(String my_eva) {
        this.my_eva = my_eva;
    }

    public String getTeacher_eva() {
        return teacher_eva;
    }

    public void setTeacher_eva(String teacher_eva) {
        this.teacher_eva = teacher_eva;
    }

    public String getIs_qualified() {
        return is_qualified;
    }

    public void setIs_qualified(String is_qualified) {
        this.is_qualified = is_qualified;
    }

    @Override
    public String toString() {
        return "asistantEvaluate{" +
                "s_id='" + s_id + '\'' +
                ", c_id='" + c_id + '\'' +
                ", my_eva='" + my_eva + '\'' +
                ", teacher_eva='" + teacher_eva + '\'' +
                ", is_qualified='" + is_qualified + '\'' +
                '}';
    }
}
