package com.example.gamelog.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mod {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long modid;
	
	private String name;
	
	public Mod() {
		super();
	}
	
	public Mod(String name) {
		super();
		this.name = name;
	}

	public Long getModid() {
		return modid;
	}

	public void setModid(Long modid) {
		this.modid = modid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Mod [modid=" + modid + ", name=" + name + "]";
	}
}
