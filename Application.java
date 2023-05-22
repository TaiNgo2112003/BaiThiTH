/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyphongmay;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Application {

    private ArrayList<PhongMay> _list;
    private Scanner _scn;

    public Application() {
        _list = new ArrayList<>();
        _scn = new Scanner(System.in);
    }

    public void add() {
        int choice;
        do {
            _list.add(new PhongMay(Input.inputInt("Nhập mã phòng: "), Input.inputSting("Nhập tên phòng: "), Input.inputSting("Nhập loại phòng: "), Input.inputInt("Nhập vị trí tầng phong:"), Input.inputInt("Nhập số giáo viên mượn:")));
            System.out.println("NHập 1 để thêm phòng");
            System.out.println("NHập 0 để thoát");
            choice = Input.inputInt("Nhập lựa chọn");
        } while (choice == 1);
    }

    public void show() {
        if (_list.isEmpty()) {
            System.out.println("Danh sách rỗng !!!");
        } else {
            int count = 1;
            for (PhongMay phongMay : _list) {
                System.out.println("Phòng thứ " + count);
                phongMay.xuatTT();
                count++;
            }

        }
    }

    public void showFull() {
        if (_list.isEmpty()) {
            System.out.println("Danh sách rỗng !!!");
        } else {

            int count = 0;
            for (PhongMay phongMay : _list) {
                if (phongMay.getSoGv_pick() >= 5) {
                    count++;
                    System.out.println("Phòng đã full slot thứ " + count);
                    phongMay.xuatTT();
                }
            }
            if (count == 0) {
                System.out.println("Không có phòng nào full !!!");
            }
        }
    }

    public void serach() {
        if (_list.isEmpty()) {
            System.out.println("Danh sách rỗng !!!");
        } else {
            int msp = Input.inputInt("Nhập mã phòng cần tìm: ");
            for (PhongMay phongMay : _list) {
                if (phongMay.getMaPhong() == msp) {
                    System.out.println("Xuất thông tin phòng có mã là: " + msp);
                    phongMay.xuatTT();
                    return;
                }
            }
            System.out.println("Không tìm thấy mã phòng: " + msp);
        }
    }
    public void kethua(){
        System.out.println("Nhập thoong6 tin phòng máy: ");
        QLPM qlpm = new QLPM(Input.inputSting("Nhập mã phòng máy: "),Input.inputInt("Nhập mã phòng quy định: "), Input.inputSting("Nhập tên phòng: "), Input.inputSting("Nhập loại phòng: "), Input.inputInt("Nhập số lượng máy tính:"),Input.inputInt("Nhập vị trí tầng phong:"), Input.inputInt("Nhập số giáo viên mượn:"));
        System.out.println("Xuất thông tin phòng máy vừa nhập: ");
       qlpm.xuatTT();
    }
}
