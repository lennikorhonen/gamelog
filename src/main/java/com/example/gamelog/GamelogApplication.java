package com.example.gamelog;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.gamelog.domain.Difficulty;
import com.example.gamelog.domain.DifficultyRepository;
import com.example.gamelog.domain.Game;
import com.example.gamelog.domain.GameRepository;
import com.example.gamelog.domain.Genre;
import com.example.gamelog.domain.GenreRepository;
import com.example.gamelog.domain.Mod;
import com.example.gamelog.domain.ModRepository;

@SpringBootApplication
public class GamelogApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamelogApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner exampleGame(GameRepository gRepo, DifficultyRepository dRepo, GenreRepository geRepo, ModRepository mRepo) {
		return(args -> {
			dRepo.save(new Difficulty("Easy"));
			dRepo.save(new Difficulty("Medium"));
			dRepo.save(new Difficulty("Hard"));
			
			geRepo.save(new Genre("FPS"));
			
			mRepo.save(new Mod("Brutal Half-Life"));
			mRepo.save(new Mod("Brutal Doom"));
			
			gRepo.save(new Game("Half-Life", dRepo.findByName("Hard").get(0), geRepo.findByName("FPS").get(0)));
			gRepo.save(new Game("Doom", dRepo.findByName("Hard").get(0), geRepo.findByName("FPS").get(0)));
		});
	}

}
