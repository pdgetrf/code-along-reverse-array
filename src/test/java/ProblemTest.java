import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ProblemTest {
    @Test
    public void groupTest() {
        int[][] inputs = {
                {},
                {1},
                {-2, 2},
                {3, -3},
                {1, 2, 3},
                {3, 2, 1, 0},
                {-4, -4, -4},
                {-1, 0, 9, 3, 2}};

        int[][] expected = {
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
            try {
                assertArrayEquals(expected[i], inputs[i]);
            } catch (AssertionError e) {
                System.out.println("test case " + i + " failed: " + e);
                Assert.fail();
            }
        }
    }

    @Test
    public void testUniqueNumbers() {
        int[] data = {5, 1, 8, 3, -2, 9};
        int[] expect = {9, -2, 3, 8, 1, 5};

        Problem.reverseArray(data);
        assertArrayEquals(expect, data);
    }

    @Test
    public void testNonUniqueNumbers() {
        int[] data = {3, 3, 3, 3, 3};
        int[] expect = {3, 3, 3, 3, 3};

        Problem.reverseArray(data);
        assertArrayEquals(expect, data);
    }

    @Test
    public void testSingleNumber() {
        int[] data = {3};
        int[] expect = {3};

        Problem.reverseArray(data);
        assertArrayEquals(expect, data);
    }
}
