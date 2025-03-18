package Lenguage;

public class Mayan extends Lenguage {

    public Mayan(String name, int numSpeakers) {
        super (name, numSpeakers, "Central America", "verbo - sujeto");
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Fun fact: " + this.name + " is an ergativ language.");
    }
}
