/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huynguyen
 */

/*
    8 kiểu dữ liệu nguyên thủy:
    - 4 kiểu nguyên: int, short, long, byte
    - 2 kiểu thực: float, double
    - 1 kiểu char: char
    - 1 kiểu boolean: true or false
*/

public class Classtest {
    public static void main(String[] args) {
        System.out.printf("Type: %-10s Size: %-10s Min: %-20s Max: %-20s \n",
                Integer.TYPE, Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-10s Min: %-20s Max: %-20s \n",
                Short.TYPE, Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-10s Min: %-20s Max: %-20s \n",
                Long.TYPE, Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-10s Min: %-20s Max: %-20s \n",
                Byte.TYPE, Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);
        
        System.out.printf("Type: %-10s Size: %-10s Min: %-20s Max: %-20s \n",
               Float.TYPE, Float.BYTES, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-10s Min: %-20s Max: %-20s \n",
               Double.TYPE, Double.BYTES, Double.MIN_VALUE, Double.MAX_VALUE);
        
        System.out.printf("Type: %-10s Size: %-10s Min: %-20s Max: %-20s \n",
               Character.TYPE, Character.BYTES, Character.MIN_VALUE, Character.MAX_VALUE);
    }
}
