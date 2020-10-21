package entiry;

import java.util.Scanner;

/**
 *
 * @author huynguyen
 */
public class bai1 {

    private int n;

    public void Nhap() {
        Scanner in = new Scanner(System.in);
        n = Integer.parseInt(in.nextLine());
        System.out.println(n);
    }

    public void Tong() {
        int tong = 0;
        for (int i = 0; i <= n; i++) {
            tong += i;
        }
        System.out.println(tong);
    }

    public void Tich() {
        int tich = 1;
        for (int i = 1; i <= n; i++) {
            tich *= i;
        }
        System.out.println(tich);
    }

    public void TongChan() {
        int tongchan = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                tongchan += i;
            }
        }
        System.out.println(tongchan);
    }

    public void TongLe() {
        int tongle = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                tongle += i;
            }
        }
        System.out.println(tongle);
    }

    public boolean isSNT(int check) {
        if (check < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(check); i++) {
            if (check % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void SNT() {
        if (n >= 2) {
            System.out.println(2);
        }
        for (int i = 3; i < n; i++) {
            if (isSNT(i)) {
                System.out.println(" " + i);
            }
        }
    }

//    public int tinhfibonaci(int tinhnext) {
//        int a = 0, b = 1, c = 1;
//        if (tinhnext < 0) {
//            return -1;
//        } else if (tinhnext == 0 || tinhnext == 1) {
//            return tinhnext;
//        } else {
//            for (int i = 2; i <= tinhnext; i++) {
//                a = b;
//                b = c;
//                c = a + b;
//            }
//        }
//        return c;
//    }
    public void Fibonaci() {
        if (n < 0) {
            System.out.println(-1);
        } else if (n == 0 || n == 1) {
            System.out.println(n);
        } else {
            int a = 0, b = 1, c = 1;
            System.out.println(a + " " + b + " " + c);
            while (c < n) {
                a = b;
                b = c;
                c = a + b;
                if (c < n) {
                    System.out.println(c);
                }
            }
        }
    }

    public void TongChuSo() {
        int tong = 0;
        while (n > 0) {
            int soDu = n % 10;
            tong += soDu;
            n /= 10;
        }
        System.out.println(tong);
    }

    public void Uoc() {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
