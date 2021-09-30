package pbojobsheet2;

public class DemoBarang {

    public static void main(String[] args) {
    Barang b = new Barang();
        System.out.println("----- Toko Barang Arya -----");
    b.kode = "S123";
    b.namaBarang = "Sepatu Gucci";
    b.hargaDasar = 1000000;
    b.diskon = 0.10f;
    b.tampilData();
    }    
}
