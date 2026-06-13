public class FunctionalsInterface {
    public static void main(String[] args) {

        Danish obj = new Danish();
        obj.Happy();

        Nawaz obj1 = new Nawaz();
        obj1.Happy();
    }
}



// Implementation a Functional Interface , which also known as Sam(Single Abstract Method), for defining the functional interface or sam , we use Annotation(@FunctionalInterface)

@FunctionalInterface
interface functional{
    void Happy();
}


class Danish implements functional{
    @Override
    public void Happy(){
        System.out.println("Danish will be Happy , this time !");
    }
}

class Nawaz implements functional{
    @Override
    public void Happy(){
        System.out.println("Nawaz is the last name of Danish , this last name was opted by his late Brother Mr. Najakat Ali !");
    }
}
