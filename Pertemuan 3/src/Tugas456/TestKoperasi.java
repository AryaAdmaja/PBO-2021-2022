package Tugas456;

import java.util.Scanner;

public class TestKoperasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        System.out.println("Masukkan Jumlah Pinjaman : ");
        donny.pinjam(sc.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("Masukkan Jumlah Pinjaman : ");
        donny.pinjam(sc.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("Masukkan Jumlah Angsuran : ");
        donny.angsur(sc.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("Masukkan Jumlah Angsuran : ");
        donny.angsur(sc.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }

}
