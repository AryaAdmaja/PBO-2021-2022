package TugasJobsheet6;

public class DaftarGaji {
 public Pegawai [] listPegawai;
 
 public DaftarGaji(int jumlah) {
        this.listPegawai = new Pegawai[jumlah];
        for (int i = 0; i < jumlah; i++) {
            this.listPegawai[i] = new Pegawai(null, null, null);
        }
    }
 
 public void addPegawai(Pegawai listPegawai){
    for (int i=0; i<this.listPegawai.length; i++){
        if(this.listPegawai[i].getNama() == null){
            this.listPegawai[i] = listPegawai;
            break;
        }
    } 
 }
 public void printSemuaGaji(){
     for (Pegawai listPegawai1 : this.listPegawai) {
         if (listPegawai1.getNama() != null) {
             System.out.println("Nama     : " + listPegawai1.getNama());
             System.out.println("Gaji     : " + listPegawai1.getGaji());
         }
     } 
 }
}
