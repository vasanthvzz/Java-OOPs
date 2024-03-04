package Implementation12;


public class Main {
    public static void main(String[] args) {
        Pen pen = new Box();
        System.out.println(pen.color);
        System.out.println(pen.shape);
        System.out.println(pen.size);
        pen.close();
        //  pen.isTheft(); -> box function is unable to access
       // pen.cleaning(); -> bag function unable to access
       pen.open();
    }
}
