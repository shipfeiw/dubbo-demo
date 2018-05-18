package com.spf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:providers.xml"}) // 配置dubbo providers.xml
public class DubboDemoProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboDemoProviderApplication.class, args);
	}
}
