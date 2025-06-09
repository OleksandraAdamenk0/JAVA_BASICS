package Task3;

import java.util.Comparator;

public abstract class DigitSumComparator implements Comparator<Integer> {
    protected int sumOfDigits(Integer number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
