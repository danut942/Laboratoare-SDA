package ro.usv;

public class Main {
    public static void main(String[] args) {
        Punct pt = new Punct(0,0);
        Punct pt2 = new Punct(3,4);
        System.out.println(pt);
        System.out.println(pt2);
        System.out.println(pt.distanta(pt2));
    }
}
