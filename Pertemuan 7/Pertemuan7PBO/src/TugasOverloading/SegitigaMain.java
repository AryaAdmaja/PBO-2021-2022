package TugasOverloading;

public class SegitigaMain {

    public static void main(String[] args) {
   Segitiga s = new Segitiga();
        System.out.println("Sudut Pertama : " + s.totalSudut(5));
        System.out.println("Sudut Kedua   : " + s.totalSudut(5, 10));
        System.out.println("Keliling Pertama : " + s.keliling(5, 10, 15));
        System.out.println("Keliling Kedua : " + s.keliling(5,12));
    }
    
}
