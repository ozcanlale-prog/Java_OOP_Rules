import bolum_10.MyPoint;
public class TestMyPoint {
    
public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);

        System.out.println("p1 Koordinatları: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("p2 Koordinatları: (" + p2.getX() + ", " + p2.getY() + ")");

        System.out.println("p1 ile p2 arasındaki mesafe (nesne ile): " + p1.distance(p2));
        System.out.println("p1 ile (10, 30.5) arasındaki mesafe (koordinat ile): " + p1.distance(10, 30.5));
        System.out.println("p1 ile p2 arasındaki mesafe (statik metot ile): " + MyPoint.distance(p1, p2));
    }    
    
}
