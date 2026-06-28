public class FindSecondHighestNumber_3 {
    public static void main(String[] args) {
        int[] arr = {10, 30, 5, 60, 36};


        int max = arr[0];


        for(int i = 1; i<arr.length; i++){
            if(arr[i] >max){
                max = arr[i];
            }
        }


        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] !=max && arr[i] > secondMax){
            secondMax = arr[i];
            }
        }
        System.out.println(secondMax);

    }
    

}
