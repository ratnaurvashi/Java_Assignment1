package pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ques7Test {
    @Test
    public void testSort(){
        ques7 test = new ques7();
        int[] result = test.sort(234534);
        assertArrayEquals(new int[] {5,4,4,3,3,2},result);
    }

    @Test
    public void testFindSum(){
        ques7 test = new ques7();
        int result = test.findSum(234534);
        assertEquals(10,result);
    }

}