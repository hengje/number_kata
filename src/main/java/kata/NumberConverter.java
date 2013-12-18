package kata;

import java.util.HashMap;
import java.util.Map;

public final class NumberConverter {

    private final Map<Integer, String> below_20;
    private final Map<Integer, String> tens;

    public NumberConverter() {
        this.below_20 = new HashMap<Integer, String>();
        below_20.put(0, "null");
        below_20.put(1, "en");
        below_20.put(2, "to");
        below_20.put(3, "tre");
        below_20.put(4, "fire");
        below_20.put(5, "fem");
        below_20.put(6, "seks");
        below_20.put(7, "sju");
        below_20.put(8, "åtte");
        below_20.put(9, "ni");
        below_20.put(10, "ti");
        below_20.put(11, "elleve");
        below_20.put(12, "tolv");
        below_20.put(13, "tretten");
        below_20.put(14, "fjorten");
        below_20.put(15, "femten");
        below_20.put(16, "seksten");
        below_20.put(17, "sytten");
        below_20.put(18, "atten");
        below_20.put(19, "nitten");

        tens = new HashMap<Integer, String>();
        tens.put(2, "tjue");
        tens.put(3, "tretti");
        tens.put(4, "førti");
        tens.put(5, "femti");
        tens.put(6, "seksti");
        tens.put(7, "søtti");
        tens.put(8, "åtti");
        tens.put(9, "nitti");

    }

    public String convert(final int i) {
        if (i < 20) return below_20.get(i);
        if (i < 100) return tens.get(i / 10);
        return below_20.get(i);
    }
}
