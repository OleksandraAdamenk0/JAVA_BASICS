package Task3;

public class AscDigitSumComparator extends DigitSumComparator {
    @Override
    public int compare(Integer n1, Integer n2) {
        return Integer.compare(sumOfDigits(n1), sumOfDigits(n2));
    }
}
