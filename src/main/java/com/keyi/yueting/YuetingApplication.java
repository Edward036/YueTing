package com.keyi.yueting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class YuetingApplication {

	public static void main(String[] args) {

		SpringApplication.run(YuetingApplication.class, args);
	}

	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
		JettyEmbeddedServletContainerFactory factory =
				new JettyEmbeddedServletContainerFactory();
		return factory;
	}
}