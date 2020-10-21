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
public class HaiSo {
    private int so1, so2;

    public HaiSo(int so1, int so2) {
        this.so1 = so1;
        this.so2 = so2;
    }

    public int getSo1() {
        return so1;
    }

    public void setSo1(int so1) {
        this.so1 = so1;
    }

    public int getSo2() {
        return so2;
    }

    public void setSo2(int so2) {
        this.so2 = so2;
    }
    
    public int ucln()
    {
        while(so1*so2 != 0)
        {
            if(so1 > so2)
            {
                so1 %= so2;
            } else so2 %= so1;
        }
        return so1+so2;
    }
}
