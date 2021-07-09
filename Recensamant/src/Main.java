import java.util.*;

public class Main {

    public static void main(String ...args) {

        Persoana ion = new Persoana("Ion", "Ionescu", "6000123");
        Persoana popescu = new Persoana("Ion", "Popescu", "698433");
        Persoana maria = new Persoana("Maria", "Mihaiescu", "1353256");
        Persoana ana = new Persoana("Ana", "Ionescu", "1341213");

        ion.setAdresa(new Adresa("Strada 12", 2));
        popescu.setAdresa(new Adresa("Strada 10", 3));
        maria.setAdresa(new Adresa("Strada 11", 1));
        ana.setAdresa(new Adresa("Strada 12", 2));

        Map<Adresa, ArrayList<Persoana>> map = new HashMap<Adresa, ArrayList<Persoana>>();
        List<Persoana> persoane = new ArrayList<Persoana>();
        persoane.add(ion);
        persoane.add(popescu);
        persoane.add(maria);
        persoane.add(ana);

//        map.put(ion.getAdresa(), );
    }
}
