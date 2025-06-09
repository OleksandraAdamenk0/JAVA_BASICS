package Task3;

public class DescDigitSumComparator extends  DigitSumComparator {
    @Override
    public int compare(Integer n1, Integer n2) {
        return sumOfDigits(n2) - sumOfDigits(n1);
    }
}
