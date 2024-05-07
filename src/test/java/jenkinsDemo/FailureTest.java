import org.junit.Test;
import static org.junit.Assert.*;

public class FailureTest {

    @Test
    public void testFailure() {
        assertFalse("This test should fail", true);
    }
}
