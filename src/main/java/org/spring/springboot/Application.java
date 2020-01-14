package org.spring.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.spring.springboot.dao") // mapper 接口类扫描包配置
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
