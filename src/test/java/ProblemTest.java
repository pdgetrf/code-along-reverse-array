import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ProblemTest {
    @Test
    public void test() {
        int inputs[][] = {
                {},
                {1},
                {-2, 2},
                {3, -3},
                {1, 2, 3},
                {3, 2, 1, 0},
                {-4, -4, -4},
                {-1, 0, 9, 3, 2}};

        int expected[][] = {
                {},
                {1},
                {2, -2},
                {-3, 3},
                {3, 2, 1},
                {0, 1, 2, 3},
                {-4, -4, -4},
                {2, 3, 9, 0, -1}};

        for (int i = 0; i < inputs.length; i++) {
            Problem.reverseArray(inputs[i]);
            assertArrayEquals(
                    String.format("case %d failed:", i),
                    expected[i],
                    inputs[i]);
        }
    }
}
