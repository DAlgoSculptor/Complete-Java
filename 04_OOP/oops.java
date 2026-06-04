package JavaResources;
public class oops {
    public static void main(String[] args){

        Calculator calc = new Calculator();
        int result=calc.Add(4, 5);
        System.out.println(result);

    }
}


class Calculator{
    public int Add(int a , int b){
        return a + b;
}
}
