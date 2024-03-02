package Implementation4;

public class Main {
    public static void main(String[] args) {
        Box box = new Bag();
        System.out.println(box.color);
        System.out.println(box.shape);
        System.out.println(box.size);
        box.close();
        box.isTheft();
       // box.cleaning(); bag function unable to access
       box.open();
    }
}

/*
YELLOW
CUBOID
20
The bag has been closed
The bag is safe
The bag has been opened 
*/