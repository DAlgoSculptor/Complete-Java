public class LambdaExpression {
    public static void main(String[] args) {
        Calculator obj = (a , b ) -> {
            return a + b;
        };
       int result = obj.Add(10,20 );

       System.out.println("The sum of Two number is " + ":" + result);
        
    }
}


@FunctionalInterface

interface Calculator{
    int Add(int a , int b);
}