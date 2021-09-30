package pertemuaan1pbo;

public class Motor {
    private String merek;
    private int kecepatan;
    private String warna;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    
    public void gantiWarna(String newValue){
        warna = newValue;
    }
    
    public void tambahKecepatan(int increment){
        kecepatan = kecepatan + increment;
    }
    public void rem (int decrement){
        kecepatan = kecepatan - decrement;
    }
    
    public void cetakStatus(){
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Warna: " + warna);

    }
}
    
