package com.example.demo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class SpringCoreQualifierDemoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//context.scan("com.example.demo");
		
		//context.refresh();
		
		VehicleService vehicle = context.getBean(VehicleService.class);
		vehicle.service();
		
		context.close();
		
	}
}
