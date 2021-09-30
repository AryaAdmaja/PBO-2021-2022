package pertemuaan1pbo;

public class DemoMain {

    public static void main(String[] args) {
    Topi t = new Topi();
    KipasAngin k = new KipasAngin();
    MotorKopling m1 = new MotorKopling();
    MotorMatic m2 = new MotorMatic();
   
    t.setMerek("Ripcurl");
    t.setWarna("Hitam");
    t.cetakInfo();
    System.out.println();
    k.setMerk("Panasonic");
    k.setWarna("Putih");
    k.cetakInfo();
    System.out.println();
    m1.setMerek("Ninja Kawasaki");
    m1.Jenis("Motor Kopling");
    m1.setHarga("100000000");
    m1.gantiWarna("Hijau");
    m1.tambahKecepatan(250);
    m1.rem(50);
    m1.cetakStatus();
    System.out.println();
    m2.setMerek("Vario");
    m2.Jenis("Motor Matic");
    m2.gantiWarna("Hitam");
    m2.TahunKeluaran("2020");
    m2.tambahKecepatan(150);
    m2.rem(30);
    m2.cetakStatus();
   
    }
}
