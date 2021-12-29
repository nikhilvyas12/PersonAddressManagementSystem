package com.pam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages={"com.pam"})
public class PersonAddressManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonAddressManagementSystemApplication.class, args);
	}
	


}
