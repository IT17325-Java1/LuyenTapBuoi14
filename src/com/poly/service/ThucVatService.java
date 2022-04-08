/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.service;

import com.poly.entity.ThucVat;
import java.util.ArrayList;

/**
 *
 * @author NgocTV
 */
public interface ThucVatService {

    ThucVat inputThucVat();

    void outputThucVat(ArrayList<ThucVat> thucVatList);

    ArrayList<ThucVat> searchBycanNang(ArrayList<ThucVat> thucVatList, int min, int max);

    ArrayList<ThucVat> searchByNameStartWith(ArrayList<ThucVat> thucVatList, String startWith);

    ArrayList<ThucVat> searchByNameEndWith(ArrayList<ThucVat> thucVatList, String endWith);

    ArrayList<ThucVat> searchByName(ArrayList<ThucVat> thucVatList, String ten);

    ArrayList<ThucVat> displayDivide(ArrayList<ThucVat> thucVatList);

    ArrayList<ThucVat> displayIndexEven(ArrayList<ThucVat> thucVatList);

    void sortByName(ArrayList<ThucVat> thucVatList);

}
