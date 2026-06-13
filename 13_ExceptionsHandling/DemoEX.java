public class DemoEX {
    public static void main(String [] args){
        int i = 0;
        int j = 0;

        int nums [] = new int[5];
        nums[0] = 4;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 6;
        nums[4] = 7;


        try
        {
            j = 10 /i;
            System.out.println(nums[1]);
            System.out.println(nums[9]);

        }
        catch(ArithmeticException e){
            System.out.println("Can not divided by zero ");
        }


        try{
            System.out.println(nums[9]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Limits out of bound !! ");
        }
        
        System.out.println(j);

        System.out.println("Hello");
    }
}
