package db.OutcomesSubsystem.table;

public class Report {
    private String RNO;             //成果id
    private String report_name;     //报告名称
    private String report_type;     //报告类型
    private String report_company;  //报告所属
    private String report_time;     //报告时间
    private String report_rank;     //报告等级
    private String report_source;   //报告内容

    public Report(){
    }

    public Report(String RNO, String report_name, String report_type,
                  String report_company, String report_time, String report_rank, String report_source) {
        this.RNO = RNO;
        this.report_name = report_name;
        this.report_type = report_type;
        this.report_company = report_company;
        this.report_time = report_time;
        this.report_rank = report_rank;
        this.report_source = report_source;
    }

    public String getRNO() {
        return RNO;
    }

    public void setRNO(String RNO) {
        this.RNO = RNO;
    }

    public String getReport_name() {
        return report_name;
    }

    public void setReport_name(String report_name) {
        this.report_name = report_name;
    }

    public String getReport_type() {
        return report_type;
    }

    public void setReport_type(String report_type) {
        this.report_type = report_type;
    }

    public String getReport_company() {
        return report_company;
    }

    public void setReport_company(String report_company) {
        this.report_company = report_company;
    }

    public String getReport_time() {
        return report_time;
    }

    public void setReport_time(String report_time) {
        this.report_time = report_time;
    }

    public String getReport_rank() {
        return report_rank;
    }

    public void setReport_rank(String report_rank) {
        this.report_rank = report_rank;
    }

    public String getReport_source() {
        return report_source;
    }

    public void setReport_source(String report_source) {
        this.report_source = report_source;
    }

    @Override
    public String toString() {
        return "Report{" +
                "RNO='" + RNO + '\'' +
                ", report_name='" + report_name + '\'' +
                ", report_type='" + report_type + '\'' +
                ", report_company='" + report_company + '\'' +
                ", report_time='" + report_time + '\'' +
                ", report_rank='" + report_rank + '\'' +
                ", report_source='" + report_source + '\'' +
                '}';
    }
}
