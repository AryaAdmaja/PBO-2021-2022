package Abstractclass;

public class Orang {
    private String nama;
    private Hewan hewanPeliharaan;
    
    Orang(String nama){
        this.nama = nama;
    }
    public void peliharaHewan(Hewan peliharaan){
        this.hewanPeliharaan = peliharaan;
    }
    public void ajakPeliharaanJalan(){
        System.out.println("Nama : " + nama);
        System.out.println("Hewan Peliharaanku Bergerak dengan : ");
        this.hewanPeliharaan.bergerak();
        System.out.println("-----------------");
    }
}
