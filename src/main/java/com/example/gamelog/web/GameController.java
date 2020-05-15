package com.example.gamelog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.gamelog.domain.Game;
import com.example.gamelog.domain.GameRepository;

@Controller
public class GameController {
	
	@Autowired
	GameRepository gRepo;

	@RequestMapping(value = "/games", method = RequestMethod.GET)
	public @ResponseBody List<Game> gamesRest() {
		return (List<Game>) gRepo.findAll();
	}
}
