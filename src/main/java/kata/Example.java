package kata;

public final class Example {

    private Example() { }

    public static int sum(final int... numbersTosum) {
        int result = 0;
        for (int number : numbersTosum) {
            result += number;
        }
        return result;
    }

}
