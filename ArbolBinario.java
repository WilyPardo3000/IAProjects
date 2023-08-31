
package TrabajoAB;

public class ArbolBinario {
    NodoArbol raiz;
    
    public ArbolBinario() {
        raiz=null;
    }
    
    //Metodo para insertar un nodo en el arbol
    public void agregarNodo(int d, String nom) {
        NodoArbol nuevo = new NodoArbol(d, nom);
        if(raiz==null) {
            raiz=nuevo;
        } else {
            NodoArbol auxiliar=raiz;
            NodoArbol padre;
            while(true) {
                padre=auxiliar;
                if(d<auxiliar.dato) {
                    auxiliar=auxiliar.hijoIzquierdo;
                    if(auxiliar==null) {
                        padre.hijoIzquierdo=nuevo;
                        return;
                    }
                } else {
                    auxiliar=auxiliar.hijoDerecho;
                    if(auxiliar==null) {
                        padre.hijoDerecho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    //Metodo para saber cuando el arbol esta vacio
    public boolean estaVacio() {
        return raiz==null;
    }
    
    //Metodo para recorrer el arbol InOrden
    public void inOrden(NodoArbol r) {
        if(r!=null) {
            inOrden(r.hijoIzquierdo);
            System.out.println(r.dato);
            inOrden(r.hijoDerecho);
        }
    }
    
    //Metodo recorrer el arbol Preorden
    public void preOrden(NodoArbol r) {
        if(r!=null) {
            System.out.println(r.dato);
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho);
        }
    }
}
