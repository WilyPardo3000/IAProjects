
package TrabajoAB;

public class NodoArbol {
    int dato;
    NodoArbol hijoIzquierdo, hijoDerecho;
    String nombre;
    
    public NodoArbol(int d, String nom) {
        this.dato=d;
        this.nombre=nom;
        this.hijoIzquierdo=null;
        this.hijoDerecho=null;
    }
    
    public String toString() {
        return nombre + " Su dato es " + dato;
    }
    
    
}
