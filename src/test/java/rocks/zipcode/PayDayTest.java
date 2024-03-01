package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PayDayTest {

    @Test
    public void pay() {
        PayDay payDay1 = new PayDay();
        java.lang.String string1 = payDay1.pay("Kris", 21.5, 10.0, 0.05);
        assertEquals("Kris 215.00 10.75 204.25", string1);
        System.out.println("You passed the test !");
    }
}