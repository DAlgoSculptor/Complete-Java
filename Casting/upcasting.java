public class upcasting {
    public static void main(String[] args){

        A obj = new B();   // UpCasting
        obj.Show1();



    }
}


class A {
    public void Show1(){
        System.out.println("In A Show");
    }
}

class B extends A {
    public void Show(){
        System.out.println("In B show");
    }
}