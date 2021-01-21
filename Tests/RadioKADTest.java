import static org.junit.Assert.*;

public class RadioKADTest {

    @org.junit.Test
    public void isON() {
        boolean tipo = false;
        RadioKAD instance = new RadioKAD();
        boolean expResult = true;
        boolean result = instance.isON();
        assertEquals(expResult, result);
        if (result.equals(expResult)){
            fail("Fallo el metodo");
        }

    }

    @org.junit.Test
    public void asignar() {
    }

    @org.junit.Test
    public void emisoras() {
    }
}