package ge.softlab.onlinestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity

@SpringBootApplication
public class OnlineStoreApplication {

	public static void main(String[] args) {

		SpringApplication.run(OnlineStoreApplication.class, args);
	}

}
