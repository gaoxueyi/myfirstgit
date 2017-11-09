package foo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurkademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurkademoApplication.class, args);
	}
}
