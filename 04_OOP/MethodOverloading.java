package JavaResources;
public class MethodOverloading{
    public static void main(String[] args){

        Calculator obj= new Calculator();
        int result = obj.Add(10,20 );
        int result1= obj.Add(20,30);
        int result2 = obj.Add(10,20,30);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}


class Calculator{
    public int Add(int a, int b){
        return a + b;
    }

    public double Add(int a , double b){
        return a + b;
    }

    public int Add(int a , int b , int c){
        return a + b + c;
    }
}