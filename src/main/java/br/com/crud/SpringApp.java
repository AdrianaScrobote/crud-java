package br.com.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableWebMvc
@SpringBootApplication
@ComponentScan(basePackages = { "br.com.crud" })
@EnableFeignClients("br.com.crud")
public class SpringApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringApp.class, args);
	}

}
