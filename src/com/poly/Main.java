/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;

import com.poly.entity.ChayAnQua;
import com.poly.entity.ThucVat;
import com.poly.service.ThucVatService;
import com.poly.service.impl.ThucVatServiceImpl;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NgocTV
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ThucVat> thucVatList = new ArrayList<>();
        ArrayList<ChayAnQua> chayAnQuasList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        ThucVatService thucVatService = new ThucVatServiceImpl();
        int fuction = 0;
        do {
            System.out.println("1. Thêm thực vật");
            System.out.println("2. Xuất thực vật");
            System.out.println("3. Tìm kiếm thực vật theo cân nặng");
            System.out.println("4. Tìm kiến ten bắt đầu bằng chữ 'sa'");
            System.out.println("5. tìm kiếm tên kết thúc bằng chữ 'ma'");
            System.out.println("6. tìm kiếm theo tên của thực vật");
            System.out.println("7. Hiển thị thực vật có cân nặng chia hết cho 8");
            System.out.println("8. Hiển thị thực vật có vị trí chẵn");
            System.out.println("9. Sắp xếp danh sách thực vật theo tên tăng dần");
            System.out.println("10. Thoát");
            System.out.println("Xim mời nhập chức năng:");
            fuction = Integer.valueOf(scanner.nextLine());
            switch (fuction) {
                case 1: {
                    String keepTrying = "y";
                    while (!keepTrying.equalsIgnoreCase("N")) {
                        ThucVat thucVat = thucVatService.inputThucVat();
                        thucVatList.add(thucVat);
                        System.out.println("Bạn muốn tiếp tục nhập không? (Y/N)");
                        keepTrying = scanner.nextLine();
                    }
                    break;
                }
                case 2: {
                    thucVatService.outputThucVat(thucVatList);
                    break;
                }
                case 3: {
                    System.out.println("Xin mời nhập cân nặng nhỏ nhất:");
                    int min = Integer.valueOf(scanner.nextLine());
                    System.out.println("Xin mời nhập cân nặng lớn nhất:");
                    int max = Integer.valueOf(scanner.nextLine());
                    ArrayList<ThucVat> listFound = thucVatService.searchBycanNang(thucVatList, min, max);
                    if (listFound.isEmpty()) {
                        System.out.println("Không tìm thấy con nào!");
                    } else {
                        listFound.forEach(s -> System.out.println(s.toString()));
                    }
                    break;
                }
                case 4: {
                    String ten = "sa";
                    ArrayList<ThucVat> listFound = thucVatService.searchByNameStartWith(thucVatList, ten);
                    if (listFound.isEmpty()) {
                        System.out.println("Không có tên nào bắt đầu bằng từ 'sa'");
                    } else {
                        listFound.forEach(s -> System.out.println(s.toString()));
                    }
                    break;
                }
                case 5: {
                    String ten = "ma";
                    ArrayList<ThucVat> listFound = thucVatService.searchByNameEndWith(thucVatList, ten);
                    if (listFound.isEmpty()) {
                        System.out.println("Không có tên nào bắt đầu bằng từ 'ma'");
                    } else {
                        listFound.forEach(s -> System.out.println(s.toString()));
                    }
                    break;
                }
                case 6: {
                    System.out.println("Xin mời nhập tên:");
                    String ten = scanner.nextLine();
                    ArrayList<ThucVat> litSearch = thucVatService.searchByName(thucVatList, ten);
                    litSearch.forEach(s -> System.out.println(s.toString()));
                    break;
                }
                case 7: {
                    ArrayList<ThucVat> litSearch = thucVatService.displayDivide(thucVatList);
                    litSearch.forEach(s -> System.out.println(s.toString()));
                    break;
                }
                case 8: {
                    ArrayList<ThucVat> litSearch = thucVatService.displayIndexEven(thucVatList);
                    litSearch.forEach(s -> System.out.println(s.toString()));
                    break;
                }
                case 9: {
                    thucVatService.sortByName(thucVatList);
                    thucVatList.forEach(s -> System.out.println(s.toString()));
                    break;
                }
                case 10:
                    thucVatService.outputCayAnQua(chayAnQuasList);
                    break;
            }
        } while (fuction != 10);

    }

}
