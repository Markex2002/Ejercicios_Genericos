import org.junit.Assert;
import org.junit.Test;

public class ListaOrdenadaTest {
    //Creamos nuestra listaOrdenada
    ListaOrdenada listaOrdenada = new ListaOrdenada<>();


    @Test
    public void Test(){
        listaOrdenada.add("Hola");
        listaOrdenada.add("a");
        listaOrdenada.add("Que");
        listaOrdenada.add("b");
        listaOrdenada.add("huevo");

        System.out.println(listaOrdenada.toString());
    }

    @Test
    public void sizeTest(){
        listaOrdenada.add("Hola");
        listaOrdenada.add("a");
        listaOrdenada.add("Que");

        Assert.assertEquals(3 ,listaOrdenada.size());
    }

    @Test
    public void isEmptyTest(){
        Assert.assertTrue(listaOrdenada.isEmpty());
    }

    @Test
    public void getTest(){
        listaOrdenada.add("Hola");
        listaOrdenada.add("a");
        listaOrdenada.add("Que");

        //Vemos si el elemento en la posicion 2 coincide
        Assert.assertTrue(listaOrdenada.get(2).equals("Que"));
    }


    @Test
    public void removeTest(){
        listaOrdenada.add("Hola");
        listaOrdenada.add("a");
        listaOrdenada.add("Que");

        //Cuando se elimina un elemento de una lista, se nos devolvera True
        Assert.assertTrue(listaOrdenada.remove("a"));
    }


    @Test
    public void indexOfTest(){
        listaOrdenada.add("Hola");
        listaOrdenada.add("a");
        listaOrdenada.add("Que");

        Assert.assertEquals(1, listaOrdenada.indexOf("a"));
    }




}