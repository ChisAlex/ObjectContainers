import java.util.List;

public class Hobby {

    String name;
    int frequency;
    List<Adresa> addresses;

    public Hobby(String name, int frequency, List<Adresa> addresses){
        this.name = name;
        this.frequency = frequency;
        this.addresses = addresses;
    }


    @Override
    public String toString() {
        return "Hobby{" +
                "hobby='" +  + '\'' +
                ", frequency=" + frequency +
                ", addresses=" + addresses +
                '}';
    }
}
