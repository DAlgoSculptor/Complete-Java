public class Final{
    public static void main(String[] args){
        final int num = 100;
        // num =10; , Final variable can not be reassign!!
        System.out.println(num);

        Calc obj = new Calc();
        obj.Show();
        obj.Add(10, 10);

        Hello obj1= new Hello();
        obj1.Show1();
        

    }
}



final class Calc {
    public void Show(){
        System.out.println("In Calc Show");
    }
    public void Add(int a , int b){
        System.out.println(a + b);
    }
}

//cannot inherit from final Calc, means Calc Class can not be inherit , when it is using the final keywords.

// class AdvanceCalc extends Calc{ 

// }

// final with Method
class Hello{
    public final void Show1(){
        System.out.println("In hellow show1");
    }

    public void Add1(int a , int b){
        System.out.println(a + b);
    }
}

// Show1() in Jello cannot override Show1() in Hello, because in Hello class , Show() method using final keywords , 
// that probhibits the override functionality.

// class Jello extends  Hello{
//     @Override
//     public void Show1(){
//         System.out.println("In Jello show1"); 
//   overridden method is final
//     }
// }