package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {

    }
    public static int sum(int[] numbers) {
        int sumTotal = 0;
        for (int number : numbers) {
            sumTotal += number;
        }
        return sumTotal;
    }

    public static double average(int[] numbers) {
        double averageTotal = sum(numbers) / numbers.length;
        return averageTotal;
    }



    public static int min(int[] numbers) {
        int minTotal = numbers[0];
        for (int number : numbers) {
            if (minTotal > number) {
                minTotal = number;
            }
        }
        return minTotal;
    }

    public static int max(int[] numbers) {
        int maxTotal = numbers[0];
        for (int number : numbers) {
            if (maxTotal < number) {
                maxTotal = number;
            }
        }
        return maxTotal;
    }


}
