

public class Demo {


    public static void main(String[] args){

        B obj = new B();
        obj.showTheDataWhichBelongToThisClass();

    }
    
}


class A {
    public void showTheDataWhichBelongToThisClass(){
        System.out.println("In A show !");
    }
}

class B extends A{
    @Override
    public void showTheDataWhichBelongToThisClass(){
        System.out.println("In B show !");
    }
}
