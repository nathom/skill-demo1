import static org.junit.Assert.*;
import org.junit.*;

public class Tester {
    @Test
    public void testAdd() {
        assertEquals(Main.add(1, 2), 3);
    }
}
