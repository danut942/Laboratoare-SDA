package ro.usv;

public interface Series {
    int max = 10;
    String Error = "Limit was reached" + max;
    int getNext();

    default void printStuff(){
        System.out.println("live from NY!!");
        printMoreStuff();
    }

    private void printMoreStuff(){
        System.out.println("print more stuff");
    }
}
