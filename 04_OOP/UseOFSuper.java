package JavaResources;
public class UseOFSuper {
    public static void main(String[] args){
        B obj = new B(10);


    }
}


class A {
    public A(){
        super();
        System.out.println("This is Default Constructor of An A !");
    }
    public A(int a){
        super();
        System.out.println("This is a Parameterized Constructor of an A !");
    }

}
class B extends A
{
    
    public B(){
        super();
        
        System.out.println("This is a Default Constructor of B!");
    }
    // this is a Parameterized Constructor 

    public B(int a){
        // super(a);
        this();
        System.out.println("This is a parameterized construstor of B ! ");
    }


}
