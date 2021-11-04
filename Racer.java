
public class Racer extends Motorbike{

    public Racer(boolean ABS, boolean seatHEating) {
        super(ABS, seatHEating, "Racer");
    }

    @Override
    public int cost() {
        int price = 60000;
        if (ABS)
            price += 5000;
        if (seatHEating)
            price += 2000;

        return price;
    }

    /*@Override
    public String toString() {
        String output = model + " with ";
        if(ABS)
            output += "ABS, ";
        if(seatHEating)
            output += "Seat Heating, ";

        if(output.equals(model + " with "))
            return model + "'s price is " + cost() + " TL";

        return output.substring(0, output.length()-2) + " having a total price of " + cost() + " TL";
    }  */
}
