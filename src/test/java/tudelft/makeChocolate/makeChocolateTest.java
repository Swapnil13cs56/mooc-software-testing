package tudelft.makeChocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class makeChocolateTest {

    @Test
    public void test1(){
        makeChocolate ob = new makeChocolate();
        int result = ob.makeChocolates(4,1,9);
        Assertions.assertEquals(4,result);
    }

    @Test
    public void test2(){
        makeChocolate ob = new makeChocolate();
        int result = ob.makeChocolates(3,1,3);
        Assertions.assertEquals(3,result);
    }
}
