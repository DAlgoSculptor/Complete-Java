package JavaResources;

/**
 * String class - Demonstrates String operations and methods
 */
public class string {
    public static void main(String[] args) {
        // String initialization
        String str1 = "Hello";
        String str2 = "World";
        
        // String concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenation: " + result);
        
        // String length
        System.out.println("Length of 'Hello': " + str1.length());
        
        // Character at index
        System.out.println("Character at index 1: " + str1.charAt(1));
        
        // Substring
        System.out.println("Substring (0-3): " + str1.substring(0, 3));
        
        // String comparison
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
        
        // Case conversion
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str2.toLowerCase());
        
        // Index of
        System.out.println("Index of 'o' in 'Hello': " + str1.indexOf('o'));
        
        // Replace
        System.out.println("Replace 'l' with 'x': " + str1.replace('l', 'x'));
    }
}
