package org.macula.cloud.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringCloudApplication
@EnableAdminServer
public class AdminCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminCloudApplication.class, args);
	}
	

}
