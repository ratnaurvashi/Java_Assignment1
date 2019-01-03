package pe1;
import org.junit.Test;
import static org.junit.Assert.*;

public class ques4Test {

    @Test
    public void testLoop1(){
        ques4 test = new ques4();
        String result = test.loop(5);
        assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 ",result);
    }

    @Test
    public void testLoop2(){
        ques4 test = new ques4();
        String result = test.loop(2);
        assertEquals("1 2 2 3 3 3 ",result);
    }

}
