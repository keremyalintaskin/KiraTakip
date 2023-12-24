public class Daire implements Comparable<Daire> {

    String adres;
    int Numara;

    public Daire(String adres, int Numara) {
        this.adres = adres;
        this.Numara = Numara;
    }

    public void Goster() {
        System.out.println("Daire: " + Numara);
        System.out.println("Adres: " + adres);
    }

    @Override
    public int compareTo(Daire digerDaire) {
        return Integer.compare(this.Numara, digerDaire.Numara);
    }
}
