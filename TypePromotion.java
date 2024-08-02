public class TypePromotion {
    public static void main(String[] args) {
        
        /*
         * Rules of Type Promotion:
         * When using expressions, byte, short, and char values are promoted to 
         * int
         * If one operand is a long, float, or double, the entire expression is 
         * promoted to long, float, or double, respectively.
         */


        byte a = 10;
        byte b = 20;
        int result = a + b; // byte + byte is promoted to int
        System.out.println("Result (byte to int): " + result);

        int c = 100;
        long d = 200L;
        long result2 = c + d; // int + long is promoted to long
        System.out.println("Result (int to long): " + result2);

        float e = 3.5f;
        double f = 2.7;
        double result3 = e + f; // float + double is promoted to double
        System.out.println("Result (float to double): " + result3);
 

       

    }
}