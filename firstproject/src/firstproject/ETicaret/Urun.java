package firstproject.ETicaret;
public class Urun {
    public String getKategori() {
        return kategori;
    }

    public double getFiyat() {
        return fiyat;
    }

    public String getIsim() {
        return isim;
    }

    public int getStok() {
        return stok;
    }

    String kategori;
    double fiyat;
    String isim;
    int stok;

    public Urun(String kategori, String isim, double fiyat, int stok){
        this.fiyat = fiyat;
        this.isim = isim;
        this.stok = stok;
        this.kategori = kategori;
    }

    public boolean stoktanDus(){
        if(this.stok > 0) {
            this.stok -= 1;
            return true;
        }
        return false;
    }

    public boolean stokKontrol(){
        return this.stok > 0;
    }

}
