public class MathAPI {
    public static void main(String[] args) {
        double a = 45.0;
        double b = 30.0;

        // Basic Math operations
        System.out.println("Max of a and b: " + Math.max(a, b));
        System.out.println("Min of a and b: " + Math.min(a, b));
        System.out.println("Square root of a: " + Math.sqrt(a));
        System.out.println("a to the power of b: " + Math.pow(a, b));

        // Trigonometric operations
        System.out.println("Sine of a: " + Math.sin(Math.toRadians(a)));
        System.out.println("Cosine of a: " + Math.cos(Math.toRadians(a)));
        System.out.println("Tangent of a: " + Math.tan(Math.toRadians(a)));

        // Logarithmic operations
        System.out.println("Natural log of a: " + Math.log(a));
        System.out.println("Base 10 log of a: " + Math.log10(a));
    }                                        

}
