/* 
 * Created by 2019年1月31日
 */
package com.demo.supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * The application for the supplier service.
 * @author fangang
 */
@SpringBootApplication
@EnableEurekaClient
@Configuration
@ComponentScan(basePackages="com.demo")
@ImportResource(locations={"classpath:applicationContext.xml"})
public class SupplierApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SupplierApplication.class, args);
	}

}
