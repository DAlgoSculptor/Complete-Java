public class Demo {
    public static void main(String[] args) {
        Calc obj = new Calc();

        int result1 = obj.Add(12,20 );
        int result2 = obj.sub(20, 30);
        int result3 = obj.multi(23, 40);

        System.out.println("Addition" + ":" + result1);
        System.out.println("Subtraction" + ":" + result2);
        System.out.println("Multiplication" + ":" + result3);
        
    }
}
