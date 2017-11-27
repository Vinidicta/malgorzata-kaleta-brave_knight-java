package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BraveKnightApplication {

	public static void main(String[] args) {
		SpringApplication.run(BraveKnightApplication.class, args);

		Knight knight = new Knight(new DeadIslandQuest());

		knight.questAccepted();
	}
}
