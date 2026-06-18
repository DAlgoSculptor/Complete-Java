public class CountEven {
    public static void main(String[] args) {
        int[] arr= {10, 2 , 3, 5, 6, 8, 20};
        int Count = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 ==0){
                
                Count = Count + 1;
                
            }
        }
        System.out.println(Count);

        
    }
}






