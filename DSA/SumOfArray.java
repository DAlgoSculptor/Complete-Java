public class SumOfArray {
    public static void main(String[] args) {
        int [] arr={10, 20, 40, 50, 60};


        int Sum = 0;


        for(int i = 0; i<arr.length; i++){
            Sum = Sum + arr[i];
        }
        System.out.println(Sum);
    }
}
