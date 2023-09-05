
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
                        + "2.Recorrer el arbol InOrden\n"
                        + "3.Recorrer el arbol PreOrden\n"
                        + "4.Recorrer el arbol PostOrden\n"
                        + "5.Buscar un nodo en el Arbol\n"
                        + "6.Eliminar un nodo del Arbol\n"
                        + "7. Salir\n"
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
                            System.out.println();
                            arbolito.inOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio",
                                "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(!arbolito.estaVacio()) {
                            System.out.println();
                            arbolito.preOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio",
                                "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!arbolito.estaVacio()) {
                            System.out.println();
                            arbolito.postOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio",
                                "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5: 
                        if(!arbolito.estaVacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero del nodo busado", "Buscando nodo"
                                ,JOptionPane.QUESTION_MESSAGE));
                            if(arbolito.buscarNodo(elemento)==null) {
                                JOptionPane.showMessageDialog(null, "El nodo no se encuentra en el arbol",
                                "¡Nodo no encontrado!", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                System.out.println("Nodo encontrado, sus datos son: " + arbolito.buscarNodo(elemento));
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio",
                                "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        if(!arbolito.estaVacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero del nodo a eliminar", "Eliminando nodo"
                                ,JOptionPane.QUESTION_MESSAGE));
                            if(arbolito.eliminar(elemento)==false) {
                                JOptionPane.showMessageDialog(null, "El nodo no se encuentra en el arbol",
                                "¡Nodo no encontrado!", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "El nodo ha sido eliminado del arbol",
                                "¡Nodo eliminado!", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio",
                                "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
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
        }while(opcion!=7);
    }
    
}
