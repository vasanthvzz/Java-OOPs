package Implementation3;
public class Pen{
    int size = 5;
    String color = "RED";
    String shape = "Cylinder";
    STATE state = STATE.OPEN;

    public void write(){
        System.out.println("Written using the pen");
    }

    public void open(){  
        System.out.println("The pen has been opened");
    }

    public void close(){
        System.out.println("The pen has been closed");
        
    }

    // public static void main(String[] args) {
    //     Pen pen1 = new Pen();
    //     System.out.println(pen1.size);
    // }
}