
class Solution{
    public int fib(int n){
        if(n <=1){
            return n;

        }

        int a = 0;
        int b = 1;
        for(int i = 2; i<=n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return b;


    }
}


public class Fibonacci_5{
    public static void main(String[] args){

        Solution s = new Solution();

        int result = s.fib(10);

        System.out.println(result);
        
    }
}