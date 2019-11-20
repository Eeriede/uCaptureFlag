package modelo;

import java.io.Serializable;

import net.SocketClient;

public class Jugador implements Serializable{
	private static final long serialVersionUID = 1L;
	private String email;
	private String password;
	private int puntaje;
	private SocketClient client;
	
	public Jugador(String pEmail, String pPassword, SocketClient pClient) {
		setEmail(pEmail);
		setPassword(pPassword);
		setPuntaje(0);
		setClient(pClient);
	}
	
	public Jugador(String pEmail, String pPassword, SocketClient pClient, int pPuntaje) {
		setEmail(pEmail);
		setPassword(pPassword);
		setPuntaje(pPuntaje);
		setClient(pClient);
	}
	
	public SocketClient getClient() {
		return client;
	}

	public void setClient(SocketClient client) {
		this.client = client;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + puntaje;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (puntaje != other.puntaje)
			return false;
		return true;
	}
	
	
}
