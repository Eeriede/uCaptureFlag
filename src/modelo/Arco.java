package modelo;

public class Arco {
	private Nodo<?> fuente;
	private Nodo<?> destino;
	
	public Arco(Nodo<?> pFuente, Nodo<?> pDestino) {
		setFuente(pFuente);
		setDestino(pDestino);
	}

	public Nodo<?> getFuente() {
		return fuente;
	}

	public void setFuente(Nodo<?> fuente) {
		this.fuente = fuente;
	}

	public Nodo<?> getDestino() {
		return destino;
	}

	public void setDestino(Nodo<?> destino) {
		this.destino = destino;
	}
}
