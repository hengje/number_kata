package kata;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public final class NumberConverterTest {

    private final NumberConverter numberConverter = new NumberConverter();

    @Test
    public void allBelow20() {
        assertThat(numberConverter.convert(0)).isEqualTo("null");
        assertThat(numberConverter.convert(1)).isEqualTo("en");
        assertThat(numberConverter.convert(9)).isEqualTo("ni");
        assertThat(numberConverter.convert(10)).isEqualTo("ti");
        assertThat(numberConverter.convert(19)).isEqualTo("nitten");
    }


}
