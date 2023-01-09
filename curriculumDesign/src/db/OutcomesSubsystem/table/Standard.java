package db.OutcomesSubsystem.table;

public class Standard {
    private String RNO;                 //成果id
    private String standard_type;       //标准类型
    private String standard_time;       //标准时间
    private String standard_source;     //标准内容

    public Standard(){

    }

    public Standard(String RNO, String standard_type, String standard_time, String standard_source) {
        this.RNO = RNO;
        this.standard_type = standard_type;
        this.standard_time = standard_time;
        this.standard_source = standard_source;
    }

    public String getRNO() {
        return RNO;
    }

    public void setRNO(String RNO) {
        this.RNO = RNO;
    }

    public String getStandard_type() {
        return standard_type;
    }

    public void setStandard_type(String standard_type) {
        this.standard_type = standard_type;
    }

    public String getStandard_time() {
        return standard_time;
    }

    public void setStandard_time(String standard_time) {
        this.standard_time = standard_time;
    }

    public String getStandard_source() {
        return standard_source;
    }

    public void setStandard_source(String standard_source) {
        this.standard_source = standard_source;
    }

    @Override
    public String toString() {
        return "Standard{" +
                "RNO='" + RNO + '\'' +
                ", standard_type='" + standard_type + '\'' +
                ", standard_time='" + standard_time + '\'' +
                ", standard_source='" + standard_source + '\'' +
                '}';
    }
}
