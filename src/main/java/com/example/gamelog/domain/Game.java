package com.example.gamelog.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long gameid;
	
	private String name;
	
	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "difficultyid")
	private Difficulty difficulty;
	
	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "genreid")
	private Genre genre;
	
	public Game() {
		super();
	}
	
	public Game(String name, Difficulty difficulty, Genre genre) {
		super();
		this.name = name;
		this.difficulty = difficulty;
		this.genre = genre;
	}

	public Long getGameid() {
		return gameid;
	}

	public void setGameid(Long gameid) {
		this.gameid = gameid;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Game [gameId=" + gameid + ", name=" + name + "]";
	}
}
