public class Main {
    public static void main(String[] args) {
        MojaKlasa<String> mojaKlasaZeStringami = new MojaKlasa<String>();
        mojaKlasaZeStringami.dodajElement("to jest pierwszy element");
        mojaKlasaZeStringami.dodajElement("to jest drugi element");
        mojaKlasaZeStringami.wypiszElementy();
​
        MojaKlasa<Integer> mojaKlasaZIntegerami = new MojaKlasa<Integer>();
        mojaKlasaZIntegerami.dodajElement(1);
        mojaKlasaZIntegerami.dodajElement(2);
        mojaKlasaZIntegerami.wypiszElementy();
    }
}