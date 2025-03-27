package Lenguage;

public class SinoTibetian extends Lenguage{
    public SinoTibetian(String name, int numSpeakers) {
        super(name, numSpeakers, "Asia", "subject - object - verb");
        if (this.name.equals("Chinese")){
            this.wordOrder = "subject - object";
        }
    }
}
