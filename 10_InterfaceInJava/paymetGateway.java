public class paymetGateway {
    public static void main(String[] args) {

        Payment way = new UpiPayment();
        way.pay();
        Payment way1= new DebitCard();
        way1.pay();
        
    }
}

@FunctionalInterface
interface Payment{
    void pay();
}

class UpiPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("Pay using Upi ");
    }
}

class DebitCard implements Payment{
    @Override
    public void pay(){
        System.out.println("Pay using DebitCard");
    }
}