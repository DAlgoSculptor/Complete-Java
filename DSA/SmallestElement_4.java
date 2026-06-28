public class SmallestElement_4{
    public static void main(String[] args){
        int[] arr = {5, 10, 9, 4, 6};


        int min = arr[0];

        for(int i=1; i<arr.length; i++){

            if(arr[i]<min){
                min = arr[i];
            }
            
        }
        System.out.println(min);
        
    }
}