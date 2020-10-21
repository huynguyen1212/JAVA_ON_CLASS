/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huynguyen
 */
public class Bai8String {
//    public static void main(String[] args) {
//        String myName = "Huy Nguyen";
//        String firstName = myName.substring(0, 3);
//        String lastName = myName.substring(4);
//        int lenth = myName.length(); // lấy độ dài chuỗi
//        
////        System.out.println(lenth);
////        System.out.println(firstName);
////        System.out.println(lastName);
//        
//        String firstString = "Hello ";
//        String secondString = "Huy Nguyen!";
//        String result = firstString + secondString;
//        System.out.println(result); // nối hai chuỗi
//    }

    /**
     * String là bất biến
     */
//    public static void main(String[] args) {
////        String firstName = "Nguyen ";           // đối tượng tên là firstName
////        String lastName = "Huy";                // đối tượng tên là lastName
////        firstName = firstName + lastName;       // đối tượng cũng tên là firstName nhưng có giá trị đc đổi khác
////        System.out.println(firstName);
//
//        String firstName = "Huy";
//        String secondName = "Huy";
//        String thirdName = "HUY";
//        String fourthName = "huy";
//
////          System.out.println(firstName == secondName);
////          System.out.println(firstName.equals(secondName)); // nên sử dụng
//        // nếu so sánh cả kí tự hoa và thường thì sd equals()
//        System.out.println(secondName.equals(fourthName));
//        System.out.println(firstName.equals(thirdName));
//        System.out.println(firstName.equals(fourthName));
//        
//        // nếu ss k quan trọng chũ hoa hay thường thì sd equalsIgnore()
//        System.out.println(secondName.equalsIgnoreCase(fourthName));
//        System.out.println(firstName.equalsIgnoreCase(thirdName));
//        System.out.println(firstName.equalsIgnoreCase(fourthName));
//        
//        String emptyString = "";
//        String nullString = null; // là null thì k thap tác đc
//    }
    // String API
//    public static void main(String[] args) {
//        String myName = "Huy Nguyen in HA Noi Viet Nam";
//
////        System.out.println(myName.toCharArray());   // chuyển sang mảng kí tự
////        System.out.println(myName.toUpperCase());   // viết hoa hết
////        System.out.println(myName.toLowerCase());   // viết thường hết
////        String res[] = myName.split(" ");     // myName đc tách(split) ra thành các từ khi gặp dấu cách đc lưu trong mảng res
////        for (String s: res)                         // s là các phần tử (các từ) trong res
////        {
////            System.out.println(s);
////        }
//        System.out.println(myName.startsWith("Huy"));   // kiểm tra chuỗi có bắt đầy bằng "Huy" hay k
//
//        System.out.println(myName.endsWith("m"));   // kiểm tra chuỗi có bắt đầy bằng "Huy" hay k
//
//    }
    /**
     * String Builder
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Huy ");
        stringBuilder.append("Nguyễn");
        stringBuilder.insert(4, "Quang ");
        //String name = stringBuilder.reverse().toString();
        String name = stringBuilder.toString();
        System.out.println(name);

        stringBuilder.replace(0, 1, "h");
        name = stringBuilder.toString();
        System.out.println(name);
    }
}
