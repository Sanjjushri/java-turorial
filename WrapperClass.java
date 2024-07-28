
public class WrapperClass {

    public static void main(String[] args) {
        
        // Primitive types
        boolean primitiveBool = true;
        char primitiveChar = '@';
        int primitiveInt = 123;
        double primitiveDouble = 3.14;
        
        // Wrapper classes
        Boolean a = true;
        Boolean wrapperBool = Boolean.valueOf(primitiveBool);
        Character wrapperChar = Character.valueOf(primitiveChar);
        Integer wrapperInt = Integer.valueOf(primitiveInt);
        Double wrapperDouble = Double.valueOf(primitiveDouble);
        
        // Using methods from wrapper classes
        System.out.println("Wrapper Boolean: " + wrapperBool.toString());
        System.out.println("Wrapper Character: " + wrapperChar.charValue());
        System.out.println("Wrapper Integer: " + wrapperInt.hashCode());
        System.out.println("Wrapper Double: " + wrapperDouble.isInfinite());
        
        // Autoboxing example
        Integer autoBoxedInt = 100;  // The primitive 100 is automatically boxed into an Integer

        // Unboxing example
        int unboxedInt = autoBoxedInt;  // The Integer is automatically unboxed into a primitive int

        System.out.println(unboxedInt);
    }
}
