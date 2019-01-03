package pe1;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class ques8Test {
    ques8 test;
    private static final String INPUT="34";
    private ByteArrayInputStream inputStream=new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() throws Exception {
        test=new ques8();
        System.setIn(inputStream);
    }

    @Test
    public void checkGuessNum(){
        String result=test.guessNum(50);
        assertEquals("Number guessed matches the original number",result);
    }

}