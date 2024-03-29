package com.oquerevalu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MonitorApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(MonitorApplication.class, args);
	}
	
	@Override
    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(MonitorApplication.class);
    }

}
