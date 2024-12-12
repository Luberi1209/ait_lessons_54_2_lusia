import de.ait.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void testGetGreetingReturnsCorrectMessage(){
        Main main = new Main();
        String greeting = main.getGreeting("Test");
        assertEquals("Hello,Test!",greeting);
    }
}
