package com.wstest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wstest.domain.PlayerDto;
import com.wstest.model.Players;
import com.wstest.repository.PlayersRepository;

/**
 * 
 * @author Manuel
 *
 */
//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PlayerController {
 
 
	PlayersRepository repository;
	
	  public PlayerController(PlayersRepository userRepository) {
	    this.repository = userRepository;
	  }
 
 
	@RequestMapping(method = RequestMethod.GET)
	public List<PlayerDto> getPlayers() {
		return this.buildPlayers();
	}
 
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Players getUser(@PathVariable("id") Long id) {
		return this.repository.findOne(id);
	}
 
	@RequestMapping(method = RequestMethod.POST)
	public Players savePlayer(@RequestBody Players playerIn) {
		Players player = new Players();
		player.setNamePlayer(playerIn.getNamePlayer());
		return repository.save(player);
 
	}
 
	@RequestMapping(method = RequestMethod.PUT)
	public Players updateUser(@RequestBody PlayerDto player) {
		Players modifiedPlayer = this.repository.findOne(player.getIdPlayer());
		modifiedPlayer.setNamePlayer(player.getNamePlayer());
		return repository.save(modifiedPlayer);
	}
 
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public boolean deleteUser(@PathVariable Long id) {
		 repository.delete(id);
		 return true;
	}
 
	@RequestMapping("/players")
	public List<PlayerDto> buildPlayers() {
		List<PlayerDto> playersList = new ArrayList<>();
		PlayerDto playerDto; 
		for(Players player : repository.findAll()){
			playerDto = new PlayerDto();
			playerDto.setIdPlayer(player.getIdPlayer());
			playerDto.setNamePlayer(player.getNamePlayer());
			playersList.add(playerDto);
		}
		return playersList;
 
	}
	
}