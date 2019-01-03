package pe1;


import org.junit.Test;

import static org.junit.Assert.*;

public class ques6Test {

    @Test
    public void testcheckCapital(){
        ques6 test = new ques6();
        String result = test.checkChar('A');
        assertEquals("Capital letter",result);
    }

    @Test
    public void testcheckLowercase(){
        ques6 test = new ques6();
        String result = test.checkChar('m');
        assertEquals("Small case letter",result);
    }

    @Test
    public void testcheckDigit(){
        ques6 test = new ques6();
        String result = test.checkChar('8');
        assertEquals("Digit",result);
    }

    @Test
    public void testcheckSpecialChar(){
        ques6 test = new ques6();
        String result = test.checkChar('&');
        assertEquals("Special Character",result);
    }
}