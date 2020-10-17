
public class Adresa {
    private final String strada;
    private final String numar;
    private final String oras;
    private final Tara tara;

    public Adresa(String strada, String numar, String oras, Tara tara){
        this.strada = strada;
        this.numar = numar;
        this.oras = oras;
        this.tara = tara;
    }

    public Tara getTara() {
        return this.tara;
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "strada='" + strada + '\'' +
                ", numar='" + numar + '\'' +
                ", oras='" + oras + '\'' +
                '}';
    }
}
