
package frontend;

import backend.Anggota;

public class TestAnggota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Anggota kat1 = new Anggota("Alfinza Sanjaya", "Singosari", "082257181297");
        Anggota kat2 = new Anggota("Jud Amal", "Dau", "082257181296");
        Anggota kat3 = new Anggota("Muhammad Reza", "Wajak", "082257181295");
        Anggota kat4 = new Anggota("Dwihardik Kusuma", "Suhat", "082257181294");

        // test insert
        kat1.save();
        kat2.save();
        kat3.save();
        kat4.save();

        // test update
        kat3.setAlamat("Politeknik Negeri Malang");
        kat3.save();

        // test delete
        kat4.delete();

        // test select all
        for (Anggota k : new Anggota().getAll()) {
            System.out.println("Nama: " + k.getNama() + ", Alamat: " + k.getAlamat() + ", Telepon: " + k.getTelepon());
        }

        // test search
        for (Anggota k : new Anggota().search("ilmiah")) {
            System.out.println("Nama: " + k.getNama() + ", Alamat: " + k.getAlamat() + ", Telepon: " + k.getTelepon());
        }
    }
}
