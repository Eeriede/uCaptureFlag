package modelo;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Kendall López Quesada
 */
public class Grafo<T> {
    private ArrayList<Nodo<T>> nodos = new ArrayList<>();
    private ArrayList<Arco<T>> arcos = new ArrayList<>();
    private ArrayList<Arco<T>> camino = new ArrayList<>();
    
    public void insertarNodo(T pValue){
        Nodo<T> nodo = new Nodo<>(pValue);
        nodos.add(nodo);
    }
    
    public void actualizarArcos() {
    	arcos = null;
    	arcos = new ArrayList<>();
    	for(int contadorNodos = 0; contadorNodos>nodos.size(); contadorNodos++) {
    		Nodo<T> nodoFuente = nodos.get(contadorNodos);
    		ArrayList<Nodo<T>> listaArcos = nodoFuente.getArcos();
    		for(int contadorArcos = 0; contadorArcos>listaArcos.size(); contadorArcos++) {
    			Nodo<T> nodoDestino = listaArcos.get(contadorArcos);
    			Arco<T> arco = new Arco<T>(nodoFuente, nodoDestino);
    			arcos.add(arco);
    		}
    	}
    }
    
    public Stack<Nodo<T>> profundidad(){
        Stack<Nodo<T>> pila = new Stack<Nodo<T>>();
        Stack<Nodo<T>> resultado = new Stack<Nodo<T>>();
        pila.push(nodos.get(0));     
        while(!pila.isEmpty()){
            Nodo<T> nodo = (Nodo<T>) pila.pop();
            resultado.push(nodo);
            nodo.setMarcado(true);
            for(int contador = 0; contador<nodo.getArcos().size(); contador++){
                Nodo<T> evaluando = nodo.getArcos().get(contador);
                if(evaluando.getMarcado()==false){
                    evaluando.setMarcado(true);
                    pila.push(evaluando);
                }
            }
        }
        return resultado;
    }
    
    public ArrayList<Nodo<T>> getNodos(){
        return nodos;
    }
    
    public ArrayList<Arco<T>> getArcos() {
        return arcos;
    }
    
    public ArrayList<Arco<T>> getCamino() {
        return camino;
    }
      
    public void Floyd(Nodo<T> nodo){
    	
    }
    
    public void MSTPrim(Nodo<T> pOrigen){
    	if(pOrigen.getVisitado()) {
    		return;
    	}else {
    		ArrayList<Arco<T>> pesosArcos = buscarArcos(pOrigen);
    		camino.addAll(pesosArcos);
    		pOrigen.setVisitado(true);
    		for(Arco<T> arco : pesosArcos) {
    			MSTPrim(arco.getFuente());
    		}
    	}
    }
    
    public void Dijkstra(Nodo<T> pOrigen){
    	int contNodos = nodos.size();
    	
    }
    
  //Usarlo luego de cada recorrido para limpiar las marcas de los mismos
    public void limpiarMarcasNodos() {
    	for(Nodo<T> nodo : nodos) {
    		nodo.setMarcado(false);
    		nodo.setVisitado(false);
    	}
    }
    
    private ArrayList<Arco<T>> buscarArcos(Nodo<T> pNodo) {
    	ArrayList<Arco<T>> pesosArcos = new ArrayList<>();
    	for(Arco<T> arco : this.arcos) {
    		if(arco.getFuente().equals(pNodo)) {
    			if(!arco.getDestino().getMarcado()) {
    				arco.getDestino().setMarcado(true);
    				pesosArcos.add(arco);
    			}
    		}
    	}
    	return pesosArcos;
    }
}
