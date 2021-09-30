package Tugas;

public class MainTugas {

    public static void main(String[] args) {

    Siswa s1 = new Siswa ("Ikal", "2A","2041720101","Balikpapan NO 20");
    Sekolah se1 = new Sekolah ("Tadika Mesra","A");
    Pelajaran p1 = new Pelajaran ("Matematika",85);
    WaliKelas w1 = new WaliKelas ("Bu Sri",20001);
        w1.setPelajaran(p1);
        System.out.println(s1.info());
        System.out.println(se1.info());
        System.out.println(w1.info());
        

    Siswa s2 = new Siswa ("Lintang", "2B","2041720102","Malang NO 10");
    Sekolah se2 = new Sekolah ("Tadika Mesra","A");
    Pelajaran p2 = new Pelajaran ("Bahasa Indonesia",80);
    WaliKelas w2 = new WaliKelas ("Bu Ningsih",20002);   
        w2.setPelajaran(p2);
        System.out.println(s2.info());
        System.out.println(se2.info());
        System.out.println(w2.info()); 
        
        
    Siswa s3 = new Siswa ("Sahara", "2C","2041720103","Jogja NO 30");
    Sekolah se3 = new Sekolah ("Tadika Mesra","A");
    Pelajaran p3 = new Pelajaran ("Kimia",90);
    WaliKelas w3 = new WaliKelas ("Bu Budi",20003);   
        w2.setPelajaran(p2);
        System.out.println(s2.info());
        System.out.println(se2.info());
        System.out.println(w2.info()); 
    }
    
}
