package TugasJobsheet6;
public class Pegawai {
    public String nip, nama, alamat;
   
    
    public Pegawai(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public String getNama() {
        return nama;
    }
    
   public int getGaji(){
      int gaji = 2000000;
      return gaji;
    }
}
