package JavaResources;
public class MethodOverride {
    public static void main(String[] args) {

        AdvanceCalc obj = new AdvanceCalc();

        int result = obj.add(20, 20);
        System.out.println(result);
    }
}


class Calc{

    public int add(int a , int b){
        return a + b;
    }
}
class AdvanceCalc extends Calc{

    @Override
    public int add(int a , int b){
        return a + b + 3;
    }
}


