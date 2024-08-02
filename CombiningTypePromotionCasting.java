public class CombiningTypePromotionCasting {
    
    public static void main(String[] args) {
        byte byteValue = 50;
        char charValue = 'A';
        int intValue = 500;
        float floatValue = 5.67f;
        double doubleValue = 0.1234;

        // Type promotion in expressions
        double result = (byteValue * intValue) + (floatValue / charValue) - (doubleValue * intValue);
        // (int * int) + (float / int) - (double * int)
        // int + float - double => double

        System.out.println("Result of type promotion: " + result);

        // Casting double to int
        int castResult = (int) result;
        System.out.println("Result after casting to int: " + castResult);

    }
}
