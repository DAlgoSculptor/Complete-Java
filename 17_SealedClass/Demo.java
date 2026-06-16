public class Demo {

    public static void main(String[] args){

    }
    
}



sealed class A permits  B, C{


}

final class B extends A{

}

final class C extends A {
    
}