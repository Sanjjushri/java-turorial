package advanced;


public class Singleton {
	 
    // 'volatile' ensures that changes made by one thread are visible to others immediately
    private static volatile Singleton instance;
    private String data; // Example of instance-specific data, like a database connection

    // Private constructor to prevent direct instantiation
    private Singleton(String data) {
        this.data = data;
    }

    // Method to provide global access to the single instance
    public static Singleton getInstance(String data) {
        // First check (outside synchronized block)
        Singleton result = instance;
        if (result == null) {
            // Synchronize on the Singleton class to prevent multiple threads from creating instances
            synchronized (Singleton.class) {
                result = instance;  // Re-check after acquiring the lock
                if (result == null) {
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;  // Return the singleton instance
    }
}
	