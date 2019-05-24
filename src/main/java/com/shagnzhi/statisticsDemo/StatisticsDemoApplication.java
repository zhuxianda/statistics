package com.shagnzhi.statisticsDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class StatisticsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatisticsDemoApplication.class, args);
		System.out.println("输出启动参数:");
		System.out.println("参数"+Arrays.toString(args));
	}

}
