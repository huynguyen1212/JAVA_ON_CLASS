package entiry;

import java.util.Scanner;

/**
 *
 * @author huynguyen
 */
public class bai2 {

    private int n, m;

    public void Nhap() {
        Scanner in = new Scanner(System.in);
        m = Integer.parseInt(in.nextLine());
        n = Integer.parseInt(in.nextLine());
        System.out.println(m + " " + n);
    }

    public int UCLN(int m, int n) {
        if (n == 0) {
            return m;
        }
        return UCLN(n, m % n);
    }

    public int BCNN(int m, int n) {
        return (m * n) / UCLN(m, n);
    }

    public void UCLN_BCNN() {
        System.out.println(UCLN(m, n));
        System.out.println(BCNN(m, n));
    }

    public void SNTtuMdenN() {
        for (int i = m; i <= n; i++) {
            int dem = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    dem += 1;
                }
            }
            if (dem <= 1) {
                System.out.println(i);
            }
        }
    }

    public void DaoNguoc(int a) {
        int temp = 0, res = 0;
        int b = a;
        while (a > 0) {
            temp = a % 10;
            res = res * 10 + temp;
            a = a / 10;
        }
        if (b == res) {
            System.out.println(b);
        }
    }

    public void SoThuanNghich() {
        for (int i = m; i <= n; i++) {
            DaoNguoc(i);
        }
    }
}
