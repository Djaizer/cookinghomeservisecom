import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CookIT {


    @Test
    public void cookTest(){
        Cook cook = new Cook();
        String expectedDish = "potato";
        cook.setDish(expectedDish);
        cook.addMoreDish();
        cook.discardOneDish();
        cook.discardOneDish();
        assertEquals(cook.getQuantity(), -1);
        assertEquals(cook.getDish(), expectedDish);

    }
}
