public class DownCasting {
    public static void main(String[] args) {


        Halku obj = new Falku(); // it is upcasting
        obj.Show();
        
        Falku obj1 = (Falku) obj; // This is DownCasting
        obj1.Show1();   
        
    }
    
}

class Halku {
    public void Show(){
        System.out.println("Halku's Show");
    }
}

class Falku extends Halku{
    public void Show1(){
        System.out.println("Falku's Show1");
    }
}