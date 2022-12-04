package firstproject.ETicaret;
import java.util.ArrayList;

public class Siparis {
    public Fatura getFatura() {
        return fatura;
    }

    Fatura fatura;

    public ArrayList<Urun> getSepet() {
        return sepet;
    }

    ArrayList<Urun> sepet;

    public Siparis(){
        this.sepet = new ArrayList<>();
    }

    public void sepeteEkle(Urun urun){
        if(urun.stokKontrol()) {
            sepet.add(urun);
        }
        else {
            System.out.println(urun.isim + " için stok yok!");
        }
    }

    public void ode(){
        float tutar = 0;
        for (Urun u: this.sepet){
            if (! u.stoktanDus()){
                System.out.println(u.isim + " için stok yok!");
                System.out.println("Siparişinizi gözden geçiriniz, ödeme başarısız.");
                return ;
            }else{
                tutar += u.fiyat;
            }
        }

        this.fatura = new Fatura(tutar);
        System.out.println("Odeme Başarılı");
    }

    public boolean odendi(){
        return this.fatura != null;
    }
}
