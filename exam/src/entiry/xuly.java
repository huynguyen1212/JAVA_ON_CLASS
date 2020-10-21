/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entiry;

import java.util.Scanner;

/**
 *
 * @author minht
 */
public class xuly {

    private float a, b, c;

    public void nhap() {
        Scanner in = new Scanner(System.in);
        a = Float.parseFloat(in.nextLine());
        b = Float.parseFloat(in.nextLine());
        c = Float.parseFloat(in.nextLine());
    }

    public void sosanh() {
        float x = a;
        if (x < b) {
            x = b;
        }
        if (x < c) {
            x = c;
        }
        System.out.println("So lon nhat la " + x);
    }

    public void dientich() {
        float p = (a + b + c) / 2;
        System.out.println("Dien tich la" + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    public void ptb2() {
        float del = (b * b - 4 * a * c);
        if (del < 0) {
            System.out.println("Vo nghiem");
        } else if (del == 0) {
            System.out.println("Co 1 nghiem" + (float) (-b / (2 * a)));
        } else {
            System.out.println("Co 2 nghiem phan biet");
            System.out.println("x1" + (float) ((Math.sqrt(del) - b) / (2 * a)));
            System.out.println("x2" + (float) (-(Math.sqrt(del) + b) / (2 * a)));
        }
    }
}
