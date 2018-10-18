package net.netasystems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class NetaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetaConfigServerApplication.class, args);
	}
}
