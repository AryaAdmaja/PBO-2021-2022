package Abstractclass;
public class Program {

    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
            Ikan lumba = new Ikan();
            
            Orang ani = new Orang("Ani");
            Orang budi = new Orang("Budi");
            
            ani.peliharaHewan(kucingKampung);
            budi.peliharaHewan(lumba);
            
            ani.ajakPeliharaanJalan();
            budi.ajakPeliharaanJalan();
        }
    }