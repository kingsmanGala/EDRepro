/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sema11;

/**
 *
 * @author HOME 
 */
public class ListaCircular {

    private Nodo primero;
    private int size;

    public ListaCircular() {
        primero = null;
        size = 0;
    }

    public void agregar(String Lista) {
        Nodo nuevo = new Nodo(Lista);
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = primero; // Punto al primer nodo para hacerla circular
        } else {
            Nodo actual = primero;
            while (actual.siguiente != primero) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
            nuevo.siguiente = primero;
        }
        size++;
    }

    
}

class Nodo {

    String Lista;
    Nodo siguiente;

    public Nodo(String lista) {
        this.Lista = lista ;
        this.siguiente = null;
    }

}
