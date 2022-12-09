package db.publicClass_;

public class Course {
    private String c_id;//学生id，非空，主键
    private String c_name;//学生姓名，非空
    private boolean is_compulsory;//该课程是否为必修，非空
    private int c_size;//课程容量，即学生数量
    private int c_credit;//学分
    private String c_target_stu;//面向的学生类型
    private String c_start_time;//课程开始时间，为smalldatetime类型
    private int c_hour;//课时数量
    private int c_priority;//课程优先级
    private boolean c_with_TA;//课程是否有助教
    private String assistant_id;//助教的id
    private String c_teacher_id;//授课教师id，非空

    public Course(String c_id, String c_name, boolean is_compulsory, int c_size, int c_credit, String c_target_stu, String c_start_time, int c_hour, int c_priority, boolean c_with_TA, String assistant_id, String c_teacher_id) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.is_compulsory = is_compulsory;
        this.c_size = c_size;
        this.c_credit = c_credit;
        this.c_target_stu = c_target_stu;
        this.c_start_time = c_start_time;
        this.c_hour = c_hour;
        this.c_priority = c_priority;
        this.c_with_TA = c_with_TA;
        this.assistant_id = assistant_id;
        this.c_teacher_id = c_teacher_id;
    }

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public boolean isIs_compulsory() {
        return is_compulsory;
    }

    public void setIs_compulsory(boolean is_compulsory) {
        this.is_compulsory = is_compulsory;
    }

    public int getC_size() {
        return c_size;
    }

    public void setC_size(int c_size) {
        this.c_size = c_size;
    }

    public int getC_credit() {
        return c_credit;
    }

    public void setC_credit(int c_credit) {
        this.c_credit = c_credit;
    }

    public String getC_target_stu() {
        return c_target_stu;
    }

    public void setC_target_stu(String c_target_stu) {
        this.c_target_stu = c_target_stu;
    }

    public String getC_start_time() {
        return c_start_time;
    }

    public void setC_start_time(String c_start_time) {
        this.c_start_time = c_start_time;
    }

    public int getC_hour() {
        return c_hour;
    }

    public void setC_hour(int c_hour) {
        this.c_hour = c_hour;
    }

    public int getC_priority() {
        return c_priority;
    }

    public void setC_priority(int c_priority) {
        this.c_priority = c_priority;
    }

    public boolean isC_with_TA() {
        return c_with_TA;
    }

    public void setC_with_TA(boolean c_with_TA) {
        this.c_with_TA = c_with_TA;
    }

    public String getAssistant_id() {
        return assistant_id;
    }

    public void setAssistant_id(String assistant_id) {
        this.assistant_id = assistant_id;
    }

    public String getC_teacher_id() {
        return c_teacher_id;
    }

    public void setC_teacher_id(String c_teacher_id) {
        this.c_teacher_id = c_teacher_id;
    }

    @Override
    public String toString() {
        return "Course{" +
                "c_id='" + c_id + '\'' +
                ", c_name='" + c_name + '\'' +
                ", is_compulsory=" + is_compulsory +
                ", c_size=" + c_size +
                ", c_credit=" + c_credit +
                ", c_target_stu='" + c_target_stu + '\'' +
                ", c_start_time='" + c_start_time + '\'' +
                ", c_hour=" + c_hour +
                ", c_priority=" + c_priority +
                ", c_with_TA=" + c_with_TA +
                ", assistant_id='" + assistant_id + '\'' +
                ", c_teacher_id='" + c_teacher_id + '\'' +
                '}';
    }
}
