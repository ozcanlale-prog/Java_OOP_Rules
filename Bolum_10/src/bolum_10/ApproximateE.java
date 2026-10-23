import java.math.BigDecimal;
import java.math.MathContext;

public class ApproximateE {
    public static void main(String[] args) {
        MathContext mc = new MathContext(25);

        for (int i = 100; i <= 1000; i += 100) {
            System.out.println("i = " + i + " için e değeri: " + calculateE(i, mc));
        }
    }

    public static BigDecimal calculateE(int n, MathContext mc) {
        BigDecimal e = BigDecimal.ONE;
        BigDecimal term = BigDecimal.ONE;

        for (int i = 1; i <= n; i++) {
            term = term.divide(new BigDecimal(i), mc);
            e = e.add(term, mc);
        }

        return e;
    }
}