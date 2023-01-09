package db.OutcomesSubsystem.table;

public class Other {
    private String RNO;         //成果id
    private String result_describe;     //成果描述

    public Other(){}

    public Other(String RNO, String result_describe) {
        this.RNO = RNO;
        this.result_describe = result_describe;
    }

    public String getRNO() {
        return RNO;
    }

    public void setRNO(String RNO) {
        this.RNO = RNO;
    }

    public String getResult_describe() {
        return result_describe;
    }

    public void setResult_describe(String result_describe) {
        this.result_describe = result_describe;
    }

    @Override
    public String toString() {
        return "Other{" +
                "RNO='" + RNO + '\'' +
                ", result_describe='" + result_describe + '\'' +
                '}';
    }
}
