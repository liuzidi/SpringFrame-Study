package lzd.bankTransaction.service.impl;

import lzd.bankTransaction.dao.RepoDao;
import lzd.bankTransaction.dao.SaleListDao;
import lzd.bankTransaction.entity.Repo;
import lzd.bankTransaction.entity.SaleList;
import lzd.bankTransaction.exp.NoGoodsException;
import lzd.bankTransaction.exp.NotExistGoodException;
import lzd.bankTransaction.service.ShopService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author:liuzidi
 * @Description:
 */
public class ShopServiceImpl implements ShopService {
    private RepoDao repoDao;
    private SaleListDao saleListDao;

    @Transactional(
            propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT,
            readOnly = false,
            rollbackFor = {
                    NoGoodsException.class, NotExistGoodException.class
            }
    )
    @Override
    public void buyByNumsAndID(Integer gid, Integer nums) {
        //查询是否有gid
        Repo repo = repoDao.selectByGid(gid);
        if(repo == null){
            throw new NotExistGoodException("库存中无gid="+gid+"的商品");
        }
        //查询是否有足够的商店库存
        Integer nowNums = repoDao.selectNowNumsByGid(gid);
        if(nums > nowNums){
            throw new NoGoodsException("库存仅剩" + nowNums + "件，库存不足" + nums + "件");
        }
        //更新库存，并发出一条记录
        repoDao.addNowNumsByGid(gid,-nums);
        String gname = repoDao.selectByGid(gid).getgName();
        saleListDao.addLog(gid,gname,nums);
    }

    @Override
    public void addRepoGoodsBygID(Integer gid, Integer nums) {
        //查询是否有gid
        Repo repo = repoDao.selectByGid(gid);
        if(repo == null){
            throw new NotExistGoodException("库存中无gid="+gid+"的商品");
        }
        //更新库存，并发出一条记录
        repoDao.addNowNumsByGid(gid,nums);
        String gname = repoDao.selectByGid(gid).getgName();
        saleListDao.addLog(gid,gname,nums);
    }

    @Override
    public Repo queryRepo() {
        return null;
    }

    @Override
    public SaleList querySaleList() {
        return null;
    }

    public void setRepoDao(RepoDao repoDao) {
        this.repoDao = repoDao;
    }

    public void setSaleListDao(SaleListDao saleListDao) {
        this.saleListDao = saleListDao;
    }

    public RepoDao getRepoDao() {
        return repoDao;
    }

    public SaleListDao getSaleListDao() {
        return saleListDao;
    }
}
