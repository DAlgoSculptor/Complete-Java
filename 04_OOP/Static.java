
public class Static {
    public static void main(String[] args){

        
        Mobile obj = new Mobile();
        obj.name ="SmartPhone";
        obj.price =1700;
        Mobile.brand ="Apple";

        Mobile.brand="phone";

        obj.display();
    


       

    }
}



class Mobile{
    String name;
    int price;
    static String brand;

    public void display(){
        System.out.println("Name" + ":" + name);
        System.out.println("Price" + ":" + price);
        System.out.println("Brand" + ":" + brand);
    }
}
