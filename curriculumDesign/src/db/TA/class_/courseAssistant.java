package db.TA.class_;

public class courseAssistant {
    private String s_id;//学生学号
    private String c_id;//课程号

    public courseAssistant() {
    }

    public courseAssistant(String s_id, String c_id) {
        this.s_id = s_id;
        this.c_id = c_id;
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

    @Override
    public String toString() {
        return "courseAsistant{" +
                "s_id='" + s_id + '\'' +
                ", c_id='" + c_id + '\'' +
                '}';
    }
}
