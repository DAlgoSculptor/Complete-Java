public class AbstractClass {
    public static void main(String[] args){

        A obj = new B();
        obj.Muskan1();
        B obj2 = new B();
        obj2.Muskan();
    }
}


abstract class A {
    public void Muskan1(){
        System.out.println("In Muskan ");
    }
}

class B extends A{ 
    public void Muskan(){
        System.out.println("I will love forever !!");
    }
}