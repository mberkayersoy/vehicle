
public abstract class Motorbike extends Vehicle{
    public boolean ABS; // 5000TL
    public boolean seatHEating; // 2000TL

    public Motorbike(boolean ABS, boolean seatHEating, String model) {
        super(model);
        this.ABS = ABS;
        this.seatHEating = seatHEating;
    }

    @Override
    public String toString() {
        /*if(model.equals("Scooter"))
            price = 20000;
        else if(model.equals("Racer"))
            price = 60000;*/
        String output = model + " with ";
        if(ABS)
            output += "ABS, ";
        if(seatHEating)
            output += "Seat Heating, ";

        if(output.equals(model + " with "))
            return model + "'s price is " + cost() + " TL";

        return output.substring(0, output.length()-2) + " having a total price of " + cost() + " TL";
    }

}

    