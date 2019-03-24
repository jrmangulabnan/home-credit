package org.home.credit.app.main;

import org.home.credit.app.config.HomeCreditConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * The Main class of this project
 * 
 * @author Jr Mangulabnan
 *
 */
@ComponentScan({ "org.home.credit.app.controller" })
@Import(HomeCreditConfig.class)
@SpringBootApplication
public class HomeCreditApplication {

	/**
	 * The main method of this project
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(HomeCreditApplication.class, args);
	}
}
