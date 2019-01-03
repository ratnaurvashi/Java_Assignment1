package pe1;
import org.junit.Test;

import static org.junit.Assert.*;

public class ques2Test {

    @Test
    public void checkCondTom(){
        ques2 q = new ques2();
        String result = q.checkCond(23);
        assertEquals("Tom",result);
    }

    @Test
    public void checkCondJerry(){
        ques2 q = new ques2();
        String result = q.checkCond(26);
        assertEquals("Jerry",result);
    }
}