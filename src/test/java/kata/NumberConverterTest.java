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

    @Test
    public void tens() {
        assertThat(numberConverter.convert(10)).isEqualTo("ti");
        assertThat(numberConverter.convert(20)).isEqualTo("tjue");
        assertThat(numberConverter.convert(30)).isEqualTo("tretti");
        assertThat(numberConverter.convert(50)).isEqualTo("femti");
        assertThat(numberConverter.convert(90)).isEqualTo("nitti");
    }

    @Test
    public void tensAndOnes() {
        assertThat(numberConverter.convert(21)).isEqualTo("tjueen");
        assertThat(numberConverter.convert(32)).isEqualTo("trettito");
        assertThat(numberConverter.convert(88)).isEqualTo("åttiåtte");
        assertThat(numberConverter.convert(99)).isEqualTo("nittini");
    }

    @Test
    public void hundreds() {
        assertThat(numberConverter.convert(100)).isEqualTo("hundre");
        assertThat(numberConverter.convert(200)).isEqualTo("tohundre");
        assertThat(numberConverter.convert(300)).isEqualTo("trehundre");
        assertThat(numberConverter.convert(900)).isEqualTo("nihundre");
    }

}
