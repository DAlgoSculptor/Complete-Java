public class playwithInterface {
    public static void main(String[] args){
        // Animal Interface 
        Animal  obj = new Dog();
        obj.sound();
        obj.play();

        // Cat Interface

        Cat obj2 = new Dog();
        obj2.makeSound();
        obj2.Jump();


    }
}

// Interface


interface Animal  {
    void sound();
    void play();
}

interface Cat{
    void makeSound();
    void Jump();
}

class Dog implements Cat,Animal {
    @Override
    public void sound(){
        System.out.println("Dog is barking!!");
    }
    @Override
    public void play(){
        System.out.println("Dog plays also with their Dog friend ");
    }
    @Override
    public void makeSound(){
        System.out.println("Meow Soud !");
    }
    @Override
    public void Jump(){
        System.out.println("Jumping is a nature of a cat !");
    }
}

