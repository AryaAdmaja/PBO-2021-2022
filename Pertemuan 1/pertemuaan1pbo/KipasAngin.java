package pertemuaan1pbo;

public class KipasAngin {

    private String warna;
    private String merek;

    public void setMerk(String m) {
        merek = m;
    }

    public void setWarna(String w) {
        warna = w;
    }

    public void cetakInfo() {
        System.out.println("Kipas Angin");
        System.out.println("Merk : " + merek);
        System.out.println("Warna : " + warna);
    }
}

