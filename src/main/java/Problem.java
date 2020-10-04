public class Problem {
    public static void reverseArray(final int[] input) {
        if (input == null) {
            return;
        }

        for (int i = 0; i < input.length / 2; i++) {
            swap(input, i, input.length - 1 - i);
        }
    }

    private static void swap(int[] input, int i, int j) {
        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }
}
