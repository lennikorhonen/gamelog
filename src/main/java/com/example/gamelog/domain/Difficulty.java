package com.example.gamelog.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Difficulty {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long difficultyid;
	
	private String name;
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "difficulty")
	private List<Game> game;
	
	public Difficulty() {
		super();
	}
	
	public Difficulty(String name) {
		this.name = name;
	}

	public Long getDifId() {
		return difficultyid;
	}

	public void setDifId(Long difficultyid) {
		this.difficultyid = difficultyid;
	}

	public String getDifName() {
		return name;
	}

	public void setDifName(String name) {
		this.name = name;
	}

	public List<Game> getGame() {
		return game;
	}

	public void setGame(List<Game> game) {
		this.game = game;
	}

	@Override
	public String toString() {
		return "Difficulty [difId=" + difficultyid + ", difName=" + name + "]";
	}
}
