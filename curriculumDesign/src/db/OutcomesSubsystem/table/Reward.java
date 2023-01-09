package db.OutcomesSubsystem.table;

public class Reward {
    private String RNO;                 //成果id
    private String reward_name;         //奖励名称
    private String reward_type;         //奖励类别
    private String reward_level;        //奖励等级
    private String reward_rank;         //奖励排名
    private String reward_time;         //奖励时间
    private String reward_source;       //奖励内容

    public Reward(){}
    public Reward(String RNO, String reward_name, String reward_type,
                  String reward_level, String reward_rank, String reward_time, String reward_source) {
        this.RNO = RNO;
        this.reward_name = reward_name;
        this.reward_type = reward_type;
        this.reward_level = reward_level;
        this.reward_rank = reward_rank;
        this.reward_time = reward_time;
        this.reward_source = reward_source;
    }

    public String getRNO() {
        return RNO;
    }

    public void setRNO(String RNO) {
        this.RNO = RNO;
    }

    public String getReward_name() {
        return reward_name;
    }

    public void setReward_name(String reward_name) {
        this.reward_name = reward_name;
    }

    public String getReward_type() {
        return reward_type;
    }

    public void setReward_type(String reward_type) {
        this.reward_type = reward_type;
    }

    public String getReward_level() {
        return reward_level;
    }

    public void setReward_level(String reward_level) {
        this.reward_level = reward_level;
    }

    public String getReward_rank() {
        return reward_rank;
    }

    public void setReward_rank(String reward_rank) {
        this.reward_rank = reward_rank;
    }

    public String getReward_time() {
        return reward_time;
    }

    public void setReward_time(String reward_time) {
        this.reward_time = reward_time;
    }

    public String getReward_source() {
        return reward_source;
    }

    public void setReward_source(String reward_source) {
        this.reward_source = reward_source;
    }

    @Override
    public String toString() {
        return "Reward{" +
                "RNO='" + RNO + '\'' +
                ", reward_name='" + reward_name + '\'' +
                ", reward_type='" + reward_type + '\'' +
                ", reward_level='" + reward_level + '\'' +
                ", reward_rank='" + reward_rank + '\'' +
                ", reward_time='" + reward_time + '\'' +
                ", reward_source='" + reward_source + '\'' +
                '}';
    }
}
