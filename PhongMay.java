/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyphongmay;

/**
 *
 * @author Admin
 */
public class PhongMay {

    private int maPhong;
    private String tenPhong;
    private String loaiPhong;
    private int viTriTang;
    private int soGv_pick;

    public PhongMay() {
    }

    public PhongMay(int maPhong, String tenPhong, String loaiPhong, int viTriTang, int soGv_pick) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.loaiPhong = loaiPhong;
        this.viTriTang = viTriTang;
        this.soGv_pick = soGv_pick;
    }

   

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getViTriTang() {
        return viTriTang;
    }

    public void setViTriTang(int viTriTang) {
        this.viTriTang = viTriTang;
    }

    public int getSoGv_pick() {
        return soGv_pick;
    }

    public void setSoGv_pick(int soGv_pick) {
        this.soGv_pick = soGv_pick;
    }

    public void xuatTT() {
        System.out.println("Mã  phong:             :" +getMaPhong());
        System.out.println("Tên phòng:             :"+getTenPhong());
        System.out.println("Loại phòng:            :" +getLoaiPhong());
        System.out.println("Vị trí  phòng:         :"+getViTriTang());
        System.out.println("Số GV đặt phòng:       :"+getViTriTang());
     
    }

}
