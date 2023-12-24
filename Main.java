import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // Bir bina örneği oluşturuluyor
        Bina binam = new Bina("Örnek Konutlari", 17);

        // İki ev sahibi örneği oluşturuluyor
        EvSahibi sahip1 = new EvSahibi("Ad1", "Soyad1");
        EvSahibi sahip2 = new EvSahibi("Ad2", "Soyad2");

        // İki daire örneği oluşturuluyor
        Daire daire1 = new Daire("Yesil Konutları daire ", 5);
        Daire daire2 = new Daire("Örnek Konutlari kapi girisi", 21);

        // Ev sahiplerine daireler ekleniyor
        sahip1.daireEkle(daire1);
        sahip2.daireEkle(daire2);

        // Bina sınıfına daireler ekleniyor
        binam.Ekle(daire1);
        binam.Ekle(daire2);

        // Ev sahiplerinin bilgileri gösteriliyor
        sahip1.Goster();
        sahip2.Goster();
        System.out.println("\n");

        // Kiracı örnekleri oluşturuluyor ve ev sahipleri ile ilişkilendiriliyor
        Kiraci kiraci1 = new Kiraci("Ad1", "Soyad1", sahip1);
        Kiraci kiraci2 = new Kiraci("Ad2", "Soyad2", sahip2);

        // Kiracı bilgileri gösteriliyor
        kiraci1.Goster();
        kiraci2.Goster();
    }
}
