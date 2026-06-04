public class dowhileloop {
    public static void main(String[] args) {
        int i = 1;
        do { 
            System.out.println("Danish Nawaz "  + i);
            i++; // Increment i to avoid infinite loop
        } while (i <= 5); // Changed condition from i<=0 to i<=5 for proper iteration
    }
}
