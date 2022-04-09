package com.poly.entity;

public class ChayAnQua extends ThucVat {
    private int soNamtuoi;
    private int trangThai;

    public ChayAnQua() {
    }

    public ChayAnQua(int soNamtuoi, int trangThai) {
        super(); // dai dien cho cha. Co the goi ham cua cha
        this.soNamtuoi = soNamtuoi;
        this.trangThai = trangThai;
    }

    public int getSoNamtuoi() {
        return this.soNamtuoi;
    }

    public void setSoNamtuoi(int soNamtuoi) {
        this.soNamtuoi = soNamtuoi;
    }

    public int getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public void display() {
        System.out.println("{" +
                " soNamtuoi='" + getSoNamtuoi() + "'" +
                ", trangThai='" + getTrangThai() + "'" +
                ", maTV='" + super.getMaTV() + "'" +
                ", ten='" + getTen() + "'" +
                ", khuVuc='" + getKhuVuc() + "'" +
                ", canNang='" + getCanNang() + "'" +
                "}");
    }

}
