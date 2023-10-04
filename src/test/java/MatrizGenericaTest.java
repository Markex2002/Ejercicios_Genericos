import org.junit.Assert;
import org.junit.Test;

public class MatrizGenericaTest {
    //Creamos la MatrizGenerica
    private MatrizGenerica<Number> matrizGenerica = new MatrizGenerica<>(5,5);


    @Test
    public void SetGetTest(){
        matrizGenerica.set(3,3, 99);

        //Assert.assertEquals(99, matrizGenerica.get(3,3));
        Assert.assertTrue(matrizGenerica.get(3,3).equals(99));
    }



}