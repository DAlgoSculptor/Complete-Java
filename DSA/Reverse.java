public class Reverse{
    public static void main(String[] args) {
        // find reverse value


        int num =1234567;
        int reverse_value=0;

        while(num>0){
            int last_digit= num % 10;
            reverse_value= reverse_value * 10 + last_digit;
            num = num / 10;

        }
        System.out.print(reverse_value  + " ");
    }
}