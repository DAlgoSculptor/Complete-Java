public class StringBufferr {
    
    public static void main(String[] args) {
        // Create StringBuffer with initial value
        StringBuffer sb = new StringBuffer("Danish");
        
        System.out.println("Original string: " + sb);
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
        
        // Append operation
        sb.append(" Nawaz");
        System.out.println("\nAfter append: " + sb);
        
        // Reverse operation
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
        // Insert operation
        sb.reverse(); // Reverse back
        sb.insert(7, " (");
        sb.append(")");
        System.out.println("After insert: " + sb);
        
        // Delete operation
        sb.delete(7, 9);
        System.out.println("After delete: " + sb);
    }
}
