import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testSort() {
        int[] input = {2, 9, 3, 2, 0, 5, 2, 0, 8, 1};
        int[] expectedOutput = {0, 0, 1, 2, 2, 2, 3, 5, 8, 9};
        int[] output = Main.sort(input);

        assertArrayEquals(expectedOutput, output);
    }
}