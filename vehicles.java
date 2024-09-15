public class vehicles {   // Superclass
    String name;
    int price;

    void startengine() {
        System.out.println("Engine started");
    }

    void stopengine() {
        System.out.println("Engine stopped");
    }

    
    public class truck extends vehicles {
        
    }

    
    public static void main(String[] args) {
        vehicles outerInstance = new vehicles();  
        truck t1 = outerInstance.new truck();     

        t1.name = "Tata";
        t1.price = 2344444;
        t1.startengine();
        t1.stopengine();
        System.out.println("Truck Name: " + t1.name);
        System.out.println("Truck Price: " + t1.price);
    }
}
