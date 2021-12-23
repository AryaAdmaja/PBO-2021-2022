package backend;
import java.util.ArrayList;
import java.sql.*;

public class Peminjaman {
    private int idpeminjaman;
    private User user = new User();
    private Camera camera = new Camera();
    private String tanggalpinjam;
    private int lamapinjam,totalharga;
    

    public Peminjaman() {
    }

    public Peminjaman(User user,Camera camera,String tanggalpinjam, int lamapinjam) {
        this.user = user;
        this.camera = camera;
        this.tanggalpinjam = tanggalpinjam;
        this.lamapinjam = lamapinjam;
    }

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTanggalpinjam() {
        return tanggalpinjam;
    }

    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public int getLamapinjam() {
        return lamapinjam;
    }

    public void setLamapinjam(int lamapinjam) {
        this.lamapinjam = lamapinjam;
    }

    public int getTotalharga() {
        return totalharga;
    }

    public void setTotalharga(int totalharga) {
        this.totalharga = totalharga;
    }
    
    
    public Peminjaman getById(int id){
        Peminjaman pmj=new Peminjaman();
        ResultSet rs=DBHelper.selectQuery("SELECT "
                +"  p.idpeminjaman as idpeminjaman, "
                +"  a.iduser as iduser, "
                +"  a.nama as nama, "
                +"  a.alamat as alamat, "
                +"  a.telepon as telepon, "
                +"  b.idcamera as idcamera, "
                +"  b.idkategori as idkategori, "
                +"  b.merk as merk, "
                +"  b.type as type, "
                +"  b.tahunrilis as tahunrilis, "
                +"  p.tanggalpinjam as tanggalpinjam, "
                +"  p.lamapinjam as lamapinjam, "
                +"  p.totalharga as totalharga "               
                +"  FROM peminjaman p "
                +"  LEFT JOIN user a on p.iduser=a.iduser"
                +"  LEFT JOIN camera b on p.idcamera=b.idcamera "
                +"  WHERE p.idpeminjaman = '"+id+"'");
        try{
            while(rs.next()){
                pmj=new Peminjaman();
                pmj.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pmj.setTanggalpinjam(rs.getString("tanggalpinjam"));
                pmj.setLamapinjam(rs.getInt("lamapinjam"));
                pmj.setTotalharga(rs.getInt("totalharga"));                
                pmj.getUser().setIdUser(rs.getInt("iduser"));
                pmj.getUser().setNama(rs.getString("nama"));
                pmj.getUser().setAlamat(rs.getString("alamat"));
                pmj.getUser().setTelepon(rs.getString("telepon"));
                pmj.getCamera().setIdCamera(rs.getInt("idcamera"));
                pmj.getCamera().getKategori().setIdKategori(rs.getInt("idkategori"));
                pmj.getCamera().setMerk(rs.getString("merk"));
                pmj.getCamera().setType(rs.getString("type"));
                pmj.getCamera().setTahunRilis(rs.getInt("tahunrilis"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return pmj;
    }
    
    public ArrayList<Peminjaman> getAll(){
        ArrayList<Peminjaman>ListPeminjaman=new ArrayList();
        ResultSet rs=DBHelper.selectQuery("SELECT "
                +"  p.idpeminjaman as idpeminjaman, "
                +"  a.iduser as iduser, "
                +"  a.nama as nama, "
                +"  a.alamat as alamat, "
                +"  a.telepon as telepon, "
                +"  b.idcamera as idcamera, "
                +"  b.idkategori as idkategori, "
                +"  b.merk as merk, "
                +"  b.type as type, "
                +"  b.tahunrilis as tahunrilis, "
                +"  p.tanggalpinjam as tanggalpinjam, "
                +"  p.lamapinjam as lamapinjam, "
                +"  p.totalharga as totalharga "
                +"  FROM peminjaman p "
                +"  LEFT JOIN user a on p.iduser=a.iduser"
                +"  LEFT JOIN camera b on p.idcamera=b.idcamera ");
        try{
            while(rs.next()){
                Peminjaman pmj=new Peminjaman();
                pmj.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pmj.setTanggalpinjam(rs.getString("tanggalpinjam"));
                pmj.setLamapinjam(rs.getInt("lamapinjam"));
                pmj.setTotalharga(rs.getInt("totalharga"));
                pmj.getUser().setIdUser(rs.getInt("iduser"));
                pmj.getUser().setNama(rs.getString("nama"));
                pmj.getUser().setAlamat(rs.getString("alamat"));
                pmj.getUser().setTelepon(rs.getString("telepon"));
                pmj.getCamera().setIdCamera(rs.getInt("idcamera"));
                pmj.getCamera().getKategori().setIdKategori(rs.getInt("idkategori"));
                pmj.getCamera().setMerk(rs.getString("merk"));
                pmj.getCamera().setType(rs.getString("type"));
                pmj.getCamera().setTahunRilis(rs.getInt("tahunrilis"));
                ListPeminjaman.add(pmj);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ListPeminjaman;
    }
    
    
    public ArrayList<Peminjaman> search(String keyword){
        ArrayList<Peminjaman>ListPeminjaman=new ArrayList();
        ResultSet rs=DBHelper.selectQuery("SELECT "
                +"  p.idpeminjaman as idpeminjaman, "
                +"  a.iduser as iduser, "
                +"  a.nama as nama, "
                +"  a.alamat as alamat, "
                +"  a.telepon as telepon, "
                +"  b.idcamera as idcamera, "
                +"  b.idkategori as idkategori, "
                +"  b.merk as merk, "
                +"  b.type as type, "
                +"  b.tahunrilis as tahunrilis, "
                +"  p.tanggalpinjam as tanggalpinjam, "
                +"  p.lamapinjam as lamapinjam, "
                +"  p.totalharga as totalharga "
                +"  FROM peminjaman p "
                +"  LEFT JOIN user a on p.iduser=a.iduser"
                +"  LEFT JOIN camera b on p.idcamera=b.idcamera "
                +"  WHERE a.nama LIKE '%"+keyword+"%' "
                +"   or b.merk LIKE '%"+keyword+"%' "
                +"   or p.tanggalpinjam LIKE '%"+keyword+"%' "
                +"   or p.tanggalkembali LIKE '%"+keyword+"%' ");
        try{
            while(rs.next()){
                Peminjaman pmj=new Peminjaman();
                pmj.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pmj.setTanggalpinjam(rs.getString("tanggalpinjam"));
                pmj.setLamapinjam(rs.getInt("lamapinjam"));
                pmj.setTotalharga(rs.getInt("totalharga"));
                pmj.getUser().setIdUser(rs.getInt("iduser"));
                pmj.getUser().setNama(rs.getString("nama"));
                pmj.getUser().setAlamat(rs.getString("alamat"));
                pmj.getUser().setTelepon(rs.getString("telepon"));
                pmj.getCamera().setIdCamera(rs.getInt("idcamera"));
                pmj.getCamera().getKategori().setIdKategori(rs.getInt("idkategori"));
                pmj.getCamera().setMerk(rs.getString("merk"));
                pmj.getCamera().setType(rs.getString("type"));
                pmj.getCamera().setTahunRilis(rs.getInt("tahunrilis"));
                ListPeminjaman.add(pmj);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ListPeminjaman;
    }
    
    public void save(){
        if(getById(idpeminjaman).getIdpeminjaman()==0){
            String SQL="INSERT INTO peminjaman(iduser, idcamera, tanggalpinjam, lamapinjam, totalharga) VALUES("
                    +"  '"+this.getUser().getIdUser()+"', "
                    +"  '"+this.getCamera().getIdCamera()+"', "
                    +"  '"+this.tanggalpinjam+"', "
                    +"  '"+this.lamapinjam+"', "
                    +"  '"+this.totalharga+"' "
                    +"  )";
            this.idpeminjaman=DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL="UPDATE peminjaman SET "
                    +"  iduser = '"+this.getUser().getIdUser()+"', "
                    +"  idcamera = '"+this.getCamera().getIdCamera()+"', "
                    +"  tanggalpinjam = '"+this.tanggalpinjam+"', "
                    +"  lamapinjam = '"+this.lamapinjam+"', "
                    +"  totalharga = '"+this.totalharga+"' "
                    +"  WHERE idpeminjaman = '"+this.idpeminjaman+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL="DELETE FROM peminjaman WHERE idpeminjaman = '"+this.idpeminjaman+"'";
        DBHelper.executeQuery(SQL);
    }
}
