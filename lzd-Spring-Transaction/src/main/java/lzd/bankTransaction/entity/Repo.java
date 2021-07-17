package lzd.bankTransaction.entity;

/**
 * @author:liuzidi
 * @Description:
 */
public class Repo {
    Integer gid;
    String gName;
    Integer NowNums;

    public Repo() {
    }

    public Repo(Integer gid, String gName, Integer nowNums) {
        this.gid = gid;
        this.gName = gName;
        NowNums = nowNums;
    }

    @Override
    public String toString() {
        return "Repo{" +
                "gid=" + gid +
                ", gName='" + gName + '\'' +
                ", NowNums=" + NowNums +
                '}';
    }

    public Integer getGid() {
        return gid;
    }

    public String getgName() {
        return gName;
    }

    public Integer getNowNums() {
        return NowNums;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public void setNowNums(Integer nowNums) {
        NowNums = nowNums;
    }
}
