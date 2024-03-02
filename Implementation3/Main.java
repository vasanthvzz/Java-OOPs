package Implementation3;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen();
        System.out.println(pen.color);
        System.out.println(pen.shape);
        System.out.println(pen.size);
        System.out.println(pen.shape);
        pen.close();
        pen.open();
        pen.write();
    }
}

/*
 * RED
Cylinder
5
Cylinder
The pen has been closed
The pen has been opened
Written using the pen
 */