import org.junit.Assert;
import org.junit.Test;

public class ListaOrdenadaTest {
    //Creamos nuestra listaOrdenada
    ListaOrdenada listaOrdenada = new ListaOrdenada<>();


    @Test
    public void toStringTest(){
        listaOrdenada.add("hola");
        listaOrdenada.add("a");
        listaOrdenada.add("que");
        listaOrdenada.add("b");
        listaOrdenada.add("huevo");

        System.out.println(listaOrdenada.toString());
    }

    @Test
    public void sizeTest(){
        listaOrdenada.add("hola");
        listaOrdenada.add("a");
        listaOrdenada.add("que");

        Assert.assertEquals(3 ,listaOrdenada.size());
    }

    @Test
    public void isEmptyTest(){
        Assert.assertTrue(listaOrdenada.isEmpty());
    }

    @Test
    public void getTest(){
        listaOrdenada.add("hola");
        listaOrdenada.add("a");
        listaOrdenada.add("que");

        //Vemos si el elemento en la posicion 2 coincide
        Assert.assertTrue(listaOrdenada.get(2).equals("que"));
    }


    @Test
    public void removeTest(){
        listaOrdenada.add("hola");
        listaOrdenada.add("a");
        listaOrdenada.add("que");

        //Cuando se elimina un elemento de una lista, se nos devolvera True
        Assert.assertTrue(listaOrdenada.remove("a"));
    }


    @Test
    public void indexOfTest(){
        listaOrdenada.add("hola");
        listaOrdenada.add("a");
        listaOrdenada.add("que");

        Assert.assertEquals(0, listaOrdenada.indexOf("a"));
    }




}