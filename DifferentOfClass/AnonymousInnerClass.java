public class AnonymousInnerClass {
    public static void main(String[] args) {
        Animal animal= new Animal(){
            @Override
            public void Bark(){
                System.out.println("Anonymous Inner class !");
            }
        };
        animal.Bark();
    }
}



class Animal {
    public void Bark(){
        System.out.println("dog's Barks !");
    }
}