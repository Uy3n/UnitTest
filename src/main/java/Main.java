public class Main {
    public static void main(String[] args) {
        Triangle kptg = new Triangle(new Point(1, 1), new Point(1, 1), new Point(2, 2));
        System.out.println(Triangle.area(kptg));
        System.out.println(Triangle.perimeter(kptg));
    }
}
