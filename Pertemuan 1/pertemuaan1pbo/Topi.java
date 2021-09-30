package pertemuaan1pbo;

public class Topi {
private String warna;
private String merek;

 public void setWarna(String w){
        warna=w;
    }
  public void setMerek(String m){
        merek=m;
    }
  public void cetakInfo(){
        System.out.println("Topi");
        System.out.println("Merek : "+merek);
        System.out.println("Warna : "+warna);
    }
}
