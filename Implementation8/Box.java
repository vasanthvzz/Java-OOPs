package Implementation8;

public class Box extends Pen implements Interface1{

    int size = 20;
    String color = "YELLOW";
    String shape = "CUBOID";
    STATE state = STATE.OPEN;

    public void open(){
        System.out.println("The box has been opened");
    }
    public void close(){
        System.out.println("The box has been closed");
    }

    void isTheft(){
        System.out.println("The box is not theft");
    }
}
