public class MethodOverride {
    public static void main(String[] args) {

        // Create an instance of the parent class (Calc)
        Calc calc = new Calc();
        int result1 = calc.add(20, 20);
        System.out.println("Calc.add(20, 20): " + result1);

        // Create an instance of child class (CalcChild)
        CalcChild obj = new CalcChild();
        int result2 = obj.add(20, 20);
        System.out.println("CalcChild.add(20, 20) [overridden]: " + result2);
    }
}

// Parent class
class Calc {
    public int add(int a, int b) {
        return a + b;
    }
}

// Child class with method override
class CalcChild extends Calc {
    @Override
    public int add(int a, int b) {
        return a + b + 3; // Override: add 3 extra to the sum
    }
}

