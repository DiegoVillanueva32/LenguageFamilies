import Lenguage.*;

public class Main {
    public static void main(String[] args) {
        Lenguage myLang = new Lenguage ("Chibchombiano", 5000000,"south America", "Sujeto - Verbo - Predicado ");
        myLang.getInfo();

        Mayan akatek = new Mayan("Akatek", 45430);
        akatek.getInfo();

        SinoTibetian mandarin = new SinoTibetian("Mandarin", 1140000000);
        mandarin.getInfo();

        SinoTibetian burmese = new SinoTibetian("Burmese", 42900000);
        burmese.getInfo();
    }
}
