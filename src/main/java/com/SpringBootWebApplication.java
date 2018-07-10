package com;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootWebApplication extends org.springframework.boot.web.support.SpringBootServletInitializer{
	
	
	/*将jar包改成war包时，不能依赖Application的main函数了，需要重写SpringApplicationBuilder，
	 * 该作用相当于web.xml
*/
	 @Override  
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
	        return application.sources(SpringBootWebApplication.class);  
	    }  
   
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);


	}

}
