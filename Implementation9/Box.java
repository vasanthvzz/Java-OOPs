package Implementation8;

public class Box extends Pen implements Interface1{

    int size = 20;
    String color = "YELLOW";
    String shape = "CUBOID";
    STATE state = STATE.OPEN;

    public void store(){
        System.out.println("The item has been stored in the box");;
    }

    public void open(){
        System.out.println("The box has been opened");
    }
    public void close(){
        System.out.println("The box has been closed");
    }

    void isTheft(){
        System.out.println("The box is not theft");
    }
    // public void cleaning(){
        
    // }
}
/*
 * Box doesnt have cleaning method
 */