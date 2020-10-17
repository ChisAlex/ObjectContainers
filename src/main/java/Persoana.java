public class Persoana implements Comparable<Persoana> {

    String name;
    int age;

    public Persoana(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + '\'' + ", age=" + age;

    }

    public int compareTo(Persoana other) {
        if (this.age > other.age) {
            return 1;
        } else if(this.age == other.age) {
            return 0;
        } else {
            return -1;
        }
    }
}
