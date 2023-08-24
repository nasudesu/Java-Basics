public class Lottorivi {
    public static void main(String[] args) {

        final int Numbers = 7, TOTAL = 39;
        int guessed;

        int[] row = new int[Numbers];
        boolean shown = false;

        do {
            for (int i = 0; i < Numbers; i++) {
                guessed = (int) (Math.random() * TOTAL) + 1;

                shown = false;
                for (int j = 0; j <= i - 1; j++) {
                    if (row[j] == guessed) {
                        shown = true;
                    }
                }

                System.out.println(guessed);
            }
        } while (shown);
    }
}
