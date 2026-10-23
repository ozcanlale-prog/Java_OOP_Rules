
import bolum_10.Time;

public class TestTime {

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(555550000L);
        Time t3 = new Time(5, 23, 55);
        
        System.out.println("1. Nesne (new Time()): " + t1);
        System.out.println("2. Nesne (new Time(555550000)): " + t2);
        System.out.println("3. Nesne (new Time(5, 23, 55)): " + t3);        
    }   
}
