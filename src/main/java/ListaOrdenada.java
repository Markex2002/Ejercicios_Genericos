import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ListaOrdenada<E extends Comparable> {
    //ATRIBUTOS
    private ArrayList<E> lista;

    //CONSTRUCTOR
    public ListaOrdenada() {
        lista = new ArrayList<>();
    }

    //GETTERS AND SETTERS
    public ArrayList<E> getListaOrdenada() {
        return lista;
    }
    public void setListaOrdenada(ArrayList<E> listaOrdenada) {
        this.lista = listaOrdenada;
    }


    //METODOS
    //Añadimos un elemento a la lista, ya que implementa comparable, estara ordenado
    public void add (E o){
        lista.add(o);
    }

    //Devolvemos un valor segun su Index
    public E get(int index){
        return lista.get(index);
    }

    //Metodo para devolver el tamaño de nuestro Array
    public int size(){
        return lista.size();
    }

    //Metodo para comprobar si nuestra lista esta vacia
    public boolean isEmpty(){
        return lista.size() == 0;
    }

    //Metodo para borrar un elemento concreto de nuestra lista
    public boolean remove(E o){
        return lista.remove(o);
    }

    //Metodo que nos dira donde se encuentra extactamente un objeto del array
    public int indexOf(E o){
        return lista.indexOf(o);
    }



    @Override
    public String toString() {
        String resultado = "";

        for (E objeto : lista){
            resultado += objeto + "\n";
        }

        return resultado;
    }
}