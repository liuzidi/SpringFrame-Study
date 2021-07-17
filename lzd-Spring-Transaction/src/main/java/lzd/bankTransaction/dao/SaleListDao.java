package lzd.bankTransaction.dao;

import lzd.bankTransaction.entity.SaleList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//操作saleList表的dao操作在这个接口
public interface SaleListDao {
    //增加一条销售记录
    public void addLog(@Param(value = "gid") Integer gid, @Param(value = "gname")String gName,@Param(value = "saleNums")Integer saleNums);
    //通过id来查询第n条记录,返回一条saleList记录
    public SaleList selectByID(Integer id);
    //查询SaleList整个表单的信息
    public List<SaleList> selectAll();
}
