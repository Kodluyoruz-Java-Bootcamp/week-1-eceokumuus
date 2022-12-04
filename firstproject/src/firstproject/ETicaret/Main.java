package firstproject.ETicaret;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static ETicaretSistemi sistem;
    public static void main(String[] args) {
        sistem = new ETicaretSistemi();
        Musteri m1 = new Musteri("Cem", "Can", 26);
        sistem.yeniMusteri(m1);
        Musteri m2 = new Musteri("Cem", "Dırman", 29);
        sistem.yeniMusteri(m2);
        Musteri m3 = new Musteri("Ali", "Veli", 29);
        sistem.yeniMusteri(m3);
        Musteri m4 = new Musteri("Cem", "Veli", 35);
        sistem.yeniMusteri(m4);
        Musteri m5 = new Musteri("Hakkı", "Dırman", 19);
        sistem.yeniMusteri(m5);

        Urun u1 = new Urun("Telefon", "Iphone", 49999.90, 10);
        sistem.yeniUrun(u1);
        Urun u2 = new Urun("Telefon", "Galaxy S22", 21999.99, 10);
        sistem.yeniUrun(u2);
        Urun u3 = new Urun("Telefon", "Redmi Note 10", 9999.99, 10);
        sistem.yeniUrun(u3);
        Urun u4 = new Urun("Telefon", "3310", 999.99, 10);
        sistem.yeniUrun(u4);


        m1.yeniSiparis(Arrays.asList(u1, u2, u3));
        m2.yeniSiparis(Arrays.asList(u4));
        m3.yeniSiparis(Arrays.asList(u3,u4));


        System.out.println(sistem.musteriSayisi());

        System.out.println(siparisSayisiCem());
        System.out.println(toplamTutarCem3025());

        System.out.println(fatura1500Uzeri());

    }

    public static int siparisSayisiCem(){
        int siparisSayisi = 0;
        for (Musteri m : sistem.getMusteriListesi()){
            if(m.getIsim().equals("Cem")){
                for (Siparis s : m.getSiparisler()){
                    if(s.odendi()) {
                        siparisSayisi += s.getSepet().size();
                    }
                }
            }
        }
        return siparisSayisi;
    }

    public static double toplamTutarCem3025(){
        double toplamTutar = 0;
        for (Musteri m : sistem.getMusteriListesi()){
            if(m.getIsim().equals("Cem") && m.getYas()<30 && m.getYas()>25){
                for (Siparis s : m.getSiparisler()){
                    if(s.odendi()) {
                        toplamTutar += s.getFatura().getToplamTutar();
                    }
                }
            }
        }
        return toplamTutar;
    }

    public static List<Fatura> fatura1500Uzeri(){
        List<Fatura> faturaList = new ArrayList<>();
        for (Musteri m : sistem.getMusteriListesi()){
            for (Siparis s : m.getSiparisler()){
                if(s.odendi() && s.getFatura().toplamTutar > 1500) {
                    faturaList.add(s.getFatura());
                }
            }
        }
        return faturaList;
    }
}