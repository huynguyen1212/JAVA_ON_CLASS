/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.lang.Math.sqrt;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class SoN {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public long getTong123()
    {
        long sum = 0;
        for(int i=1;i<=n;i++) sum += i;
        return sum;
    }
    
    public long getTich123()
    {
        long mul = 1;
        for(int i=1;i<=n;i++) mul *= i;
        return mul;
    }
    
    public long getTong246()
    {
        long sum = 0;
        for(int i=2;i<=n;i+=2) sum += i;
        return sum;
    }
    
    public long getTong135()
    {
        long sum = 0;
        for(int i=1;i<=n;i+=2) sum += i;
        return sum;
    }
    
    public void getSNT()
    {
        boolean flag = true;
        for(int i=2;i<n;i++)
        {
            flag = true;
            for(int j=2;j<=sqrt(i);j++)
            {
                if(i%j == 0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.print(i+ " ");
        }
    }
    
    public void getFibonacci()
    {
        int f1 = 0;
        int f2 = 1;
        if(n==1)
        {
            System.out.print("0");
            return;
        }
        System.out.println("0 2 ");
        while(f2 < n)
        {
            int f3 = f1;
            f1 = f2;
            f2 += f3;
            System.out.print(f2 + " ");
        }
    }
    
    public int getTongChuSo()
    {
        int sumCS = 0;
        int m = n;
        while(m>0)
        {
            sumCS += m%10;
            m /= 10;
        }
        return sumCS;
    }
    
    public void getUocN()
    {
        for(int i=1;i<=n;i++)
        {
            if(n%i == 0) System.out.print(i + " ");
        }
    }
    
    public void phanTichRaSNT()
    {
        int m = n;
        for(int i=2;i<=sqrt(n);i++)
        {
            while(m%i == 0)
            {
                System.out.print(i);
                m/=i;
                if(m>1) System.out.print("x");
            }
        }
        if(m>1) System.out.println(m);
    }
    
    public boolean SNT(int number)
    {
        for(int i=2;i<=sqrt(number);i++)
        {
            if(number%i==0) return false;
        }
        return true;
    }
    public void SNTNamChuSo()
    {
        Array arrayList;
        for(int i=10001;i<1000000;i+=2)
        {
            if(this.SNT(i))
            {
                int KiemTra = i;
                int SumOfDigit = 0;
                while(KiemTra > 0)
                {
                    SumOfDigit += KiemTra%10;
                    KiemTra /= 10;
                }
                if(SumOfDigit == this.n)
                {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
