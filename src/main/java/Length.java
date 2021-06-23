import java.util.Objects;

public class Length {
    private final int amountInInches;

    public Length(int rawAmount, Unit unit) {
        this.amountInInches = unit.getAmountInInches(rawAmount);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return amountInInches == length.amountInInches;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountInInches);
    }
}
