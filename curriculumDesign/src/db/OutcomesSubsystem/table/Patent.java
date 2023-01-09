package db.OutcomesSubsystem.table;

public class Patent {
    private String RNO;             //成果id
    private String patent_name;     //专利名称
    private String patent_type;     //专利类别
    private String patent_id;       //专利id
    private String patent_time;     //专利时间
    private String patent_state;    //专利状态
    private String patent_rank;     //专利等级
    private String patent_source;   //专利内容

    public Patent(){}

    public Patent(String RNO, String patent_name, String patent_type, String patent_id,
                  String patent_time, String patent_state, String patent_rank, String patent_source) {
        this.RNO = RNO;
        this.patent_name = patent_name;
        this.patent_type = patent_type;
        this.patent_id = patent_id;
        this.patent_time = patent_time;
        this.patent_state = patent_state;
        this.patent_rank = patent_rank;
        this.patent_source = patent_source;
    }

    public String getRNO() {
        return RNO;
    }

    public void setRNO(String RNO) {
        this.RNO = RNO;
    }

    public String getPatent_name() {
        return patent_name;
    }

    public void setPatent_name(String patent_name) {
        this.patent_name = patent_name;
    }

    public String getPatent_type() {
        return patent_type;
    }

    public void setPatent_type(String patent_type) {
        this.patent_type = patent_type;
    }

    public String getPatent_id() {
        return patent_id;
    }

    public void setPatent_id(String patent_id) {
        this.patent_id = patent_id;
    }

    public String getPatent_time() {
        return patent_time;
    }

    public void setPatent_time(String patent_time) {
        this.patent_time = patent_time;
    }

    public String getPatent_state() {
        return patent_state;
    }

    public void setPatent_state(String patent_state) {
        this.patent_state = patent_state;
    }

    public String getPatent_rank() {
        return patent_rank;
    }

    public void setPatent_rank(String patent_rank) {
        this.patent_rank = patent_rank;
    }

    public String getPatent_source() {
        return patent_source;
    }

    public void setPatent_source(String patent_source) {
        this.patent_source = patent_source;
    }

    @Override
    public String toString() {
        return "Patent{" +
                "RNO='" + RNO + '\'' +
                ", patent_name='" + patent_name + '\'' +
                ", patent_type='" + patent_type + '\'' +
                ", patent_id='" + patent_id + '\'' +
                ", patent_time='" + patent_time + '\'' +
                ", patent_state='" + patent_state + '\'' +
                ", patent_rank='" + patent_rank + '\'' +
                ", patent_source='" + patent_source + '\'' +
                '}';
    }
}
