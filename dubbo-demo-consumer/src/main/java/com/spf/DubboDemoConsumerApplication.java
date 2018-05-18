package com.spf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value={"classpath:consumers.xml"}) // 配置dubbo consumers.xml
public class DubboDemoConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboDemoConsumerApplication.class, args);
	}
}
