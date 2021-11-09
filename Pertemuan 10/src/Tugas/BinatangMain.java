package Tugas;

public class BinatangMain {

    public static void main(String[] args) {
       
        Singa s1 = new Singa ("Singa", 4, "Roarr..Roarr", "Kuning Tua");
        s1.displayBinatang();
        s1.displayMakan();
        s1.displayData();
        
        Keledai k1 = new Keledai ("Keledai", 4, "Nyioo...Nyioo", "Abu-Abu");
        k1.displayBinatang();
        k1.displayMakan();
        k1.displayData();
        
        Gorilla g1 = new Gorilla ("Gorilla", 2 ,"Hoo...Hoo", "Hitam");
        g1.displayBinatang();
        g1.displayMakan();
        g1.displayData();
        
    }
    
}
