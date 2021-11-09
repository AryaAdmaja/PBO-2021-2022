package Interfaceclass;

public class MahasiswaCumlaude {

    public static void main(String[] args) {
       Direktur DirekturPolinema = new Direktur();
       
       Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
       Sarjana sarjanaCumlaude = new Sarjana("Dini");
       PascaSarjana masterCumlaude = new PascaSarjana("Elok");
       
      // DirekturPolinema.beriSertifikatCumlaude(sarjanaCumlaude);
      // DirekturPolinema.beriSertifikatCumlaude(masterCumlaude);
       
       DirekturPolinema.beriSertifikatMawapres(masterCumlaude);
       DirekturPolinema.beriSertifikatMawapres(sarjanaCumlaude);
    }
    
}
