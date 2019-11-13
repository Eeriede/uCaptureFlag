package modelo;

public class Arco {
	private Nodo<?> fuente;
	private Nodo<?> destino;
	
	public Arco(Nodo<?> pFuente, Nodo<?> pDestino) {
		fuente = pFuente;
		destino = pDestino;
	}
}
