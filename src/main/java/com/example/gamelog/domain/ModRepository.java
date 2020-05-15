package com.example.gamelog.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ModRepository extends CrudRepository<Mod, Long>{
	List<Mod> findByName(String name);
}
