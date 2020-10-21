/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.SoN;

/**
 *
 * @author admin
 */
public class Bai1 {
    Scanner sc = new Scanner(System.in);
    SoN n = new SoN();
    
    public void showMenu()
    {
        while(true)
        {
            System.out.println("Mời chọn số:");
            System.out.println("1. Nhập vào số nguyên dương n\n" +
                                "2. Viết ra tổng 1+2+3+...+n\n" +
                                "3. Viết ra tích 1.2.3...n\n" +
                                "4. Viết ra tổng 2+4+....\n" +
                                "5. Viết ra tổng 1+3+5+...\n" +
                                "6. Viết ra các số nguyên tố <n\n" +
                                "7. Viết ra dãy số Fibonacci <n\n" +
                                "8. Viết tổng các chữ số của n (345: 3+4+5)\n" +
                                "9. Viết các ước của n\n"+
                                "10. Phân tích ra thừa số nguyên tố\n"+
                                "0. Exit");
            int menu = Integer.parseInt(sc.nextLine());
            
            switch(menu)
            {
                case 1:
                    int tmp;
                    System.out.print("Moi nhap n: ");
                    tmp = Integer.parseInt(sc.nextLine());
                    n.setN(tmp);
                    break;
                case 2:
                    System.out.println("Tong 1+2+3+...+n la: " + n.getTong123() );
                    break;
                case 3:
                    System.out.println("Tich 1.2.3...n la: " + n.getTich123() );
                    break;
                case 4:
                    System.out.println("Tong 2+4+6+...+n la: " + n.getTong246() );
                    break;
                case 5:
                    System.out.println("Tong 1+3+5+...+n la: " + n.getTong135() );
                    break;
                case 6:
                    System.out.print("Cac so nguyen to <n: ");
                    n.getSNT();
                    System.out.println("");
                    break;
                case 7:
                    System.out.print("Cac so Fibonacci <n: ");
                    n.getSNT();
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("Tong cac chu so cua n la: " + n.getTongChuSo());
                    break;
                case 9:
                    System.out.print("Cac uoc cua n la: ");
                    n.getUocN();
                    System.out.println("");
                    break;
                case 10:
                    System.out.print("Số " + n.getN() + " được phân tích thành: ");
                    n.phanTichRaSNT();
                default:
                    System.exit(0);
            }
        }
    }
        
}
