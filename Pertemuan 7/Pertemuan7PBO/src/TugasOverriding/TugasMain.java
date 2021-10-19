package TugasOverriding;

public class TugasMain {

    public static void main(String[] args) {
     Manusia m = new Manusia ();
     m.makan();
     m.bernafas();  
     m = new Dosen();
     m.makan();
     m = new Mahasiswa();
     m.makan();
     
     Dosen d = new Dosen ();
     d.lembur();
    }
    
}
