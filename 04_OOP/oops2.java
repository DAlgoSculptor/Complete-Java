
public class oops2{
    public static void main(String[] args){
        Car C = new Car();

        C.setColor("Red");
        C.setSpeed(120);
        C.setWheel(4);

        System.out.println(C.getColor());
        System.out.println(C.getSpeed());
        System.out.println(C.getWheel());
    }
}


class Car{
    String color;
    int speed;
    int wheel;

    // Setter for color
    public void setColor(String color){
        this.color = color;
    }

    // Setter for speed
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    // Setter for wheel
    public void setWheel(int wheel){
        this.wheel = wheel;
    }

    // Getter for color
    public String getColor(){
        return color;
    }
    
    // Getter for speed
    public int getSpeed(){
        return speed;
    }
    
    // Getter for wheel
    public int getWheel(){
        return wheel;
    }
}