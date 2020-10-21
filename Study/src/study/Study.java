
package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import model.AnotherN;
import model.DaySo;
import model.PhanSo;
import model.SoN;
import model.SoThuc;
import view.Bai1;

/**
 *
 * @author admin
 */
public class Study {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Bai1 bai1 = new Bai1();
//        bai1.showMenu();  
//        DaySo daySo = new DaySo(2,3,4);
//        System.out.println(daySo.getGiaTriDaThuc(1));
        SoThuc epsilon = new SoThuc(0.0001);
        System.out.println(epsilon.getPI());
        SoThuc testSin = new SoThuc(epsilon.getPI()/2);
        System.out.println(testSin.getSinX());
            
//        PhanSo ps1 = new PhanSo(1,2);
//        PhanSo ps2 = new PhanSo(1,3);
//        System.out.println(ps1.cong(ps2));
//        System.out.println(PhanSo.getTong(ps1, ps2));
//
//        AnotherN testThuanNghich = new AnotherN();
//        AnotherN.timSoThuanNghich(6);
           
//        String HoTen;
//        Scanner sc = new Scanner(System.in);
//        HoTen = sc.nextLine();
//        String trim = HoTen.trim();
//        trim = trim.replaceAll("\\s+", " ");
//        String[] arrayName;
//        arrayName = trim.split("\\s");
//        System.out.print("Ho, ten: "+ arrayName[0] + ", " + arrayName[arrayName.length-1]);
//        int[] c = {1, 2, 3, 4, 5};
        ArrayList<Integer> a = new ArrayList<>(11);
        a.add(11);
        a.add(10);
        a.sort((o1,o2) -> {
            return o1-o2;
        });
        Double[] dArray = {1.2, 4.5, 1.2, 1.0};
        Double[] zz;
        zz = new Double[10];
        ArrayList<Double> dd = new ArrayList();
        dd.add(1.2);
//        dArray[1] = 2.0;
//        dArray[2] = 1.2;
        HashMap<Double, Integer> treeMap = new HashMap<>();
        for(Double i:dArray)
        {
            if(treeMap.containsKey(i))
            {
                int count = treeMap.get(i) + 1;
                treeMap.put(i, count);
            }
            else treeMap.put(i, 1);
        }
//        for (Map.Entry<Double, Integer> entry : treeMap.entrySet()) {
//            if(entry.getValue() == 1)
//            {
//                System.out.println(entry.getKey()+" ");
//            }
//        }

        TreeMap<Double,Integer> sd = new TreeMap<>();
//        sd.entrySet()
        
        treeMap.forEach((k,v) -> {
            if(v == 1)
            {
                System.out.println(k);
            }
        });
        
        
//        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
//        // add elements to hashMap
//        hashMap.put(5, "Java");
//        hashMap.put(3, "C++");
//        hashMap.put(2, "PHP");
//        hashMap.put(4, "Python");
//        // hien thi HashMap
//        show(hashMap);
        
        HashMap<String, String> map = new HashMap<>();
        // them cac phan tu vao map
        map.put("J", "Java");
        map.put("C", "C++");
        map.put("P", "PHP");
        map.put("Py", "Python");
        // hien thi map
        System.out.println(map);
    }
    public static void show(HashMap<Integer, String> hashMap) {
        Set<Integer> keySet = hashMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " - " + hashMap.get(key));
        }
    }
    
}
