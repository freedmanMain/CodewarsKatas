//Complete the function that calculates the area of the red square,
//when the length of the circular arc A is given as the input. Return the result rounded to two decimals.
//
//Graph
//
//Note: use the π value provided in your language (Math::PI, M_PI, math.pi, etc)

public class Geometry {
    public static double squareArea(double A) {
        double l = (2 * A) / Math.PI;
        double x = l * l;
        double y = Math.round(x * 100) * 0.01d;
        return y;
    }
}