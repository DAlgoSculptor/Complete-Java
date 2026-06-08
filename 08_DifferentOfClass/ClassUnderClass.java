public class ClassUnderClass {
    public static void main(String[] args) {

        A obj = new A();
        obj.Hangi();
        A.B obj2 = obj.new B();
        obj2.sound();
        
    
        
    }
}



class A {
    public void Hangi(){
        System.out.println("Main to thik hi hu , Aaapna Btaeye!!");
    }
    class B{
        public void sound(){
            System.out.println("Its a Buzzing sound !");
        }
    }
}