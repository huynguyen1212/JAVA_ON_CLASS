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
public class SoThuc {
    private double soThuc;

    public SoThuc()
    {
    
    }
    
    public SoThuc(double soThuc) {
        this.soThuc = soThuc;
    }

    
    public double getSoThuc() {
        return soThuc;
    }

    public void setSoThuc(double soThuc) {
        this.soThuc = soThuc;
    }
    
    public double getPI()
    {
        double PI = 1;
        int index = 1;
        int i = 1;
        double x = 0;
        do
        {
            PI = PI + index*x;
            index *= -1;
            i += 2;
            x = (double)1/i;
            
        } while(x > soThuc);
        return PI*4;
    }
    
    public double getSinX()
    {
        final double epsilon = 0.001;
        double tu = soThuc;
        double mau = 1;
        double phanSo = soThuc;
        long index = 1;
        double res = 0;
        long pow = 1;
        
        while(phanSo > epsilon)
        {
            res = res + pow*phanSo;
            pow *= -1;
            tu = tu*soThuc*soThuc;
            index += 2;
            mau = mau*(index-1)*index;
            phanSo = (double)tu/mau;
        }
        return res;
    }
    
}
