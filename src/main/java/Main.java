

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Persoana> persoane = new TreeSet<Persoana>();

        Persoana p1 = new Persoana("Mos Craciun", 100);
        Persoana p2 = new Persoana("Mos Nicolae", 90);
        Persoana p3 = new Persoana("Razvan", 80);
        Persoana p4 = new Persoana("Makelele", 50);

        persoane.add(p1);
        persoane.add(p2);
        persoane.add(p3);
        persoane.add(p4);

        for (Persoana persoana : persoane) {
            System.out.println(persoana);
        }

        List<Hobby> hobbiesP1 = new ArrayList<Hobby>();
        List<Hobby> hobbiesP4 = new ArrayList<Hobby>();
        List<Adresa> locatiiPescuit = new ArrayList<Adresa>();


        locatiiPescuit.add(new Adresa("Mocioni", "22", "Timisoara", Tara.ROMANIA));
        locatiiPescuit.add(new Adresa("Pocioni", "23", "Timisoara", Tara.ITALIA));
        locatiiPescuit.add(new Adresa("Rocioni", "24", "Timisoara", Tara.ROMANIA));

        hobbiesP1.add(new Hobby("pescuit", 3, locatiiPescuit));


        List<Adresa> locatiiVanatoare = new ArrayList<Adresa>();
        locatiiVanatoare.add(new Adresa("Parvan", "100", "Brasov", Tara.ROMANIA));
        locatiiVanatoare.add(new Adresa("Carvan", "101D", "Brasov", Tara.ROMANIA));
        locatiiVanatoare.add(new Adresa("Darvan", "102", "Brasov", Tara.ROMANIA));

        hobbiesP1.add(new Hobby("vanatoare", 10, locatiiVanatoare));
        hobbiesP4.add(new Hobby("vanatoare", 7, locatiiVanatoare));

        Map<Persoana, List<Hobby>> allHobbies = new HashMap<Persoana, List<Hobby>>();

        allHobbies.put(p1, hobbiesP1);
        allHobbies.put(p4, hobbiesP4);
        System.out.println("--------");
        for(Map.Entry<Persoana, List<Hobby>> entry : allHobbies.entrySet()) {
            Persoana p = entry.getKey();
            List<Hobby> hobbies = entry.getValue();
            System.out.println(p.name + " merge la: ");
            for (Hobby hobby : hobbies) { ;
                Set<Tara> tariUnice = new HashSet<>();
                for(Adresa adresa : hobby.addresses) {
                    tariUnice.add(adresa.getTara());
                }
                System.out.println(" * " + hobby.name + " in " + tariUnice);
            }

            System.out.println("\n=======");
        }
    }
}
