package br.com.gilmagno.ibgechallengeproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import br.com.gilmagno.ibgechallengeproxy.filters.ProxyFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class IbgeChallengeProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbgeChallengeProxyApplication.class, args);
	}
	
	@Bean
	public ProxyFilter preFilter() {
		return new ProxyFilter();
	}

}
