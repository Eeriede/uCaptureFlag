package controlador;

import java.util.Observable;
import java.util.Observer;

import net.Message;
import net.SocketClient;
import modelo.Equipo;
import modelo.EspacioMapa;
import modelo.Grafo;
import modelo.Jugador;
import net.Server;

public class contServer implements Observer{
	private Server servidor;
	private Jugador[] jugadores;
	private Grafo<EspacioMapa> mapa;
	
	public contServer() {
		servidor = new Server(this);
		jugadores = new Jugador[2];
		mapa = new Grafo<EspacioMapa>();
	}

	@Override
	public void update(Observable caller, Object pMensaje) {
		SocketClient client = (SocketClient)caller;
		if (pMensaje instanceof Message) {
			Message msg = (Message)pMensaje;
			switch(msg.getType()) {
			case 1:
				//registrar
			case 2:
				//ingresar
			case 3:
				//actualizar juego
			}
		}
	}
}
