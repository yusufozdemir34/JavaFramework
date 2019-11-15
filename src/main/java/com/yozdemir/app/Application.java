package com.yozdemir.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.yozdemir.config.DataSourceConfig;
import com.yozdemir.config.SwaggerConfig;

/**
 * 
 * @author yusuf ozdemir
 *
 *
 */
@SpringBootApplication(scanBasePackages = { "com.yozdemir.controller", "com.yozdemir.facade", "com.yozdemir.service",
		"com.yozdemir.repository", "com.yozdemir.domain", "com.yozdemir.config" })
@Import({ DataSourceConfig.class, SwaggerConfig.class })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
