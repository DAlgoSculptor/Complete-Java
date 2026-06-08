public class ObjectClass {
    public static void main(String[] args) {

        MyVillage ownVillage = new MyVillage("Itwan", 12000);
        OthersVillage otherVillage = new OthersVillage("Mahesia", 20000);

        // Calling Object class functionality
        System.out.println(ownVillage.toString());
        System.out.println(otherVillage.toString());

        // getClass() is also from Object class
        System.out.println("Class Name: " + ownVillage.getClass().getName());
        System.out.println("Class Name: " + otherVillage.getClass().getName());
    }
}

class MyVillage {

    String villageName;
    int salary;

    public MyVillage(String villageName, int salary) {
        this.villageName = villageName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Village Name = " + villageName +
               ", Salary = " + salary;
    }
}

class OthersVillage extends MyVillage {

    public OthersVillage(String villageName, int salary) {
        super(villageName, salary);
    }

    @Override
    public String toString() {
        return "Neighbor Village = " + villageName +
               ", Salary = " + salary;
    }
}