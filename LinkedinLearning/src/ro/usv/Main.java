package ro.usv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int studentAge = 15;
        double studentGPA = 3.45;

        boolean perfectAttendance = true;
        String studentFirstName = "Keila ";
        String studentLastName = "Hannon";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentFirstName + "  "+ studentLastName);
        System.out.println(studentFirstInitial + "  "+ studentLastInitial + " "+ studentGPA);
        System.out.println("Do you want to change the GPA of the student?");

        Scanner s = new Scanner(System.in);
        studentGPA = s.nextDouble();
        System.out.println(studentFirstName + "  "+ studentLastName+ " "+ studentGPA);


    }
}
