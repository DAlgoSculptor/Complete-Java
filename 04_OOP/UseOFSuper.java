public class UseOFSuper {
    public static void main(String[] args) {
        System.out.println("=== Creating B object with parameter 10 ===");
        B obj = new B(10);
    }
}

class A {
    public A() {
        super();
        System.out.println("This is Default Constructor of class A!");
    }
    
    public A(int a) {
        super();
        System.out.println("This is a Parameterized Constructor of class A! (a=" + a + ")");
    }
}

class B extends A {
    
    public B() {
        super();
        System.out.println("This is a Default Constructor of B!");
    }
    
    public B(int a) {
        super(a); // Call parent constructor with parameter
        System.out.println("This is a Parameterized Constructor of B! (a=" + a + ")");
    }
}
