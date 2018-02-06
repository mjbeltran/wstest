package com.wstest.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wstest.model.Players;

/**
 * 
 * @author Manuel
 *
 */
public interface PlayersRepository extends CrudRepository<Players, Long> {

	List<Players> findAll();

}
