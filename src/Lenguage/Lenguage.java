package Lenguage;

public class Lenguage {
    protected String name ;
    protected int numSpeakers;
    protected String regionSpoken;
    protected String wordOrder;

    public Lenguage (String name,int numSpeakers,String regionSpoken,String wordOrder ){
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionSpoken = regionSpoken;
        this.wordOrder = wordOrder;
    }
    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in "+ this.regionSpoken + ".");
        System.out.println("the language follows the word order by " + this.wordOrder + ".");
    }
}
