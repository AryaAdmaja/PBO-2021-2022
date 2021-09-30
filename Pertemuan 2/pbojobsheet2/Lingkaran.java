package pbojobsheet2;

public class Lingkaran {

    public double phi;
    public double r;

public void hitungLuas(){
    double L = phi * r * r;
    System.out.println("Hasil Luas Lingkaran : " +L);
}
public void hitungKeliling(){
    double K = 2 * phi * r;
    System.out.println("Hasil Keliling Lingkaran : " +K);
}
}
