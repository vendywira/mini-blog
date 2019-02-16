package app.learn.miniblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MiniBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniBlogApplication.class, args);
	}

}
