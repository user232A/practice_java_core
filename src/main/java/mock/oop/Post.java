package mock.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Post {

    List<Shipment> shipments;

    public Post() {
        this.shipments = new ArrayList<>();
    }

    void addShipment(Shipment ... shipment){
        shipments.addAll(Arrays.asList(shipment));
    }

    void printInfo(){
        shipments.stream().forEach(s -> System.out.println("Тип: " + s.getClass().getName()));
        shipments.stream().forEach(
                s -> System.out.println("Price: " + s.getClass().getName() + " " + s.calculate()));
    }


}
