package lzd.bankTransaction.dao;


import lzd.bankTransaction.entity.Repo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//操作repo表的dao操作
public interface RepoDao {
    //通过gid查询当前对应商品的数目，并返回
    public Integer selectNowNumsByGid(Integer gid);
    //增加或减少库存gid对应的商品数量(用户购买或者进货)
    public void addNowNumsByGid(@Param(value = "gid")Integer gid, @Param(value = "num")Integer addNums);
    //查询整个Repo表并返回Repo对象
    public List<Repo> selectAll();
    //查询gid对应商品当前的全部信息
    public Repo selectByGid(Integer gid);
}
