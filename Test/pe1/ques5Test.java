package pe1;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class ques5Test {
    ques5 test;
    private static final String INPUT="2 3 24";
    private ByteArrayInputStream inputStream=new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() throws Exception {
        test=new ques5();
        System.setIn(inputStream);
    }

    @Test
    public void checkSummation(){
        int result=test.summation(12);
        assertEquals(41,result);
    }

}