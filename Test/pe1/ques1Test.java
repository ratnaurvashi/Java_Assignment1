package pe1;
import org.junit.Test;

import static org.junit.Assert.*;

public class ques1Test {

    @Test
    public void testCheckNotPalindrome(){
        ques1 test = new ques1();
        int result = test.check(234356);
        assertEquals(0, result);
    }

    @Test
    public void testCheckPalindromeSumGreater(){
        ques1 test = new ques1();
        int result = test.check(2468642);
        assertEquals(1, result);
    }

    @Test
    public void testCheckPalindromeSumLess(){
        ques1 test = new ques1();
        int result = test.check(12345654321L);
        assertEquals(2, result);
    }
}