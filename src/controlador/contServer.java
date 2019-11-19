package controlador;

import java.util.Observable;
import java.util.Observer;

import net.Server;

public class contServer implements Observer{
	private Server servidor;
	
	
	public contServer() {
		servidor = new Server(this);
		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
}
