package Tugas456;

public class Anggota {
     private String nama; 
     private String noKTP;
     private int limitPinjaman;
     private int jumlahPinjaman;

    Anggota(String noKTP, String nama, int limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorKTP() {
        return noKTP;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int pinjam(int jumlahPinjam) {
        jumlahPinjaman += jumlahPinjam;
        if (jumlahPinjaman > getLimitPinjaman()) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit!");
            jumlahPinjaman -= jumlahPinjam;
        }
        return jumlahPinjaman;
    }

    public int angsur(int jumlahAngsur) {
       if(jumlahAngsur<(0.1*jumlahPinjaman)){
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            jumlahPinjaman+=jumlahAngsur;
        }
         jumlahPinjaman -= jumlahAngsur;
         return jumlahPinjaman;
    }
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }
}