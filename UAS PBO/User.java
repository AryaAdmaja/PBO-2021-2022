package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public class User {

    private int iduser;
    private String nama;
    private String alamat;
    private String telepon;

    public int getIdUser() {
        return this.iduser;
    }

    public void setIdUser(int iduser) {
        this.iduser = iduser;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return this.telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public User() {

    }

    public User(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public User getById(int id) {
        User user = new User();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM user "
                + "WHERE iduser = '" + id + "'");
        try {
            while (rs.next()) {
                user = new User();
                user.setIdUser(rs.getInt("iduser"));
                user.setNama(rs.getString("nama"));
                user.setAlamat(rs.getString("alamat"));
                user.setTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public ArrayList<User> getAll() {
        ArrayList<User> ListUser = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM user");

        try {
            while (rs.next()) {
                User user = new User();
                user.setIdUser(rs.getInt("iduser"));
                user.setNama(rs.getString("nama"));
                user.setAlamat(rs.getString("alamat"));
                user.setTelepon(rs.getString("telepon"));

                ListUser.add(user);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListUser;
    }

    public ArrayList<User> search(String keyword) {
        ArrayList<User> ListUser = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM user WHERE "
                + "nama LIKE '%" + keyword + "%' "
                + "OR alamat LIKE '%" + keyword + "%' "
                + "OR telepon LIKE '%" + keyword + "%'");

        try {
            while (rs.next()) {
                User user = new User();
                user.setIdUser(rs.getInt("iduser"));
                user.setNama(rs.getString("nama"));
                user.setAlamat(rs.getString("alamat"));
                user.setTelepon(rs.getString("telepon"));

                ListUser.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListUser;
    }

    public void save() {
        if (getById(iduser).getIdUser() == 0) {
            String SQL = "INSERT INTO user (nama, alamat, telepon) VALUES("
                    + "'" + this.getNama() + "',"
                    + "'" + this.getAlamat() + "',"
                    + "'" + this.getTelepon() + "'"
                    + ")";
            this.iduser = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE user SET "
                    + "nama = '" + this.getNama() + "',"
                    + "alamat = '" + this.getAlamat() + "',"
                    + "telepon = '" + this.getTelepon() + "'"
                    + "WHERE idanggota = '" + this.getIdUser() + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM user WHERE iduser = '" + this.getIdUser() + "'";
        DBHelper.executeQuery(SQL);
    }

    public String cariUser(int idAnggota) {

        String namaUser = "0";
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM user WHERE iduser =  '" + iduser + "'");

        try {
            while (rs.next()) {
                namaUser = rs.getString("nama");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return namaUser;
    }

}    
