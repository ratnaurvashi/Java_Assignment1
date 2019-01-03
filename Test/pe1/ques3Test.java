package pe1;
import org.junit.Test;

import static org.junit.Assert.*;

public class ques3Test {

    @Test
    public void checkAlphabetVowel(){
        ques3 q = new ques3();
        String result = q.checkAlphabet("a");
        assertEquals("Vowel",result);
    }
    @Test
    public void checkAlphabetConsonant(){
        ques3 q = new ques3();
        String result = q.checkAlphabet("p");
        assertEquals("Consonant",result);
    }
    @Test
    public void checkAlphabetVowelConsonant(){
        ques3 q = new ques3();
        String result = q.checkAlphabet("ap");
        assertEquals("Vowel Consonant",result);
    }
}