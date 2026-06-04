public class oops2{
    public static void main(String[] args){
        Car C = new Car();

        C.setColor("Red");
        C.getSpeed(120);
        C.setWheel(4);

        System.out.println(C.setColor());
        System.out.println(C.getSpeed());
        System.out.println(C.setWheel());
    }
}


class Car{
    String color;
    int speed;
    int wheel;

    public void setColor(String color){
        this.color= color;
    }

    public void getSpeed(int speed){
        this.speed=speed;
    }
    public void setWheel(int wheel){
        this.wheel=wheel;
    }


    public String setColor(){
        return color;
    }
    public int getSpeed(){
        return speed;
    }
    public int setWheel(){
        return wheel;
    }
}