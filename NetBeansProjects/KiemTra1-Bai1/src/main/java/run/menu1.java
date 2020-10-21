package run;

import entiry.bai1;
import java.util.Scanner;

/**
 *
 * @author huynguyen
 */
public class menu1 {

    public static void main(String[] args) {
        bai1 b1 = new bai1();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("1. Nhập vào số nguyên dương n");
            System.out.println("2. Viết ra tổng 1 + 2 + 3 + ... + n");
            System.out.println("3. Viết ra tích 1.2.3.....n");
            System.out.println("4. Viết ra tổng số chắn nhỏ hơn n");
            System.out.println("5. Viết ra tổng số lẻ nhỏ hơn n");
            System.out.println("6. Viết ra các số nguyên tố nhỏ hơn n");
            System.out.println("7. Viết ra dãy số Fibonaci nhỏ hơn n");
            System.out.println("8. Viết ra tổng các chữ số của n");
            System.out.println("9. Viết các ước của n");

            System.out.println("0. Exit");

            int choose;
            choose = Integer.parseInt(in.nextLine());

            switch (choose) {
                case 1:
                    b1.Nhap();
                    break;
                case 2:
                    b1.Tong();
                    break;
                case 3:
                    b1.Tich();
                    break;
                case 4:
                    b1.TongChan();
                    break;
                case 5:
                    b1.TongLe();
                    break;
                case 6:
                    b1.SNT();
                    break;
                case 7:
                    b1.Fibonaci();
                    break;
                case 8:
                    b1.TongChuSo();
                    break;
                case 9:
                    b1.Uoc();
                    break;
                    
                default:
                    System.out.println("The end");
            }
        }
    }
}
