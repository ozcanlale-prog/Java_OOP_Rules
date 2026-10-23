package bolum_10;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)) <= radius;
    }

    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(this.x - circle.getX(), 2) + 
                                    Math.pow(this.y - circle.getY(), 2));
        return distance + circle.getRadius() <= this.radius;
    }

    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(this.x - circle.getX(), 2) + 
                                    Math.pow(this.y - circle.getY(), 2));
        return distance < this.radius + circle.getRadius() && 
               !this.contains(circle) && !circle.contains(this);
    }
}