package pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ques10Test {

    @Test
    public void testRepeat1(){
        ques10 test = new ques10();
        String result = test.repeat("Stackroute",5);
        assertEquals("Stackrouterouterouterouterouteroute",result);
    }
    @Test
    public void testRepeat2(){
        ques10 test = new ques10();
        String result = test.repeat("Stackroute",2);
        assertEquals("Stackroutetete",result);
    }
}