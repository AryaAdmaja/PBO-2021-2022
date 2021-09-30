package pbojobsheet2;

public class Barang {
public String kode;
public String namaBarang;
public int hargaDasar;
public float diskon;

public int hitungHargaJual(){
    int hargaJual = (int) (hargaDasar - (diskon * hargaDasar));
    return hargaJual;
}

public void tampilData(){
    System.out.println("Kode         : " + kode);
    System.out.println("Nama Barang  : " + namaBarang);
    System.out.println("Harga Barang : " + hargaDasar);
    System.out.println("Diskon       : " + (int)(diskon * 100) + "%");
    System.out.println("Harga Jual   : " + hitungHargaJual());
}
}

