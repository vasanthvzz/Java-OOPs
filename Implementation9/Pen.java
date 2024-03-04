package Implementation9;
public class Pen  implements Interface1{
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
    /*
     * Pen doesnt have store and cleanning method
     */

}