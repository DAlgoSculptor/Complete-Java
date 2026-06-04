
public class Demo {
    public static void main(String[] args) {
        VeryAdvanceCalc obj = new VeryAdvanceCalc();

        int result1 = obj.Add(12,20 );
        int result2 = obj.sub(20, 30);
        int result3 = obj.Multi(20, 3);
        int result4 = obj.div(3, 3);
        int result5 = obj.power(4, 2);


        System.out.println("Addition" + ":" + result1);
        System.out.println("Subtraction" + ":" + result2);
        System.out.println("Multiplication" + ":" + result3);
        System.out.println("Division" + ":" + result4);
        System.out.println("Power" + ":" + result5);
       

    }
}
