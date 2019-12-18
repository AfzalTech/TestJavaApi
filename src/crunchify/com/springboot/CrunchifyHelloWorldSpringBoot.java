package crunchify.com.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class CrunchifyHelloWorldSpringBoot {

	@RequestMapping("/")
	String basicURL() {
	
		return "Welcome to Spring Boot Hello World Tutorial - Afzal";
	
	}
 
	@RequestMapping("crunchify")
	String crunchifyURL() {
		
		return "Hello Crunchify Friends! This is your first SpringBoot Example. Isn't that so Simple?";
	
	}
 
	public static void main(String[] args) throws Exception {
 
		// SpringApplication classes that can be used to bootstrap and launch a Spring application from a Java
		// main method. By default class will perform the following steps to bootstrap your application.
		SpringApplication.run(CrunchifyHelloWorldSpringBoot.class, args);
	}
}
