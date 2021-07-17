package lzd.bankTransaction.entity;

/**
 * @author:liuzidi
 * @Description:
 */
public class SaleList {
    Integer id;
    String gName;
    Integer saleNums;
    Integer gid;

    public SaleList() {
    }

    public SaleList(Integer id, String gName, Integer saleNums, Integer gid) {
        this.id = id;
        this.gName = gName;
        this.saleNums = saleNums;
        this.gid = gid;
    }

    @Override
    public String toString() {
        return "SaleList{" +
                "id=" + id +
                ", gName='" + gName + '\'' +
                ", saleNums=" + saleNums +
                ", gid=" + gid +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getgName() {
        return gName;
    }

    public Integer getSaleNums() {
        return saleNums;
    }

    public Integer getGid() {
        return gid;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public void setSaleNums(Integer saleNums) {
        this.saleNums = saleNums;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }
}
