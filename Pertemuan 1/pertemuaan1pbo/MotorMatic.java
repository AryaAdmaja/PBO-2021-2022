package pertemuaan1pbo;

public class MotorMatic extends Motor {

    private String Tahun;
    private String jenis;

    public void TahunKeluaran(String newValue) {
        Tahun = newValue;
    }
      public void Jenis(String newValue) {
        jenis = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tahun : " + Tahun);
        System.out.println("Jenis : " + jenis);
        
    }
}
