package coms.DemoSpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootAppApplication.class, args);
		System.out.println("Server...");
	}
}
