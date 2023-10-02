import org.junit.Assert;
import org.junit.Test;

public class PilaGenericaTest {
    /*
    Lista que extienda a cualquier super de Collections
    public void lista<Collections<? extends T> coleccion>

    List<? super Number> listsupNumber2 = new ArrayList<Object()>

    List<? super A> listsupNumber2 = new ArrayList<A>
                                                   B
     */






    //Declaramos nuestra Pila generica
    PilaGenerica pilaGenerica = new PilaGenerica<>();

    @Test
    public void estaVaciaTest(){
        Assert.assertTrue(pilaGenerica.estaVacia());
    }

    @Test
    public void añadirObjetoPila(){
        Integer n1 = 12;
        pilaGenerica.aniadir(n1);

        Assert.assertEquals(12, pilaGenerica.extraer());
    }


    @Test
    public void extraerElementoPila(){
        pilaGenerica.aniadir(12);
        pilaGenerica.aniadir(99);
        pilaGenerica.aniadir("Malaga");

        Assert.assertEquals("Malaga", pilaGenerica.extraer());
    }





}