
public class InventoryItem extends Inventory{

    private final Vehicle item;
    private static int carAmount;
    private static int motorbikeAmount;

    public InventoryItem(Vehicle item) {
        this.item = item;

        /*
        if(item.getClass() == Sity.class || item.getClass() == Sivic.class)
            carAmount++;
        else if(item.getClass() == Scooter.class || item.getClass() == Racer.class)
            motorbikeAmount++;
        */
        if(item instanceof Sity || item instanceof Sivic)
            carAmount++;
        else if(item instanceof Scooter || item instanceof Racer)
            motorbikeAmount++;

    }

    public static int getcarAmount(){
        return carAmount;
    }
    public static int getmotorbikeAmount(){
        return motorbikeAmount;
    }
    public static int getAmount(){
        return carAmount + motorbikeAmount;
    }

    public int cost(){
        return item.cost();
    }
    @Override
    public String toString(){
        return item.toString();
    }

}
    
   