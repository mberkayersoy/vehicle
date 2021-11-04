
public class Test {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Car car = new Sivic(true, true, true, false);
        inventory.add(new InventoryItem(car));
        car = new Sivic(false, false, true, true);
        inventory.add(new InventoryItem(car));
        car = new Sity(false, true, false, true);
        inventory.add(new InventoryItem(car));
        Motorbike motorbike = new Racer(true, true);
        inventory.add(new InventoryItem(motorbike));
        motorbike = new Scooter(false, true);
        inventory.add(new InventoryItem(motorbike));
        System.out.println(inventory);
        /*
        Sivic with ABS, Music System, Air Bag optional having a total price of 59000 TL
        Sivic with ABS, Sunroof having a total price of 57000 TL
        Sity with Music System, Sunroof having a total price of 43000 TL
        Racer with ABS, Seat Heating having a total price of 67000 TL
        Scooter with Seat Heating having a total price of 22000 TL
        TOTAL : 5 Vehicles including 3 Cars and 2 Motorbikes having a total price of 248000 TL*/
    }
}
