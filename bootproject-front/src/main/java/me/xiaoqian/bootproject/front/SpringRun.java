package me.xiaoqian.bootproject.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan("me.xiaoqian.bootproject.dao")
@EnableJpaRepositories("me.xiaoqian.bootproject.dao")
public class SpringRun {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRun.class, args);
	}
}
