package ro.usv;

import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Facultate_2021_2022\\Laboratoare\\out.txt"));
        BufferedReader br = new BufferedReader(new FileReader("D:\\Facultate_2021_2022\\Laboratoare\\out.txt"));
        bw.write("test\n");
        bw.write("test2\n");
        bw.write("test3\n");
        bw.close();

        String s;
        while ((s = br.readLine())!=null)
            System.out.println(s);
    }
}
