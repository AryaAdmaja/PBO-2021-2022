package backend;

public abstract class Kamera implements ILensa {

    protected String jenisCamera;
    protected int harga;
    protected int hari;
    protected float diskon;

 
    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public abstract double biayaPeminjaman(float diskon);

    public abstract double biayaPeminjaman();
}
