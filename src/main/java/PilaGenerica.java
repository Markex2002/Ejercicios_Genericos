import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class PilaGenerica<T> {
    //Atributos
    private List<T> pila;

    //CONSTRUCTOR
    public PilaGenerica() {
        pila = new LinkedList<>();
    }

    //GETTERS AND SETTERS
    public List getPila() {
        return pila;
    }
    public void setPila(LinkedList pila) {
        this.pila = pila;
    }


    //METODOS
    //Comprobar si la lista esta vacia
    public boolean estaVacia(){
        boolean resultado = false;
        //Si la lista esta vacia devolveremos true
        if (pila.isEmpty()){
            resultado = true;
        }
        return resultado;
    }

    //Metodo para añadir
    public void aniadir(T o1){
        pila.add(0, o1);
    }

    //Metodo que extrae el primer valor de la lista y lo devuelve
    public T extraer(){
        T o1 = pila.get(0);
        pila.remove(0);

        return o1;
    }

    //Como esta coleccion esta basada en Pila, el Primer elemento,
    // el primero en ser insertado, sera el que este el ultimo en la lista
    public T primero(){
        return pila.get(0);
    }

    @Override
    public String toString() {
        String resultado = "";

        for(T object: pila){
            resultado += "\nElemento: " + object.toString();
        }

        return resultado;
    }
}