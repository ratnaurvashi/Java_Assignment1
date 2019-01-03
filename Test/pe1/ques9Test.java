package pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ques9Test {
    @Test
    public void testReverse(){
        ques9 test = new ques9();
        String result = test.reverse("london");
        assertEquals("nodnol",result);
    }
}