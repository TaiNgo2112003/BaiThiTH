/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyphongmay;

/**
 *
 * @author Admin
 */
public class QLPM extends PhongMay {

    private String msPhongMay;
    private int soLuongMayTinh;

    public QLPM() {
    }

    public QLPM(String msPhongMay, int maPhong, String tenPhong, String loaiPhong, int soLuongMayTinh, int viTriTang, int soGv_pick) {
        super(maPhong, tenPhong, loaiPhong, viTriTang, soGv_pick);
        this.msPhongMay = msPhongMay;
        this.soLuongMayTinh = soLuongMayTinh;
    }

  

    public String getMsPhongMay() {
        return msPhongMay;
    }

    public void setMsPhongMay(String msPhongMay) {
        this.msPhongMay = msPhongMay;
    }

    public int getSoLuongMayTinh() {
        return soLuongMayTinh;
    }

    public void setSoLuongMayTinh(int  soLuongMayTinh) {
        this.soLuongMayTinh = soLuongMayTinh;
    }

    @Override
    public void xuatTT() {
        super.xuatTT();
        System.out.println("Mã số phòng máy               :" + getMaPhong());
        System.out.println("Số lượng máy tính             :" + getSoLuongMayTinh());
    }
}
