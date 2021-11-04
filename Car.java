
public abstract class Car extends Vehicle{
    public boolean airbag; // 3000TL
    public boolean musicSystem; // 1000TL
    public boolean ABS; // 5000TL
    public boolean sunroof; // 2000TL

    public Car(boolean airbag, boolean musicSystem, boolean ABS, boolean sunroof, String model) {
        super(model);
        this.airbag = airbag;
        this.musicSystem = musicSystem;
        this.ABS = ABS;
        this.sunroof = sunroof;
    }

    @Override
    public String toString() {
        /*if(model.equals("Sity"))
            price = 40000;
        else if(model.equals("Sivic"))
            price = 50000;*/
        String output = model + " with ";
        if(ABS)
            output += "ABS, ";
        if(musicSystem)
            output += "Music System, ";
        if(airbag)
            output += "Air Bag, ";
        if(sunroof)
            output += "Sunroof, ";

        if(output.equals(model + " with "))
            return model + "'s price is " + cost() + " TL";

        return output.substring(0, output.length()-2) + " having a total price of " + cost() + " TL";
    }
}
