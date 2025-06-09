package Task2;

public enum Month {
    JANUARY(31), FEBRUARY(28),
    MARCH(31), APRIL(30), MAY(31),
    JUNE(30), JULY(31), AUGUST(31),
    SEPTEMBER(30), OCTOBER(31), NOVEMBER(30),
    DECEMBER(31);

    private final int days;

    Month(int days) { this.days = days; }

    public int getDays() { return days; }

    public Month next() {
        int nextOrdinal = this.ordinal() + 1;
        if (nextOrdinal >= Month.values().length) nextOrdinal = 0;
        return Month.values()[nextOrdinal];
    }

    public Month previous() {
        int nextOrdinal = this.ordinal() - 1;
        if (nextOrdinal < 0) nextOrdinal = Month.values().length - 1;
        return Month.values()[nextOrdinal];
    }

    public String getSeason() {
        return switch (this) {
            case JANUARY, FEBRUARY, DECEMBER -> "Winter";
            case MARCH, APRIL, MAY -> "Spring";
            case JUNE, JULY, AUGUST -> "Summer";
            case SEPTEMBER, OCTOBER, NOVEMBER -> "Fall";
        };
    }

    @Override
    public String toString() {
        return switch (this) {
            case JANUARY -> "Січень";
            case FEBRUARY -> "Лютий";
            case DECEMBER -> "Грудень";
            case MARCH -> "Березень";
            case APRIL -> "Квітень";
            case MAY -> "Травень";
            case JUNE -> "Червень";
            case JULY -> "Липень";
            case AUGUST -> "Серпень";
            case SEPTEMBER -> "Вересень";
            case OCTOBER -> "Жовтень";
            case NOVEMBER -> "Листопад";
        };
    }

    public static void printAllMonthsInfo() {
        for (Month month : Month.values()) {
            System.out.printf("%-10s | Days: %2d | Season: %-6s | Next: %-10s | Previous: %-10s | Ukrainian name: %-10s%n",
                    month.name(), month.getDays(), month.getSeason(), month.next().name(), month.previous().name(), month);
        }
    }
}
