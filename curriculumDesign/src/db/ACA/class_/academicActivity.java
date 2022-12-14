package db.ACA.class_;

public class academicActivity {
    private String a_id;//学术活动id
    private String a_name;//学术活动名称
    private String a_address;//地址
    private String a_subject;//所属学科
    private String a_date;//举办日期

    public academicActivity(String a_id, String a_name, String a_address, String a_subject, String a_date) {
        this.a_id = a_id;
        this.a_name = a_name;
        this.a_address = a_address;
        this.a_subject = a_subject;
        this.a_date = a_date;
    }

    public String getA_id() {
        return a_id;
    }

    public void setA_id(String a_id) {
        this.a_id = a_id;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public String getA_address() {
        return a_address;
    }

    public void setA_address(String a_address) {
        this.a_address = a_address;
    }

    public String getA_subject() {
        return a_subject;
    }

    public void setA_subject(String a_subject) {
        this.a_subject = a_subject;
    }

    public String getA_date() {
        return a_date;
    }

    public void setA_date(String a_date) {
        this.a_date = a_date;
    }

    @Override
    public String toString() {
        return "academicActivity{" +
                "a_id='" + a_id + '\'' +
                ", a_name='" + a_name + '\'' +
                ", a_address='" + a_address + '\'' +
                ", a_subject='" + a_subject + '\'' +
                ", a_date='" + a_date + '\'' +
                '}';
    }
}
