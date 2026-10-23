package bolum_10;
public class MyInteger {
    private int value;

    // Belirtilen int değer ile nesne oluşturan kurucu metot
    public MyInteger(int value) {
        this.value = value;
    }

    // value değerini döndüren getter metodu
    public int getValue() {
        return value;
    }

    // Nesnenin değeri çift mi?
    public boolean isEven() {
        return isEven(this.value);
    }

    // Nesnenin değeri tek mi?
    public boolean isOdd() {
        return isOdd(this.value);
    }

    // Nesnenin değeri asal mı?
    public boolean isPrime() {
        return isPrime(this.value);
    }

    // Belirtilen int değer çift mi? (Statik)
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Belirtilen int değer tek mi? (Statik)
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    // Belirtilen int değer asal mı? (Statik)
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Belirtilen MyInteger nesnesinin değeri çift mi? (Statik)
    public static boolean isEven(MyInteger o) {
        return o.isEven();
    }

    // Belirtilen MyInteger nesnesinin değeri tek mi? (Statik)
    public static boolean isOdd(MyInteger o) {
        return o.isOdd();
    }

    // Belirtilen MyInteger nesnesinin değeri asal mı? (Statik)
    public static boolean isPrime(MyInteger o) {
        return o.isPrime();
    }

    // Nesnenin değeri verilen int değere eşit mi?
    public boolean equals(int n) {
        return this.value == n;
    }

    // Nesnenin değeri verilen MyInteger nesnesine eşit mi?
    public boolean equals(MyInteger o) {
        return o != null && this.value == o.getValue();
    }

    // Karakter dizisini (char[]) int değere dönüştüren statik metot
    public static int parseInt(char[] chars) {
        return Integer.parseInt(new String(chars));
    }

    // String ifadesini int değere dönüştüren statik metot
    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
}