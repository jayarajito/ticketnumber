package com.example.ticketnumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketnumberApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketnumberApplication.class, args);
		System.out.println("Your Ticket Numeber is: " + ((int)(Math.random()*9000)+1000));
	}

}
