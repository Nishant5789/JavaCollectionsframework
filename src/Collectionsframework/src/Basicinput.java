package Collectionsframework.src;

import java.util.Scanner;

public class Basicinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("type  the int");
        Integer i = Integer.parseInt(sc.nextLine());
        System.out.println(i);

        String str = sc.nextLine();
        System.out.println(str);
    }
}
