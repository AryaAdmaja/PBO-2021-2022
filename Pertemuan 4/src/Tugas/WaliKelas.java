package Tugas;

public class WaliKelas {
private String namaWalikelas;
private int nip;
private Pelajaran Pelajaran ;

    public WaliKelas(String namaWalikelas, int nip) {
        this.namaWalikelas = namaWalikelas;
        this.nip = nip;
    }

    public String getNamaWalikelas() {
        return namaWalikelas;
    }

    public void setNamaWalikelas(String namaWalikelas) {
        this.namaWalikelas = namaWalikelas;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }
    public Pelajaran getPelajaran() {
        return Pelajaran;
    }

    public void setPelajaran(Pelajaran Pelajaran) {
        this.Pelajaran = Pelajaran;
    }
    public String info(){
    String info = "";
    System.out.println("===== Info WaliKelas =====");
    info += "Nama Guru      : " + this.namaWalikelas + "\n";
    info += "Mata Pelajaran : " + this.Pelajaran.getMataPelajaran() + "\n";    
    info += "NIP            : " + this.nip + "\n\n\n\n";
    return info;    
    }

}
