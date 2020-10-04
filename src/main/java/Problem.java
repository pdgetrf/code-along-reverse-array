public class Problem {
    public static void reverseArray(final int[] input) {
        if (input == null) {
            return;
        }

        for (int i = 0; i < input.length / 2; i++) {
            int tmp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = tmp;
        }
    }
}
