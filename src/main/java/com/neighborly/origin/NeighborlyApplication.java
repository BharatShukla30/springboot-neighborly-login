package com.neighborly.origin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class NeighborlyApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(NeighborlyApplication.class, args);
	}

}
