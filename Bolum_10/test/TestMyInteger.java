import bolum_10.MyInteger;
public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(17);
        MyInteger n2 = new MyInteger(4);

        // Getter ve Nesne Metotları Testi
        System.out.println("n1 değeri: " + n1.getValue());
        System.out.println("n1 çift mi? " + n1.isEven());
        System.out.println("n1 tek mi? " + n1.isOdd());
        System.out.println("n1 asal mı? " + n1.isPrime());
        
        System.out.println("\nn2 değeri: " + n2.getValue());
        System.out.println("n2 çift mi? " + n2.isEven());
        System.out.println("n2 asal mı? " + n2.isPrime());

        // Statik Metot Testleri (int parametreli)
        System.out.println("\nStatik isPrime(19): " + MyInteger.isPrime(19));
        System.out.println("Statik isEven(8): " + MyInteger.isEven(8));

        // Statik Metot Testleri (MyInteger parametreli)
        System.out.println("Statik isOdd(n1): " + MyInteger.isOdd(n1));

        // Equals Testleri
        System.out.println("\nn1, 17'ye eşit mi? " + n1.equals(17));
        System.out.println("n1, n2'ye eşit mi? " + n1.equals(n2));

        // ParseInt Testleri
        char[] charArray = {'1', '2', '3', '4', '5'};
        System.out.println("\nchar[] parse sonucu: " + MyInteger.parseInt(charArray));
        System.out.println("String parse sonucu: " + MyInteger.parseInt("9876"));
    }
}
