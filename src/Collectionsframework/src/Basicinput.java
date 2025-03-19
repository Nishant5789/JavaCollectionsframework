package Collectionsframework.src;

import java.util.Scanner;

public class Basicinput {
    public static void main(String[] args) {
        parent ob = new child();
        ob.excute();
    }
}

class parent {
    private void call(){
        System.out.println("parent");
    }
    public void excute(){
//        System.out.println();
        call();
    }
}

class  child extends parent
{
    public void call(){
        System.out.println("child");
    }
}