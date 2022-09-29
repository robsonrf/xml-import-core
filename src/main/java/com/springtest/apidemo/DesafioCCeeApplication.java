package com.springtest.apidemo;

//import com.springtest.apidemo.config.security.CORSApplication;
//import com.springtest.apidemo.config.security.CorsProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

//@EnableConfigurationProperties({CorsProperties.class})
@SpringBootApplication
public class DesafioCCeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioCCeeApplication.class, args);
	}


//	@Bean
//	@Order(Ordered.HIGHEST_PRECEDENCE)
//	public CORSApplication getCORSApplication() {
//		return new CORSApplication();
//	}

}
