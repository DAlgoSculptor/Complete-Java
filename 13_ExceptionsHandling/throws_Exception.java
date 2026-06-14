public class throws_Exception {
    public static void main(String[] args) throws ArithmeticException {

        int a = 0;
        int b = 0;

        try {
            b = 18 / 0;

            if (b == 0) {
                throw new ArithmeticException();
            }

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println(b);
    }
}