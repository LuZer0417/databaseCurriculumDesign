package db.class_;

public class Student {
    private String student_no;
    private String student_name;
    private String student_sex;
    private String student_tel;
    private String student_major;
    private String student_type;// 哪一种研究生
    private int student_certify_number;// 学术认证次数
    private Byte student_is_TA;// 是否为助教，1为是，0为否，默认为0

    public Student(String student_no, String student_name, String student_sex, String student_tel, String student_major, String student_type, int student_certify_number, Byte student_is_TA) {
        this.student_no = student_no;
        this.student_name = student_name;
        this.student_sex = student_sex;
        this.student_tel = student_tel;
        this.student_major = student_major;
        this.student_type = student_type;
        this.student_certify_number = student_certify_number;
        this.student_is_TA = student_is_TA;
    }


    public String getStudent_no() {
        return student_no;
    }

    public void setStudent_no(String student_no) {
        this.student_no = student_no;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_sex() {
        return student_sex;
    }

    public void setStudent_sex(String student_sex) {
        this.student_sex = student_sex;
    }

    public String getStudent_tel() {
        return student_tel;
    }

    public void setStudent_tel(String student_tel) {
        this.student_tel = student_tel;
    }

    public String getStudent_major() {
        return student_major;
    }

    public void setStudent_major(String student_major) {
        this.student_major = student_major;
    }

    public String getStudent_type() {
        return student_type;
    }

    public void setStudent_type(String student_type) {
        this.student_type = student_type;
    }

    public int getStudent_certify_number() {
        return student_certify_number;
    }

    public void setStudent_certify_number(int student_certify_number) {
        this.student_certify_number = student_certify_number;
    }

    public Byte getStudent_is_TA() {
        return student_is_TA;
    }

    public void setStudent_is_TA(Byte student_is_TA) {
        this.student_is_TA = student_is_TA;
    }

    // 生成toString方法


    @Override
    public String toString() {
        return "Student{" +
                "student_no='" + student_no + '\'' +
                ", student_name='" + student_name + '\'' +
                ", student_sex='" + student_sex + '\'' +
                ", student_tel='" + student_tel + '\'' +
                ", student_major='" + student_major + '\'' +
                ", student_type='" + student_type + '\'' +
                ", student_certify_number=" + student_certify_number +
                ", student_is_TA=" + student_is_TA +
                '}';
    }
}
