package com.alurapractica.screenmatch.v20;

import com.alurapractica.screenmatch.v20.service.APIConsumer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var apiConsumer = new APIConsumer();
		var json = apiConsumer.getData("https://www.omdbapi.com/?t=game+of+thrones&apikey=ab4d2127");
		System.out.println(json);
	}
}
