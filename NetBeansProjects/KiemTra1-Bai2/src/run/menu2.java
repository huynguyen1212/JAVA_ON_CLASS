package run;

import entiry.bai2;
import java.util.Scanner;

/**
 *
 * @author huynguyen
 */
public class menu2 {

    public static void main(String[] args) {
        bai2 b2 = new bai2();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("1. Nhập vào hai số nguyên m và n");
            System.out.println("2. Đưa ra ước chung lớn nhất và bội chung nhỏ nhất");
            System.out.println("3. Đưa ra các số nguyên tố từ m đến n");
            System.out.println("4. Đưa ra các số thuận nghịch trong khoảng từ m đến n");

            System.out.println("0. Exit");

            int choose;
            choose = Integer.parseInt(in.nextLine());

            switch (choose) {
                case 1:
                    b2.Nhap();
                    break;
                case 2:
                    b2.UCLN_BCNN();
                    break;
                case 3:
                    b2.SNTtuMdenN();
                    break;
                case 4:
                    b2.SoThuanNghich();
                    break;
                default:
                    System.out.println("The end");
            }
        }
    }
}
