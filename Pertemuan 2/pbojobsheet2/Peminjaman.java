package pbojobsheet2;

public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int sewa;
    
    public void tampilBarang(){
        System.out.println("------Tampil Data Peminjaman-----");
        System.out.println(" ID          : " +id);
        System.out.println(" Nama Member : " +namaMember);
        System.out.println(" Nama Game   : " +namaGame);
        System.out.println(" Lama Sewa   : " +sewa + " Hari");
        System.out.println(" Harga       : " +harga);
    }
    public void tampilHarga(){
      int totalHarga = harga * sewa;
       System.out.println("------Tampil Harga Peminjaman-----");
       System.out.println(" Total Harga : " + totalHarga);
    }
}
