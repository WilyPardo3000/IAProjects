
package TrabajoAB;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int opcion=0, elemento;
        String nombre;
        ArbolBinario arbolito = new ArbolBinario();
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar un Nodo\n"
                        + "2.Recorrer el arbol In Orden\n"
                        + "3.Recorrer el arbol PreOrden\n"
                        + "4.Salir\n"
                        + "Elige una opcion......", "Arboles Binarios"
                        ,JOptionPane.QUESTION_MESSAGE));
                switch(opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero del nodo", "Agregando nodo"
                                , JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null, "Ingresa el Nombre del Nodo....","Agregando nodo"
                                , JOptionPane.QUESTION_MESSAGE);
                        arbolito.agregarNodo(elemento, nombre);
                        break;
                    case 2:
                        if(!arbolito.estaVacio()) {
                            arbolito.inOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio",
                                "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(!arbolito.estaVacio()) {
                            arbolito.preOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio",
                                "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                      JOptionPane.showMessageDialog(null, "Opcion Incorrecta",
                                "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        }while(opcion!=4);
    }
    
}
