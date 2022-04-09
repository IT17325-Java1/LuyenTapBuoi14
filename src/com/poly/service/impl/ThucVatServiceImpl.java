/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.service.impl;

import com.poly.entity.ChayAnQua;
import com.poly.entity.ThucVat;
import com.poly.service.ThucVatService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NgocTV
 */
public class ThucVatServiceImpl implements ThucVatService {

    @Override
    public ThucVat inputThucVat() {
        ThucVat thucVat = new ThucVat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter maTV:");
        String maTV = scanner.nextLine();
        System.out.println("Enter ten:");
        String ten = scanner.nextLine();
        System.out.println("Enter khuVuc:");
        String khuVuc = scanner.nextLine();
        System.out.println("Enter canNang:");
        int canNang = Integer.valueOf(scanner.nextLine());
        thucVat.setMaTV(maTV);
        thucVat.setTen(ten);
        thucVat.setKhuVuc(khuVuc);
        thucVat.setCanNang(canNang);
        return thucVat;
    }

    @Override
    public void outputThucVat(ArrayList<ThucVat> thucVatList) {
        thucVatList.forEach(s -> s.toString());
    }

    @Override
    public ArrayList<ThucVat> searchBycanNang(ArrayList<ThucVat> thucVatList, int min, int max) {
        ArrayList<ThucVat> listSearch = new ArrayList<>();
        for (ThucVat thucVat : thucVatList) {
            if (thucVat.getCanNang() >= min && thucVat.getCanNang() <= max) {
                listSearch.add(thucVat);
            }
        }
        return listSearch;
    }

    @Override
    public ArrayList<ThucVat> searchByNameStartWith(ArrayList<ThucVat> thucVatList, String startWith) {
        ArrayList<ThucVat> listSearch = new ArrayList<>();
        for (ThucVat thucVat : thucVatList) {
            if (thucVat.getTen().startsWith(startWith)) {
                listSearch.add(thucVat);
            }
        }
        return listSearch;
    }

    @Override
    public ArrayList<ThucVat> searchByNameEndWith(ArrayList<ThucVat> thucVatList, String endWith) {
        ArrayList<ThucVat> listSearch = new ArrayList<>();
        for (ThucVat thucVat : thucVatList) {
            if (thucVat.getTen().endsWith(endWith)) {
                listSearch.add(thucVat);
            }
        }
        return listSearch;
    }

    @Override
    public ArrayList<ThucVat> searchByName(ArrayList<ThucVat> thucVatList, String ten) {
        ArrayList<ThucVat> listSearch = new ArrayList<>();
        for (ThucVat thucVat : thucVatList) {
            if (thucVat.getTen().endsWith(ten)) {
                listSearch.add(thucVat);
            }
        }
        return listSearch;
    }

    @Override
    public ArrayList<ThucVat> displayDivide(ArrayList<ThucVat> thucVatList) {
        ArrayList<ThucVat> listSearch = new ArrayList<>();
        for (ThucVat thucVat : thucVatList) {
            if (thucVat.getCanNang() % 8 == 0) {
                listSearch.add(thucVat);
            }
        }
        return listSearch;
    }

    @Override
    public ArrayList<ThucVat> displayIndexEven(ArrayList<ThucVat> thucVatList) {
        ArrayList<ThucVat> listSearch = new ArrayList<>();
        int size = thucVatList.size();
        for (int i = 0; i < size; i += 2) {
            listSearch.add(thucVatList.get(i));
        }
        return listSearch;
    }

    @Override
    public void sortByName(ArrayList<ThucVat> thucVatList) {
        thucVatList.sort((s1, s2) -> s1.getTen().compareTo(s2.getTen()));
    }

    @Override
    public void outputCayAnQua(ArrayList<ChayAnQua> chayAnQuas) {
        chayAnQuas.forEach(s -> System.out.println(s.toString()));
    }

}
