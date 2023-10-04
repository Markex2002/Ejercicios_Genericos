public class MatrizGenerica<T> {
    //ATRIBUTOS
    private T[][] matriz;

    //CONSTRUCTOR
    public MatrizGenerica(int filas, int columnas){
        this.matriz = (T[][]) new Object[filas][columnas];
    }

    //GETTERS AND SETTERS
    public T[][] getMatriz() {
        return matriz;
    }
    public void setMatriz(T[][] matriz) {
        this.matriz = matriz;
    }


    //METODOS
    //Metodo para insertar un elemento en el array
    public void set(int fila, int columna, T elemento){
        matriz[fila][columna] = elemento;
    }

    //Metodo que nos devolvera el elemento de una posicion concreta
    public Object get(int fila, int columna){
        Object elemento = matriz[fila][columna];

        return elemento;
    }


    //Metodo para obtener el numero de filas del Array
    public int filas(){
        return matriz.length;
    }
    //Metodo para obtener el numero de Columnas del Array
    public int columnas(){
        return matriz[0].length;
    }












}