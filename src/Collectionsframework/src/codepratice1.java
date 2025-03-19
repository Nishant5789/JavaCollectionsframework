package Collectionsframework.src;

import java.util.*;

public class codepratice1 {
    public static void main(String[] args) {
//        String s = new String("Hello");
//        List<String> list = new ArrayList<>();
//        list.add(s);
//        list.add(new String("Hello"));
//        list.add(s);
//        s.replace("l", "L");
//        System.out.println(list);

//        StringBuilder sb = new StringBuilder("Java");
//        String s1 = sb.toString();
//        String s2 = sb.toString();
//
//        System.out.println(s1 == s2);
//        System.out.println("Bye");
//        while () {
//            System.out.println(100);
//        }
//        System.out.println("Bye");
//        String s1 = "OCAJP";
//        String s2 = "OCAJP" + "";
//        System.out.println(s1 == s2);

        List<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(2));
        list.add(new Integer(1));
        list.add(new Integer(0));

        list.remove(list.indexOf(0));

        System.out.println(list);





    }
}
