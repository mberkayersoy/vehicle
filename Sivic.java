
public class Sivic extends Car{

    public Sivic(boolean airbag, boolean musicSystem, boolean ABS, boolean sunroof) {
        super(airbag, musicSystem, ABS, sunroof, "Sivic");
    }

    @Override
    public int cost() {
        int price = 50000;
        if (airbag)
            price += 3000;
        if (ABS)
            price += 5000;
        if (musicSystem)
            price += 1000;
        if (sunroof)
            price += 2000;

        return price;
    }
    /*@Override
    public String toString() {
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
    }*/

}
