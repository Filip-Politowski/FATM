package pl.filip.fatm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryDomainApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryDomainApplication.class, args);
	}

}
