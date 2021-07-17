package lzd.bankTransaction.service;

import lzd.bankTransaction.entity.Repo;
import lzd.bankTransaction.entity.SaleList;

/**
 * @author:liuzidi
 * @Description:
 */
public interface ShopService {
    public void buyByNumsAndID(Integer id, Integer nums);
    public void addRepoGoodsBygID(Integer gid, Integer nums);
    public Repo queryRepo();
    public SaleList querySaleList();
}
