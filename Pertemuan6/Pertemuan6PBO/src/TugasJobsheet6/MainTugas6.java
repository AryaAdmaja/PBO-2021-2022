package TugasJobsheet6;

public class MainTugas6 {

    public static void main(String[] args) {
    Pegawai p1 = new Pegawai ("2001", "Arya", "Balikpapan");
    Pegawai p2 = new Pegawai ("2002", "Alfin", "Papua");
    Dosen d1 = new Dosen ("2003", "Jud", "Malang");
    Dosen d2 = new Dosen ("2004", "Yudas", "Jogja");
    
   d1.setSKS(5);
   d2.setSKS(10);
   
    DaftarGaji dg = new DaftarGaji(5);
    dg.addPegawai(p1);
    dg.addPegawai(p2);
    dg.addPegawai(d1);
    dg.addPegawai(d2);
    dg.printSemuaGaji();
  
    }
}
