class ReverseSolution {
    public int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            int last_digit = n % 10;
            rev = rev * 10 + last_digit;
            n = n / 10;
        }

        return rev;
    }
}

public class ReverseANumber {
    public static void main(String[] args) {

        ReverseSolution sb = new ReverseSolution();

        int result = sb.reverse(1977465);

        System.out.println(result);
    }
}