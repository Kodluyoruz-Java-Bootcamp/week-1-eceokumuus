package firstproject.ETicaret;
import java.util.ArrayList;

public class ETicaretSistemi {
    public ArrayList<Musteri> getMusteriListesi() {
        return musteriListesi;
    }

    public ArrayList<Urun> getUrunListesi() {
        return urunListesi;
    }

    ArrayList<Musteri> musteriListesi;
    ArrayList<Urun> urunListesi;

    public ETicaretSistemi(){
        musteriListesi = new ArrayList<>();
        urunListesi = new ArrayList<>();
    }

    public void yeniMusteri(Musteri m){
        this.musteriListesi.add(m);
    }

    public void yeniUrun(Urun u){
        this.urunListesi.add(u);
    }

    public int musteriSayisi(){
        return this.musteriListesi.size();
    }

}
