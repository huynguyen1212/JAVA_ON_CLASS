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
public class AnotherN {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public static void timSoThuanNghich(int soChuSo)
    {
        Integer limit = 1;
        for(int i=1;i<soChuSo;i++) limit *= 10;
        int xuongDong = 0;
        for(Integer i=limit;i<limit*10;i++)
        {
            StringBuilder tmp = new StringBuilder(i.toString());
            StringBuilder tmp2 = new StringBuilder(tmp);
            tmp.reverse();
            if(tmp.toString().equals(tmp2.toString()))
            {
                System.out.print(i + " ");
                xuongDong++;
                if(xuongDong == 10)
                {
                    System.out.println("");
                    xuongDong = 0;
                }
            }
        }
    }
}
