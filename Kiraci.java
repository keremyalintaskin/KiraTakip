public class Kiraci {
    String ad;
    String soyad;
    EvSahibi evSahibi;
    public Kiraci(String ad, String soyad, EvSahibi evSahibi) {
        this.ad = ad;
        this.soyad = soyad;
        this.evSahibi = evSahibi;
    }

    public void Goster() {
        System.out.println("Kiracı Bilgi:");
        System.out.println("Adı Soyad: " + ad + " " + soyad);

        evSahibi.Goster();
    }
}
