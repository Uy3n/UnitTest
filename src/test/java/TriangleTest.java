import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    //    Tam giác thường
    Triangle tg = new Triangle(new Point(0, 0), new Point(2, 1), new Point(5, 3));

    @Test
    @DisplayName("Cal Perimeter Triangle")
    void calPerimeterTriangle() {
        double actual = Triangle.perimeter(tg);
        double expected = 11.67257114780908;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Cal Area Triangle")
    void calAreaTriangle() {
        double actual = Triangle.area(tg);
        double expected = 0.5000000000000027;
        assertEquals(expected, actual);
    }

    //    Tam giác vuông
    Triangle tgv = new Triangle(new Point(0, 0), new Point(0, 3), new Point(4, 0));

    @Test
    @DisplayName("Cal Perimeter Right Triangle")
    void calPerimeterRightangledTriangle() {
        double actual = Triangle.perimeter(tgv);
        double expected = 12d;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Cal Area Right-angled Triangle")
    void calAreaRightangledTriangle() {
        double actual = Triangle.area(tgv);
        double expected = 6d;
        assertEquals(expected, actual);
    }

    //    Tam giác vuông cân
    Triangle tgvc = new Triangle(new Point(0, 0), new Point(0, 1), new Point(1, 0));

    @Test
    @DisplayName("Calculate Permeter isosceles right Triangle")
    void calPermeterIsoscelesRightTriangle() {
        double actual = Triangle.perimeter(tgvc);
        double expected = 3.414213562373095;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Calculate area isosceles right Triangle")
    void calAreaIsoscelesRightTriangle() {
        double actual = Triangle.area(tgvc);
        double expected = 0.49999999999999983;
        assertEquals(expected, actual);
    }

    //    Tam giác cân
    Triangle tgc = new Triangle(new Point(3, 2), new Point(0, 2), new Point(0, 3));

    @Test
    @DisplayName("Cal Permeter isosceles triangle ")
    void calPermeterIsoscelesTriangle() {
        double actual = Triangle.perimeter(tgc);
        double expected = 7.16227766016838;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Cal Area isosceles triangle")
    void calAreaIsoscelesTriangle() {
        double actual = Triangle.area(tgc);
        double expected = -1d;
        assertEquals(expected, actual);
    }

    //    Tam giác đều
    Triangle tgd = new Triangle(new Point(3, 2), new Point(0, 2), new Point(0, 3));

    @Test
    @DisplayName("Cal Perimeter Equilateral triangle")
    void calPerimeterEquilateralTriangle() {
        double actual = Triangle.perimeter(tgd);
        double expected = 7.16227766016838;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Cal Area equilateraltriangle")
    void calAreaEquilateralTriangle() {
        double actual = Triangle.area(tgc);
        double expected = -1d;
        assertEquals(expected, actual);
    }

    //    Không phải tam giác
    Triangle kptg = new Triangle(new Point(1, 1), new Point(1, 1), new Point(2, 2));

    @Test
    @DisplayName("Not Triangle Permater")
    void notTrianglePermater() {
        double actual = Triangle.area(kptg);
        double expected = -1d;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Not Triangle Area ")
    void notTriangleArea() {
        double actual = Triangle.area(kptg);
        double expected = -1d;
        assertEquals(expected, actual);
    }
}