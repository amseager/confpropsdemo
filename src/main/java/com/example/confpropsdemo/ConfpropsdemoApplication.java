package com.example.confpropsdemo;

import com.example.confpropsdemo.properties.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
public class ConfpropsdemoApplication implements CommandLineRunner {

	@Autowired
	private ConfigProperties configProperties;

	public static void main(String[] args) {
		SpringApplication.run(ConfpropsdemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println(configProperties);
	}
}
