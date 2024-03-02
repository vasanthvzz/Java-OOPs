package Implementation2;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.color);
        System.out.println(box.shape);
        System.out.println(box.size);
        System.out.println(box.state);
        box.open();
        box.close();
        box.isTheft();
        box.write();
    }
}

/*
YELLOW
CUBOID
20
OPEN
The box has been opened
The box has been closed
The box is not theft
 */