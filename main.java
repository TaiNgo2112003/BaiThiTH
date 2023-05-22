/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyphongmay;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int choice;
        Application application = new Application();
          do {
            System.out.println("|=========================menu=========================|");
            System.out.println("|1. Nhập thông tin                                     |");
            System.out.println("|2. Xuất thông tin                                     |");
            System.out.println("|3. Xuất thông tin  phòng đã  full                     |");
            System.out.println("|4. Tìm phòng theo mã                                  |");
            System.out.println("|5. Nhập phòng máy                                     |");
            System.out.println("|6. Thoát                                              |");
            System.out.println("|=========================menu=========================|");
          choice = Input.inputInt("Nhập lựa chọn: ");
           switch (choice) {
                case 1:
                  application.add();
                    break;
                     case 2:
                  application.show();
                    break;
                     case 3:
                   application.showFull();
                    break;
                     case 4:
                   application.serach();
                    break;
                     case 5:
                  application.kethua();
                    break;
                     case 6:
                         System.out.println("see you again !!!");
                  // System.exit(0);
                         
                default:
                    System.out.println("Nhập chức năng theo số từ 1-6");
            }
            
        } while (choice != 6);

    }
}
