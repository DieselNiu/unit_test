public class Unit {
    public static Unit Inch = new Unit(1);
    public static Unit Foot = new Unit(12);
    public static Unit Yard = new Unit(36);
    private final int conversionRateInInches;
    private Unit(int conversionRateInInches) {
        this.conversionRateInInches = conversionRateInInches;
    }

    int getAmountInInches(int rawAmount) {
        return rawAmount * conversionRateInInches;
    }
}
