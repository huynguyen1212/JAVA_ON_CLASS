/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class PhanSo {
    int tu = 0;
    int mau = 1;

    public PhanSo() {
    }
    public PhanSo(int tu, int mau)
    {
        this.tu = tu;
        this.mau = mau;
    }

    @Override
    public String toString()
    {
        return tu+"/"+mau;
    }
    
    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    
    public void toiGianPhanSo()
    {
        int UCLN;
        int tuGia = Math.abs(tu);
        int mauGia = Math.abs(mau);
        while(tuGia*mauGia != 0)
        {
            if(mauGia>tuGia)
            {
                mauGia = mauGia%tuGia;
            }
            else tuGia = tuGia%mauGia;
        }
        UCLN = mauGia+tuGia;
        this.tu /= UCLN;
        this.mau /= UCLN;
    }
    
    public PhanSo cong(PhanSo a)
    {
        int NewTu = this.tu*a.mau + this.mau*a.tu;
        int NewMau = this.mau*a.mau;
        PhanSo Tong = new PhanSo(NewTu, NewMau);
        Tong.toiGianPhanSo();
        return Tong;
    }
    
    public static PhanSo getTong(PhanSo a, PhanSo b)
    {
        int NewTu = b.tu*a.mau + b.mau*a.tu;
        int NewMau = b.mau*a.mau;
        PhanSo Tong = new PhanSo(NewTu, NewMau);
        Tong.toiGianPhanSo();
        return Tong;
    }
}
