public class Casting {
    
    public static void main(String[] args) {
        
        /*
         * Types of Casting:
         * Widening Casting (Automatic): This converts a smaller type to a larger type size, like 'int' to 'long'. It happens automatically. 
         * Narrowing Casting (Manual): This converts a larger type to 
         * a smaller size type, like 'double' to 'int'. This needs to be done manually. 
        */

        // Widening Casting
        int a = 100;
        long b = a; // int to long
        float c = b; // long to float
        System.out.println("Widening Casting:");
        System.out.println("int to long: " + b);
        System.out.println("long to float: " + c);


        // Narrowing Casting

        double x = 100.04;
        long y = (long) x; // double to long
        int z = (int) y; // long to int
        System.out.println("Narrowing Casting:");
        System.out.println("double to long: " + y);
        System.out.println("long to int: " + z);

        // // Casting with Wrapper Classes

        Double wrapperDouble = 45.67;
        int intValue = wrapperDouble.intValue(); // Casting Double to int
        float floatValue = wrapperDouble.floatValue(); // Casting Double to float

        System.out.println("Wrapper Casting:");
        System.out.println("Double to int: " + intValue);
        System.out.println("Double to float: " + floatValue);


    }
}
