package Tugas;
public class Sekolah {
    private String namaSekolah;
    private String akreditasi;
    
    Sekolah(){
        
    }

    public Sekolah(String namaSekolah, String akreditasi) {
        this.namaSekolah = namaSekolah;
        this.akreditasi = akreditasi;
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }

    public void setNamaSekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public String getAkreditasi() {
        return akreditasi;
    }

    public void setAkreditasi(String akreditasi) {
        this.akreditasi = akreditasi;
    }
    public String info(){
    String info = "";
    System.out.println("===== Info Sekolah =====");    
    info += "Nama Sekolah : " + this.namaSekolah + "\n";
    info += "Akreditasi   : " + this.akreditasi + "\n";
    return info;    
    }
}
