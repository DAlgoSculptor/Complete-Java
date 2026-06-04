public class Encapsulation {
    public static void main(String[] args){
        Encap en = new Encap();

        en.setAge(22);
        en.setName("Danish Nawaz");
        en.setId(78);

        System.out.println("Name: " + en.getName());
        System.out.println("Age: " + en.getAge());
        System.out.println("Id: " + en.getId());
    }
}

class Encap {
    private int age;
    private String name;
    private int id;


    public Encap(){  // Constructor
        System.out.println("This is a Constructor!");
    }


    // Getter 
    public  int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    // setter

    public void setAge(int age){
        this.age=age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id=id;
    }

}