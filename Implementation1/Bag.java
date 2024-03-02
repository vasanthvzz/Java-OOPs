package Implementation1;

class Bag extends Box{
    int size = 100;
    String color = "BLUE";
    String shape = "Sphere";
    STATE state = STATE.CLOSE;

    public void open(){
        System.out.println("The bag has been opened");
    }

    public void close(){
        System.out.println("The bag has been closed"); 
    }

    void store(){
        System.out.println("The item has been stored in the bag");;
    }

    void cleaning(){
        System.out.println("The bag has been cleaned");
    }

    void isTheft(){
        System.out.println("The bag is safe");
    }

    public static void main(String[] args) {
        
        Bag b = new Bag();
        b.display();
    
    }

    void display(){
        open();
    }

}
