package pbojobsheet2;

public class DemoPeminjaman {

    public static void main(String[] args) {
     Peminjaman p1  = new Peminjaman();
     p1.id = 2041720104;
     p1.namaMember = "Arya Admaja";
     p1.namaGame = "GTA V";
     p1.sewa = 3;
     p1.harga= 5000;
     p1.tampilBarang();
     p1.tampilHarga();
    }
}
