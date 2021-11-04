import java.util.ArrayList;

public class Inventory {
    private final ArrayList<InventoryItem> inventoryList;

    public Inventory(){
        inventoryList = new ArrayList<InventoryItem>();
    }
    public void add(InventoryItem item){
        this.inventoryList.add(item);
    }

    @Override
    public String toString(){
        String List = "";
        int numberofcar = InventoryItem.getcarAmount();
        int numberofmotorbike = InventoryItem.getmotorbikeAmount();
        for(int i = 0; i < inventoryList.size(); i++){
            List += (inventoryList.get(i).toString() + "\n");
        }

        if (numberofcar != 0 && numberofmotorbike != 0)
            return List + "TOTAL : " + InventoryItem.getAmount() +  " Vehicles " + "including " + numberofcar + " Cars and " + numberofmotorbike + " Motorbikes" +" having a total price of " + totalCost() + " TL";
        else if(numberofcar != 0 && numberofmotorbike == 0)
            return List + "TOTAL : " + InventoryItem.getAmount() + " Cars having a total price of " + totalCost() + " TL";
        else if(numberofcar == 0 && numberofmotorbike != 0)
            return List + "TOTAL : " + InventoryItem.getAmount() + " Motorbikes having a total price of " + totalCost() + " TL";
        return "1";
    }
    public int totalCost(){
        int totalcost = 0;

        Iterable<InventoryItem> items = inventoryList;
        for(InventoryItem element : items){

            totalcost += element.cost();
        }
        return totalcost;
    }
}
