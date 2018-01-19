package com.keyi.yueting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author qiupengxie
 */
@SpringBootApplication
@EnableJpaRepositories
//("entity-manager-factory-ref='entityManagerFactory'")
//@EnableScheduling
@ComponentScan("com.keyi")
public class YuetingApplication {
    public static void main(String[] args) {
        SpringApplication.run(YuetingApplication.class, args);
    }
}