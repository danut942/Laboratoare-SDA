package ro.usv;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        float x=0;
        float y=0;
        Punct pt = new Punct(x,y);
        BufferedReader br = new BufferedReader(new FileReader("D:\\Facultate_2021_2022\\SDA\\Laboratoare-SDA\\Lab1_ex5\\src\\ro\\usv\\in.txt"));
        String line;
        String noOfPoints;
        String [] a = {};
        float PerimetruPoligon = 0;
        boolean first= true;

        while((line=br.readLine())!=null){
            if(first){
                noOfPoints=line;
                System.out.println("Nr de laturi:" + noOfPoints+"\n");
                first = false;
            } else {
                a = line.split(" ");
                x=Float.parseFloat(a[0]);
                y=Float.parseFloat(a[1]);
                Punct pt2 = new Punct(x,y);
                System.out.println(pt2);
                System.out.println(pt.distanta(pt2));
                PerimetruPoligon+=pt.distanta(pt2);
                System.out.println(PerimetruPoligon);
            }
        }
    }
}
