package Tugas;

public class Pelajaran {
 private String mataPelajaran;
 private int KKM;

    public Pelajaran(String mataPelajaran, int KKM) {
        this.mataPelajaran = mataPelajaran;
        this.KKM = KKM;
    }

    public String getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }

    public int getKKM() {
        return KKM;
    }

    public void setKKM(int KKM) {
        this.KKM = KKM;
    }
    public String info(){
    String info = "";
    info += "Mata Pelajaran : " + this.mataPelajaran + "\n";
    info += "Nilai KKM      : " + this.KKM + "\n";
    return info;    
    }
}
