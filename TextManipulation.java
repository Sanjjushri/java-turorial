public class TextManipulation {
    
    public static void main(String[] args){
        String str = "Hello";
        str = str + " World"; // Concatenating strings
        System.out.println(str); // Output: Hello World

        // Getting substring
        String subStr = str.substring(6); // Extracts substring from index 6 to end
        System.out.println(subStr); // Output: World

        /**
         * Using the StringBuilder Class:
         */

        StringBuilder sb = new StringBuilder("Java");

        // Appending text
        sb.append(" is").append(" awesome");
        System.out.println(sb.toString()); // Output: Java is awesome

        // Inserting text at a specific position
        sb.insert(5, " programming");
        System.out.println(sb.toString()); // Output: Java programming is awesome

        // Replacing text
        sb.replace(5, 16, " code"); // Replace "programming" with "code"
        System.out.println(sb.toString()); // Output: Java code is awesome

        // Deleting text
        sb.delete(9, 12); // Delete "code"
        System.out.println(sb.toString()); // Output: Java is awesome

        /**
         * Using Text Blocks:
         */

         String htmlContent = """
                <html>
                    <body>
                        <h1>Welcome to Java</h1>
                        <p>This is a text block example.</p>
                    </body>
                </html>
                """;

        System.out.println(htmlContent);

    }
}
