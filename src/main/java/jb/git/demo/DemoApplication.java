package jb.git.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Git Commit Test.");
		SpringApplication.run(DemoApplication.class, args);
	}

}
