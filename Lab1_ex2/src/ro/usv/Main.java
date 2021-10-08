//Modificati codul din slide-ul 32 (class Factorial) astfel incat sa verificati daca ce s-a introdus
//este un intreg (fara try; revedeti primele slide-uri).
package ro.usv;
import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        //declare a string value
        String s;
        //create a new scanner
        System.out.printf("Enter an integer value: ");
        Scanner kb = new Scanner(System.in);
        //hasNext() method Returns true if this scanner has another token in its input
        while(kb.hasNext())
        {
            //The nextInt() method of java.util.Scanner class scans the next token of the input as a Int.
            if(kb.hasNextInt())
            {
                System.out.println(kb.nextInt() + " is an integer");
                break;
            }else
            {
                //next() is a method of Java Scanner class which finds and returns the next complete token from the scanner which is in using
                System.out.println(kb.next()+ " Is not an integer");
                break;
            }
        }
    }
}