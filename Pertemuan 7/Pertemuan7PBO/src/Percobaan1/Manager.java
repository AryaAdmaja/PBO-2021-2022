package Percobaan1;

public class Manager extends Karyawan{
    private double tunjangan;
    private String bagian;
    private Staff st[];

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }
    public void setStaff(Staff[] st) {
        this.st = st;
    }
    
    public void viewStaf(){
        int i;
        System.out.println("---------------------");
        for(i=0; i<st.length; i++){
            st[i].lihatInfo();
        }
        System.out.println("---------------------");
    }
    public void lihatInfo(){
        System.out.println("Manager: " + this.getBagian());
        System.out.println("NIP: " +super.getNip());
        System.out.println("Nama: " + super.getNama());
        System.out.println("Golongan: " + super.getGolongan());
        System.out.printf("Tunjangan: %.0f\n " , this.getTunjangan());
        System.out.printf("Gaji: %.0f\n" , this.getGaji());
        System.out.println("Bagian: " + this.getBagian());
        this.viewStaf();
    }
    
    @Override
    public double getGaji(){
        return super.getGaji() + tunjangan;
    }
}
