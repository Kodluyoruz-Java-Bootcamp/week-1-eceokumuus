package firstproject.ETicaret;
import java.util.ArrayList;
import java.util.List;

public class Musteri {
    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public int getYas() {
        return yas;
    }

    public ArrayList<Siparis> getSiparisler() {
        return siparisler;
    }

    String isim;
    String soyisim;
    int yas;

    ArrayList<Siparis> siparisler;

    public Musteri(String isim, String soyisim, int yas){
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.siparisler = new ArrayList<>();
    }

    public void yeniSiparis(List<Urun> urunler){
        Siparis siparis = new Siparis();

        for(Urun u : urunler){
            siparis.sepeteEkle(u);
        }

        siparis.ode();

        if (siparis.odendi()) {
            this.siparisler.add(siparis);
            System.out.println("Sipariş Oluşturuldu.");
        }
    }
}
