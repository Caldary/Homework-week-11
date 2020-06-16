import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle("bottle", 100);
    }

    @Test
    public void hasName(){
        assertEquals("bottle", waterBottle.getName());
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

}
