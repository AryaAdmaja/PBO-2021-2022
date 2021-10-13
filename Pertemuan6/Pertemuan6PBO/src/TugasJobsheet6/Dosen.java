package TugasJobsheet6;

public class Dosen extends Pegawai {

    public int jumlahSKS;
    public int TARIF_SKS = 500000;
    
   public Dosen (String nip, String nama, String alamat){
       super(nip, nama, alamat);
   }
   
   public void setSKS (int jumlahSKS){
       this.jumlahSKS = jumlahSKS;
   }
   
   @Override
   public int getGaji(){
     int gaji = jumlahSKS * TARIF_SKS;
        return gaji;
  }
}
