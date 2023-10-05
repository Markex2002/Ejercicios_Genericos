import org.junit.Assert;
import org.junit.Test;

public class MatrizGenericaTest {
    //Creamos la MatrizGenerica
    private MatrizGenerica<Number> matrizGenerica = new MatrizGenerica<>(8,5);


    @Test
    public void setGetTest(){
        //Colocamos el numero 99 en la fila 3, columna 3
        matrizGenerica.set(3,3, 99);

        //Assert.assertEquals(99, matrizGenerica.get(3,3));
        Assert.assertTrue(matrizGenerica.get(3,3).equals(99));
    }

    @Test
    public void columnasFilasTest(){
        //Comprobamos que nos devuelva el numero correcto de Filas y Columnas
        Assert.assertEquals(8,matrizGenerica.filas());
        Assert.assertEquals(5,matrizGenerica.columnas());
    }


    @Test
    public void toStringTest(){
        matrizGenerica.set(1,2, 20);
        matrizGenerica.set(3,3, 50);
        matrizGenerica.set(5,4, 99);

        System.out.println(matrizGenerica.toString());
        //Se le puede hacer un @Test a toString?
    }
}