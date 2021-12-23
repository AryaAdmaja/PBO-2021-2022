package backend;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

public class Camera {

    private int idCamera;
    private Kategori kategori = new Kategori();
    private String merk;
    private String type;
    private int tahunRilis;

    public int getIdCamera() {
        return idCamera;
    }

    public void setIdCamera(int idCamera) {
        this.idCamera = idCamera;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }
    
    public Camera(){
        
    }
    public Camera(Kategori kategori, String merk, String type, int tahunRilis) {
        this.kategori = kategori;
        this.merk = merk;
        this.type = type;
        this.tahunRilis = tahunRilis;
    }
    
    public Camera getById(int id) {
        Camera camera = new Camera();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "b.idcamera AS idcamera,"
                + "b.merk AS merk,"
                + "b.type AS type,"
                + "b.tahunrilis AS tahunrilis,"
                + "k.idkategori AS idkategori,"
                + "k.nama AS nama,"
                + "k.keterangan AS keterangan"
                + " FROM camera b LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                + "WHERE b.idcamera = '" + id + "'");
        try {
            while (rs.next()) {
                camera = new Camera();
                camera.setIdCamera(rs.getInt("idcamera"));
                camera.getKategori().setIdKategori(rs.getInt("idkategori"));
                camera.getKategori().setNama(rs.getString("nama"));
                camera.getKategori().setKeterangan(rs.getString("keterangan"));
                camera.setMerk(rs.getString("merk"));
                camera.setType(rs.getString("type"));
                camera.setTahunRilis(rs.getInt("tahunrilis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return camera;
    }

    public ArrayList<Camera> getAll() {
        ArrayList<Camera> ListCamera = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "b.idcamera AS idcamera,"
                + "b.merk AS merk,"
                + "b.type AS type,"
                + "b.tahunrilis AS tahunrilis,"
                + "k.idkategori AS idkategori,"
                + "k.nama AS nama,"
                + "k.keterangan AS keterangan"
                + " FROM camera b LEFT JOIN kategori k ON b.idkategori = k.idkategori ");

        try {
            while (rs.next()) {
                Camera camera = new Camera();
                camera.setIdCamera(rs.getInt("idcamera"));
                camera.getKategori().setIdKategori(rs.getInt("idkategori"));
                camera.getKategori().setNama(rs.getString("nama"));
                camera.getKategori().setKeterangan(rs.getString("keterangan"));
                camera.setMerk(rs.getString("merk"));
                camera.setType(rs.getString("type"));
                camera.setTahunRilis(rs.getInt("tahunrilis"));

                ListCamera.add(camera);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListCamera;
    }

    public ArrayList<Camera> search(String keyword) {
        ArrayList<Camera> ListCamera = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "b.idcamera AS idcamera,"
                + "b.merk AS merk,"
                + "b.type AS type,"
                + "b.tahunrilis AS tahunrilis,"
                + "k.idkategori AS idkategori,"
                + "k.nama AS nama,"
                + "k.keterangan AS keterangan"
                + " FROM camera b LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                + "WHERE b.merk LIKE '%" + keyword + "%'"
                + " OR b.type LIKE '%" + keyword + "%'"
                + " OR b.tahunrilis LIKE '%" + keyword + "%'");

        try {
            while (rs.next()) {
                Camera camera = new Camera();
                camera.setIdCamera(rs.getInt("idcamera"));
                camera.getKategori().setIdKategori(rs.getInt("idkategori"));
                camera.getKategori().setNama(rs.getString("nama"));
                camera.getKategori().setKeterangan(rs.getString("keterangan"));
                camera.setMerk(rs.getString("merk"));
                camera.setType(rs.getString("type"));
                camera.setTahunRilis(rs.getInt("tahunrilis"));

                ListCamera.add(camera);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListCamera;
    }

    public void save() {
        if (getById(idCamera).getIdCamera() == 0) {
            String SQL = "INSERT INTO camera (merk, idkategori, type, tahunrilis) VALUES("
                    + "'" + this.getMerk()+ "',"
                    + "'" + this.getKategori().getIdKategori() + "',"
                    + "'" + this.getType() + "',"
                    + "'" + this.getTahunRilis() + "'"
                    + ")";
            this.idCamera = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE camera SET "
                    + "merk = '" + this.getMerk() + "',"
                    + "idkategori = '" + this.getKategori().getIdKategori() + "',"
                    + "type = '" + this.getType() + "',"
                    + "tahunrilis = '" + this.getTahunRilis() + "'"
                    + "WHERE idcamera = '" + this.getIdCamera() + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM buku where idcamera = '" + this.idCamera + "'";
        DBHelper.executeQuery(SQL);
    }

    public String cariCamera(int idCamera) {

        String namaCamera = "0";
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM camera WHERE idcamera =  '" + idCamera + "'");

        try {
            while (rs.next()) {
                namaCamera = rs.getString("merk");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return namaCamera;
    }

}
    