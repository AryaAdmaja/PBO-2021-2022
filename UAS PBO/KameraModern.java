package backend;

public class KameraModern extends Kamera {

    private boolean uselensa;

    public KameraModern() {
        this.harga = 250000;
    }

    @Override
    public double biayaPeminjaman(float diskon) {
        double biaya = harga * hari * diskon;
        if (useLensa(uselensa)) {
            biaya += 70000;
        }
        return biaya;
    }

    @Override
    public double biayaPeminjaman() {
        double biaya = harga * hari;
        if (useLensa(uselensa)) {
            biaya += 70000;
        }
        return biaya;
    }

    @Override
    public boolean useLensa(boolean use) {
        uselensa = use;
        return use;
    }

}
