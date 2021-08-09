package lzd.zju.boot;

import lzd.zju.boot.bean.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author:liuzidi
 * @Description:
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //查看容器中的组件
        String[] names = run.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }
        //从容器中获取组件
        Pet tom = run.getBean("tom", Pet.class);
        System.out.println(tom);
    }
}
