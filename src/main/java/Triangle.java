public class Triangle {
    private Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle() {
    }

    public static double perimeter(Triangle tg) {
        if ((tg.p1.get_x() == tg.p2.get_x()) && (tg.p1.get_y() == tg.p2.get_y())
                || (tg.p1.get_x() == tg.p3.get_x()) && (tg.p1.get_y() == tg.p3.get_y())
                || (tg.p2.get_x() == tg.p3.get_x()) && (tg.p2.get_y() == tg.p3.get_y())) {
            return -1;
        } else {
            double a = tg.p1.distance(tg.p2);
            double b = tg.p1.distance(tg.p3);
            double c = tg.p2.distance(tg.p3);
            return a + b + c;
        }
    }

    public static double area(Triangle tg) {
        if ((tg.p1.get_x() == tg.p1.get_x()) && (tg.p1.get_y() == tg.p2.get_y())
                || (tg.p1.get_x() == tg.p3.get_x()) && (tg.p1.get_y() == tg.p3.get_y())
                || (tg.p2.get_x() == tg.p3.get_x()) && (tg.p2.get_y() == tg.p3.get_y())) {
            return -1;
        } else {
            double p = perimeter(tg) / 2;
            double area = Math.sqrt(p * (p - tg.p1.distance(tg.p2)) * (p - tg.p1.distance(tg.p3)) * (p - tg.p2.distance(tg.p3)));
            return area;
        }
    }


}