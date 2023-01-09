package db.ACA.class_;

public class academicInfo {
    private String a_id;//学术活动id
    private String a_name;//学术活动名称
    private String s_id;//申请人的学术id
    private String postscript;//备注
    private String t_audit;//导师审核状态，通过/不通过/未审批
    private String m_audit;//管理员审核状态，通过/不通过/未审批

    public academicInfo(String a_id, String a_name, String s_id, String postscript, String t_audit, String m_audit) {
        this.a_id = a_id;
        this.a_name = a_name;
        this.s_id = s_id;
        this.postscript = postscript;
        this.t_audit = t_audit;
        this.m_audit = m_audit;
    }

    public academicInfo() {

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

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getPostscript() {
        return postscript;
    }

    public void setPostscript(String postscript) {
        this.postscript = postscript;
    }

    public String getT_audit() {
        return t_audit;
    }

    public void setT_audit(String t_audit) {
        this.t_audit = t_audit;
    }

    public String getM_audit() {
        return m_audit;
    }

    public void setM_audit(String m_audit) {
        this.m_audit = m_audit;
    }

    @Override
    public String toString() {
        return "academicInfo{" +
                "a_id='" + a_id + '\'' +
                ", a_name='" + a_name + '\'' +
                ", s_id='" + s_id + '\'' +
                ", postscript='" + postscript + '\'' +
                ", t_audit='" + t_audit + '\'' +
                ", m_audit='" + m_audit + '\'' +
                '}';
    }
}
