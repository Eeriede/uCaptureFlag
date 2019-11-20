package modelo;

import java.util.ArrayList;

public class Equipo {
	private ArrayList<Personaje> personajes;
	private boolean team;
	
	public Equipo(Personaje pPersona, boolean pTeam) {
		agregarPersonaje(pPersona);
		setTeam(pTeam);
	}

	public ArrayList<Personaje> getPersonajes() {
		return personajes;
	}

	public void agregarPersonaje(Personaje pPersonaje) {
		this.personajes.add(pPersonaje);
	}

	public boolean getTeam() {
		return team;
	}

	public void setTeam(boolean team) {
		this.team = team;
	}
}
