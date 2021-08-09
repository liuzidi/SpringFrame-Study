package lzd.zju.boot.config;

import lzd.zju.boot.bean.Pet;
import lzd.zju.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author:liuzidi
 * @Description:这是一个配置类
 */
@Configuration
public class MyConfig {
    @Bean
    public User user01(){
        return new User(22,"oil");
    }

    @Bean
    public Pet tom(){
        return new Pet("tom");
    }
}
