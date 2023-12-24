public class Konut extends Daire {
    public Konut(String adres, int Numara) {
        super(adres, Numara);
    }
    @Override
    public void Goster() {
        System.out.println("Konut :");
        super.Goster();
    }
}
