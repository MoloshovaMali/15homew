public class Circle {
    private double PI;
    private static int radius;

    public Circle(double PI, int radius) {
        this.PI = PI;
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static void area(){
        double area = Math.PI * (radius * radius);
        System.out.println("Площадь круга равна: " + area);
    }
    public static void circumference(){
        double circumference= Math.PI * 2*radius;
        System.out.println("Длины окружности равна: " + circumference) ;
    }

    @Override
    public String toString() {
        return "" +
                "PI=" + PI +
                ", radius=" + radius ;

    }
}
