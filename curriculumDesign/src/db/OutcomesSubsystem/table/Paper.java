package db.OutcomesSubsystem.table;

public class Paper {
    private String RNO;                 //成果id
    private String paper_name;          //论文名称
    private String paper_magazine;      //论文所属期刊
    private String paper_state;         //论文当前状态
    private String paper_time;          //论文发布时间
    private String index_typr;          //索引类型
    private String store;               //所属学院库
    private String paper_source;        //论文材料

    public Paper() { }
    public Paper(String RNO, String paper_name, String paper_magazine, String paper_state,
                 String paper_time, String index_typr, String store, String paper_source) {
        this.RNO = RNO;
        this.paper_name = paper_name;
        this.paper_magazine = paper_magazine;
        this.paper_state = paper_state;
        this.paper_time = paper_time;
        this.index_typr = index_typr;
        this.store = store;
        this.paper_source = paper_source;
    }

    public String getRNO() {
        return RNO;
    }

    public void setRNO(String RNO) {
        this.RNO = RNO;
    }

    public String getPaper_name() {
        return paper_name;
    }

    public void setPaper_name(String paper_name) {
        this.paper_name = paper_name;
    }

    public String getPaper_magazine() {
        return paper_magazine;
    }

    public void setPaper_magazine(String paper_magazine) {
        this.paper_magazine = paper_magazine;
    }

    public String getPaper_state() {
        return paper_state;
    }

    public void setPaper_state(String paper_state) {
        this.paper_state = paper_state;
    }

    public String getPaper_time() {
        return paper_time;
    }

    public void setPaper_time(String paper_time) {
        this.paper_time = paper_time;
    }

    public String getIndex_typr() {
        return index_typr;
    }

    public void setIndex_typr(String index_typr) {
        this.index_typr = index_typr;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getPaper_source() {
        return paper_source;
    }

    public void setPaper_source(String paper_source) {
        this.paper_source = paper_source;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "RNO='" + RNO + '\'' +
                ", paper_name='" + paper_name + '\'' +
                ", paper_magazine='" + paper_magazine + '\'' +
                ", paper_state='" + paper_state + '\'' +
                ", paper_time='" + paper_time + '\'' +
                ", index_typr='" + index_typr + '\'' +
                ", store='" + store + '\'' +
                ", paper_source='" + paper_source + '\'' +
                '}';
    }
}
