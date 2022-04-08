/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.entity;

/**
 *
 * @author NgocTV
 */
public class ThucVat {

    private String maTV;
    private String ten;
    private String khuVuc;
    private int canNang;

    public ThucVat() {
    }

    public ThucVat(String maTV, String ten, String khuVuc, int canNang) {
        this.maTV = maTV;
        this.ten = ten;
        this.khuVuc = khuVuc;
        this.canNang = canNang;
    }

    public String getMaTV() {
        return maTV;
    }

    public void setMaTV(String maTV) {
        this.maTV = maTV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getKhuVuc() {
        return khuVuc;
    }

    public void setKhuVuc(String khuVuc) {
        this.khuVuc = khuVuc;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    @Override
    public String toString() {
        return "ThucVat{" + "maTV=" + maTV + ", ten=" + ten + ", khuVuc=" + khuVuc + ", canNang=" + canNang + '}';
    }

}
