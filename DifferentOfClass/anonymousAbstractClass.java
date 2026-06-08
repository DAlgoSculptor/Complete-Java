public class anonymousAbstractClass {
    public static void main(String[] args){


        A obj = new A(){
            @Override
            public void show(){
                System.out.println("in new Show!");
            }
            @Override
            public void config(){
                System.out.println("In config ");
            }
        };
        obj.show();
        obj.config();

    }
}


abstract class A {
    public abstract void show();
    public abstract void config();
}


