package com.wstest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "partidas")
public class Partidas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPartida;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_player_ganador")
	private Players idPlayerGanador;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_game")
	private Games idGame;

	public Players getIdPlayerGanador() {
		return idPlayerGanador;
	}

	public void setIdPlayer(Players idPlayerGanador) {
		this.idPlayerGanador = idPlayerGanador;
	}

	public Games getNamePlayer() {
		return idGame;
	}

	public void setNamePlayer(Games idGame) {
		this.idGame = idGame;
	}

}
