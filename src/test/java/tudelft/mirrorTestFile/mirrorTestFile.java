package tudelft.mirrorTestFile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.mirrorTest.mirrorTest;

public class mirrorTestFile {

    @Test
    public void Test01(){

        mirrorTest ob = new mirrorTest();
        String result = ob.mirrorEnds("abXYZba");
        Assertions.assertEquals("ab",result);

    }


    @Test
    public void Test02(){

        mirrorTest ob = new mirrorTest();
        String result = ob.mirrorEnds("abca");
        Assertions.assertEquals("a",result);

    }
}
