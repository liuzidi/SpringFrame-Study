package test;

import lzd.bankTransaction.dao.RepoDao;
import lzd.bankTransaction.dao.SaleListDao;
import lzd.bankTransaction.entity.SaleList;
import lzd.bankTransaction.service.ShopService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author:liuzidi
 * @Description:
 */
public class TestFile {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        RepoDao repoDao = (RepoDao) ac.getBean("repoDao");
        Integer num = repoDao.selectNowNumsByGid(1001);
        System.out.println(num);
    }

    @Test
    public void test02(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        RepoDao repoDao = (RepoDao) ac.getBean("repoDao");
        repoDao.addNowNumsByGid(1001,-100);
    }
    @Test
    public void test03(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        RepoDao repoDao = (RepoDao) ac.getBean("repoDao");
        repoDao.selectAll().forEach(System.out::println);
    }

    @Test
    public void test04(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        RepoDao repoDao = (RepoDao) ac.getBean("repoDao");
        System.out.println(repoDao.selectByGid(1002));
    }

    @Test
    public void test05(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SaleListDao saleList = (SaleListDao) ac.getBean("saleListDao");
        saleList.addLog(1001,"TV",10);
    }

    @Test
    public void test06(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SaleListDao saleList = (SaleListDao) ac.getBean("saleListDao");
        List<SaleList> saleLists = saleList.selectAll();
        saleLists.forEach(System.out::println);
    }

    @Test
    public void test07(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        ShopService shopService = (ShopService) ac.getBean("shopService");
        shopService.buyByNumsAndID(1001,25);
    }
}
