
public class LargestElement_2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 6, 10};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest Element = " + largest);
    }
}