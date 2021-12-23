package backend;

public class KameraJadul extends Kamera {
    private boolean uselensa;

    public KameraJadul() {
        this.harga = 150000;
    }
    
    
    @Override
    public double biayaPeminjaman(float diskon) {
        double biaya= harga * hari * diskon;
        if(useLensa(uselensa)){
            biaya+=50000;
        }
        return biaya;
    }

    @Override
    public double biayaPeminjaman() {
        double biaya= harga*hari;
        if(useLensa(uselensa)){
            biaya+=50000;
        }
        return biaya;
    }

    @Override
    public boolean useLensa(boolean use) {
        uselensa=use;
        return use;
    }
    
}
