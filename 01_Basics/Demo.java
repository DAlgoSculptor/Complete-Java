// Demo class - Demonstrates calculator functionality with method overloading

public class Demo {
    public static void main(String[] args) {
        // Create calculator instance
        SimpleCalc calc = new SimpleCalc();
        
        // Method overloading examples
        System.out.println("=== Simple Calculator Demo (Method Overloading) ===");
        System.out.println("Add (int): " + calc.add(5, 10));
        System.out.println("Add (double): " + calc.add(5.5, 10.5));
        System.out.println("Add (3 ints): " + calc.add(5, 10, 15));
        
        System.out.println("\n=== Advanced Calculator Demo ===");
        AdvCalc obj = new AdvCalc();

        int result1 = obj.Add(12, 20);
        int result2 = obj.sub(20, 30);
        int result3 = obj.Multi(20, 3);
        int result4 = obj.div(6, 2);
        int result5 = obj.power(4, 2);

        System.out.println("Addition: " + result1);
        System.out.println("Subtraction: " + result2);
        System.out.println("Multiplication: " + result3);
        System.out.println("Division: " + result4);
        System.out.println("Power: " + result5);
    }
}

// Simple calculator with method overloading
class SimpleCalc {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Advanced calculator class
class AdvCalc {
    public int Add(int a, int b) {
        return a + b;
    }
    
    public int sub(int a, int b) {
        return a - b;
    }
    
    public int Multi(int a, int b) {
        return a * b;
    }
    
    public int div(int a, int b) {
        return a / b;
    }
    
    public int power(int a, int b) {
        return (int)(Math.pow(a, b));
    }
}