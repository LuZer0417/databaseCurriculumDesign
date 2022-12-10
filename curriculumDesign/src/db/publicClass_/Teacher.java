package db.publicClass_;

public class Teacher {
    private String t_id;
    private String t_name;
    private String major_id;
    private boolean is_tutor;// 是否为导师
    private boolean is_leader;// 是否为学科负责人
    private boolean is_teacher;// 是否授课

    public Teacher(String t_id, String t_name, String major_id, boolean is_tutor, boolean is_leader, boolean is_teacher) {
        this.t_id = t_id;
        this.t_name = t_name;
        this.major_id = major_id;
        this.is_tutor = is_tutor;
        this.is_leader = is_leader;
        this.is_teacher = is_teacher;
    }

    public Teacher() {

    }

    public String getT_id() {
        return t_id;
    }

    public void setT_id(String t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getMajor_id() {
        return major_id;
    }

    public void setMajor_id(String major_id) {
        this.major_id = major_id;
    }

    public boolean isIs_tutor() {
        return is_tutor;
    }

    public void setIs_tutor(boolean is_tutor) {
        this.is_tutor = is_tutor;
    }

    public boolean isIs_leader() {
        return is_leader;
    }

    public void setIs_leader(boolean is_leader) {
        this.is_leader = is_leader;
    }

    public boolean isIs_teacher() {
        return is_teacher;
    }

    public void setIs_teacher(boolean is_teacher) {
        this.is_teacher = is_teacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "t_id='" + t_id + '\'' +
                ", t_name='" + t_name + '\'' +
                ", major_id='" + major_id + '\'' +
                ", is_tutor=" + is_tutor +
                ", is_leader=" + is_leader +
                ", is_teacher=" + is_teacher +
                '}';
    }
}
