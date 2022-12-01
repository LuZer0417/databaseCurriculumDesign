package db.class_;

public class Course {
    //12个属性
    private String course_no;
    private String course_name;
    private String course_type;
    private int course_size;// 课程容量
    private String course_target;
    private String course_start_time;
    private float course_credit;
    private int course_hour;
    private String course_teacher_name;
    private String course_teacher_no;
    private Byte course_whit_TA;// 是否有助教
    private String course_priority;// 课程优先级

    // 构造函数


    public Course(String course_no, String course_name, String course_type, int course_size, String course_target, String course_start_time, float course_credit, int course_hour, String course_teacher_name, String course_teacher_no, Byte course_whit_TA, String course_priority) {
        this.course_no = course_no;
        this.course_name = course_name;
        this.course_type = course_type;
        this.course_size = course_size;
        this.course_target = course_target;
        this.course_start_time = course_start_time;
        this.course_credit = course_credit;
        this.course_hour = course_hour;
        this.course_teacher_name = course_teacher_name;
        this.course_teacher_no = course_teacher_no;
        this.course_whit_TA = course_whit_TA;
        this.course_priority = course_priority;
    }

    //

    public String getCourse_no() {
        return course_no;
    }

    public void setCourse_no(String course_no) {
        this.course_no = course_no;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_type() {
        return course_type;
    }

    public void setCourse_type(String course_type) {
        this.course_type = course_type;
    }

    public int getCourse_size() {
        return course_size;
    }

    public void setCourse_size(int course_size) {
        this.course_size = course_size;
    }

    public String getCourse_target() {
        return course_target;
    }

    public void setCourse_target(String course_target) {
        this.course_target = course_target;
    }

    public String getCourse_start_time() {
        return course_start_time;
    }

    public void setCourse_start_time(String course_start_time) {
        this.course_start_time = course_start_time;
    }

    public float getCourse_credit() {
        return course_credit;
    }

    public void setCourse_credit(float course_credit) {
        this.course_credit = course_credit;
    }

    public int getCourse_hour() {
        return course_hour;
    }

    public void setCourse_hour(int course_hour) {
        this.course_hour = course_hour;
    }

    public String getCourse_teacher_name() {
        return course_teacher_name;
    }

    public void setCourse_teacher_name(String course_teacher_name) {
        this.course_teacher_name = course_teacher_name;
    }

    public String getCourse_teacher_no() {
        return course_teacher_no;
    }

    public void setCourse_teacher_no(String course_teacher_no) {
        this.course_teacher_no = course_teacher_no;
    }

    public Byte getCourse_whit_TA() {
        return course_whit_TA;
    }

    public void setCourse_whit_TA(Byte course_whit_TA) {
        this.course_whit_TA = course_whit_TA;
    }

    public String getCourse_priority() {
        return course_priority;
    }

    public void setCourse_priority(String course_priority) {
        this.course_priority = course_priority;
    }
    // toString方法


    @Override
    public String toString() {
        return "Course{" +
                "course_no='" + course_no + '\'' +
                ", course_name='" + course_name + '\'' +
                ", course_type='" + course_type + '\'' +
                ", course_size=" + course_size +
                ", course_target='" + course_target + '\'' +
                ", course_start_time='" + course_start_time + '\'' +
                ", course_credit=" + course_credit +
                ", course_hour=" + course_hour +
                ", course_teacher_name='" + course_teacher_name + '\'' +
                ", course_teacher_no='" + course_teacher_no + '\'' +
                ", course_whit_TA=" + course_whit_TA +
                ", course_priority='" + course_priority + '\'' +
                '}';
    }
}
