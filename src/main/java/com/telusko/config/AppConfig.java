package com.telusko.config;

import com.telusko.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    //    @Bean(name = {"com2", "desktop1"})
    @Bean
    @Scope(value = "prototype")
    public Desktop desktop() {
        return new Desktop();
    }

}
