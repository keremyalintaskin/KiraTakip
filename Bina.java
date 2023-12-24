import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Bina {
    String adres;
    int kat;
    List<Daire> daireler;

    public void Ekle(Daire d) {
        daireler.add(d);
        Collections.sort(daireler);
    }

    public Bina(String adres, int kat) {
        this.adres = adres;
        this.kat = kat;
        this.daireler = new ArrayList<>();
    }

    public void Goster() {
        System.out.println("Adres: " + adres);
        System.out.println("Kat Sayı: " + kat);
        for (Daire d : daireler) {
            d.Goster();
            System.out.println("\n");
        }
    }
}
