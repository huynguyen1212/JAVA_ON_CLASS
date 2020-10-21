/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;
import java.util.Arrays;
import java.util.Scanner;
import entiry.xuly;
import entiry.xuly2;
/**
 *
 * @author minht
 */
public class menu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int chon;
        xuly so=new xuly();
        while(true){
            System.out.println("-------MENU-------");
            System.out.println("1. Nhap 3 so a,b,c");
            System.out.println("2. Viet ra so lon nhat");
            System.out.println("3. Tinh dien tich tam giac");
            System.out.println("4. Giai phuong trinh bac 2");
            System.out.println("0. Thoat");
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1: so.nhap();    break;
                case 2: so.sosanh();  break;
                case 3:  so.dientich();   break;
                case 4:  so.ptb2();   break;
                case 0:     return; //System.exit(0); break; //
                default: System.out.println("Nhap tu 1 den 4");
            }
        }
    }
}
