package modelo;

import java.util.ArrayList;

/**
 *
 * @author Kendall López Quesada
 */
public class Nodo<T> {
    private T value;
    private boolean marcado = false;
    private ArrayList<Nodo<T>> arcos = new ArrayList<>();

    public Nodo(T pValue){
        value = pValue;
    }
    
    public T getValue(){
        return value;
    }
    
    public boolean getMarcado(){
        return marcado;
    }
    
    public void setMarcado(boolean pMarca){
        marcado=pMarca;
    }

    public ArrayList<Nodo<T>> getArcos() {
        return arcos;
    }
    
    public void agregarArco(Nodo<T> pNodo){
        arcos.add(pNodo);
        pNodo.arcos.add(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nodo<?> other = (Nodo<?>) obj;
        if (!this.value.equals(other.value)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Nodo{" + "value=" + value + ", marcado=" + marcado + '}';
    }
}