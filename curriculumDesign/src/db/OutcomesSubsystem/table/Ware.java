package db.OutcomesSubsystem.table;

public class Ware {
    private String RNO;     //成果id
    private String ware_name;       //平台名称
    private String ware_company;    //平台所属
    private String ware_time;       //平台发布时间
    private String ware_rank;       //平台等级
    private String ware_source;     //平台内容

    public Ware(){}

    public Ware(String RNO, String ware_name, String ware_company, String ware_time, String ware_rank, String ware_source) {
        this.RNO = RNO;
        this.ware_name = ware_name;
        this.ware_company = ware_company;
        this.ware_time = ware_time;
        this.ware_rank = ware_rank;
        this.ware_source = ware_source;
    }

    public String getRNO() {
        return RNO;
    }

    public void setRNO(String RNO) {
        this.RNO = RNO;
    }

    public String getWare_name() {
        return ware_name;
    }

    public void setWare_name(String ware_name) {
        this.ware_name = ware_name;
    }

    public String getWare_company() {
        return ware_company;
    }

    public void setWare_company(String ware_company) {
        this.ware_company = ware_company;
    }

    public String getWare_time() {
        return ware_time;
    }

    public void setWare_time(String ware_time) {
        this.ware_time = ware_time;
    }

    public String getWare_rank() {
        return ware_rank;
    }

    public void setWare_rank(String ware_rank) {
        this.ware_rank = ware_rank;
    }

    public String getWare_source() {
        return ware_source;
    }

    public void setWare_source(String ware_source) {
        this.ware_source = ware_source;
    }

    @Override
    public String toString() {
        return "Ware{" +
                "RNO='" + RNO + '\'' +
                ", ware_name='" + ware_name + '\'' +
                ", ware_company='" + ware_company + '\'' +
                ", ware_time='" + ware_time + '\'' +
                ", ware_rank='" + ware_rank + '\'' +
                ", ware_source='" + ware_source + '\'' +
                '}';
    }
}

