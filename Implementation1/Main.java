package Implementation1;

public class Main {
    public static void main(String[] args) {
        Bag bag = new Bag();
        System.out.println(bag.color);
        System.out.println(bag.shape);
        System.out.println(bag.size);
        bag.open();
        bag.close();
        bag.write();
        bag.store();
    }
}
/*
BLUE
Sphere
100
The bag has been opened
The bag has been closed
Written using the pen
The item has been stored in the bag
 */
