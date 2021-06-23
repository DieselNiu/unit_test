import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LengthTest {
    @Test
    public void should_1_inch_equal_to_1_inch() {
        Length inch = new Length(1, Unit.Inch);
        assertThat(inch).isEqualTo(new Length(1, Unit.Inch));
    }

    @Test
    public void should_1_foot_equal_to_12_inches() {
        assertThat(new Length(1, Unit.Foot)).isEqualTo(new Length(12, Unit.Inch));
    }

    @Test
    public void should_1_yard_equal_to_3_foot() {
        assertThat(new Length(1, Unit.Yard)).isEqualTo(new Length(3, Unit.Foot));
    }
}
