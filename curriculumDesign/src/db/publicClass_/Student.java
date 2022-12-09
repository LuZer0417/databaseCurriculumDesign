package db.publicClass_;

public class Student {
    private String s_id;
    private String s_name;
    private String major_id;//专业id
    private String tutor_id;//导师id
    private String s_type;//学生类型，专硕/学硕


    public Student(String s_id, String s_name, String major_id, String tutor_id, String s_type) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.major_id = major_id;
        this.tutor_id = tutor_id;
        this.s_type = s_type;
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getMajor_id() {
        return major_id;
    }

    public void setMajor_id(String major_id) {
        this.major_id = major_id;
    }

    public String getTutor_id() {
        return tutor_id;
    }

    public void setTutor_id(String tutor_id) {
        this.tutor_id = tutor_id;
    }

    public String getS_type() {
        return s_type;
    }

    public void setS_type(String s_type) {
        this.s_type = s_type;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id='" + s_id + '\'' +
                ", s_name='" + s_name + '\'' +
                ", major_id='" + major_id + '\'' +
                ", tutor_id='" + tutor_id + '\'' +
                ", s_type='" + s_type + '\'' +
                '}';
    }
}
