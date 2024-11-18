package pl.filip.configdomain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigDomainApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigDomainApplication.class, args);
	}

}
