package br.com.gilmagno.ibgechallengeapilocations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class IbgeChallengeApiLocationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbgeChallengeApiLocationsApplication.class, args);
	}

}
