package Tugas;

public class Keledai extends Binatang implements IHerbivora {
    private String suara;
    private String warnaBulu;
    
    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Binatangnya adalah " + super.getNama());
    }

    @Override
    public void displayMakan() {
        System.out.println("Rumput dimakan oleh " + super.getNama());
    }
    
    public void displayData(){
        System.out.println("Nama Binatang : " +super.getNama());
        System.out.println("Mempunya Jumlah Kaki : " + super.getKaki());
        System.out.println("Bunyi Suara : " + this.suara);
        System.out.println("Warna Bulu : " + this.warnaBulu);
        System.out.println("=======================================");
    }
    
}
