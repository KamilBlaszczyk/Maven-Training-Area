package implementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class GoodPizzaTest {

    private GoodPizza pizza1 = new GoodPizza(35,"another pizza");

    @Test
    public void getPrice() {
        assertEquals(30, pizza1.getPrice());
    }

//    @Test
//    public void getName() {
//        assertEquals("pizza", pizza1.getName());
//    }
}