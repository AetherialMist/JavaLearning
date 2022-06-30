package aetherial;

public class Scope {

    public static void main(String[] args) {
        int x = 12;
        int y;
        {
            y = 45;
            System.out.println(x + y);
        }
        System.out.println(x + y);
        print(4);
    }

    public static void print(Object x) {
        System.out.println(x);
        System.out.println(x.getClass());
    }

}