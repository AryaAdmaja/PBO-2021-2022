package Tugas;

public class Siswa {
 private String namaSiswa;
 private String kelas;
 private String nim;
 private String alamat;

    public Siswa(String namaSiswa, String kelas, String nim, String alamat) {
        this.namaSiswa = namaSiswa;
        this.kelas = kelas;
        this.nim = nim;
        this.alamat = alamat;
    }


    public String getNamaSiswa() {
        return namaSiswa;
    }

    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
       public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    public String info(){
    String info = "";
    System.out.println("===== Info Siswa =====");
    info += "Nama Siswa : " + this.namaSiswa + "\n";
    info += "NIM        : " + this.nim + "\n";
    info += "Kelas      : " + this.kelas + "\n";
    info += "Alamat     : " + this.alamat + "\n";
    return info;    
    }
}
