import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CodeTest{

    @Test //Test annotation is inherited from org.junit.jupiter.api
    public void testSayHello() {
        //calling the method of code class by making instance of it.
        Code obj = new Code();

        //assertEquals checks the expected value with returned value from the method.
        assertEquals("Hello World!", obj.sayHello());
    }
}
