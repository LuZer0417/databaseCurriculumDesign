package db.publicClass_;

public class Manager {
    private String m_id;
    private String m_name;
    private String m_tel;

    public Manager(String m_id, String m_name, String m_tel) {
        this.m_id = m_id;
        this.m_name = m_name;
        this.m_tel = m_tel;
    }

    public String getM_id() {
        return m_id;
    }

    public void setM_id(String m_id) {
        this.m_id = m_id;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_tel() {
        return m_tel;
    }

    public void setM_tel(String m_tel) {
        this.m_tel = m_tel;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "m_id='" + m_id + '\'' +
                ", m_name='" + m_name + '\'' +
                ", m_tel='" + m_tel + '\'' +
                '}';
    }
}
