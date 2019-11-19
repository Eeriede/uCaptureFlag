package modelo;

public class Arco<T> {
	private Nodo<T> fuente;
	private Nodo<T> destino;
	private int peso;
	
	public Arco(Nodo<T> pFuente, Nodo<T> pDestino) {
		setFuente(pFuente);
		setDestino(pDestino);
		setPeso(1);
	}

	public Nodo<T> getFuente() {
		return fuente;
	}

	public void setFuente(Nodo<T> fuente) {
		this.fuente = fuente;
	}

	public Nodo<T> getDestino() {
		return destino;
	}

	public void setDestino(Nodo<T> destino) {
		this.destino = destino;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
}
