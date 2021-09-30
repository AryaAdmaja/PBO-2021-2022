package pertemuaan1pbo;

public class MotorKopling extends Motor {
    private String Harga;
    private String jenis;
public void setHarga(String newValue){
   Harga = newValue;
}
 public void Jenis(String newValue) {
        jenis = newValue;
    }
public void cetakStatus(){
    super.cetakStatus();
    System.out.println("Harga : "+ Harga);
    System.out.println("Jenis : "+ jenis);
}    
}
