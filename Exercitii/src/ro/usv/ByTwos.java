package ro.usv;

public class ByTwos implements Series {
    int val;

    ByTwos(){
        val=0;
    }

    public int getNext() {
        if (val >= max)
            System.out.println(Error);
        else
            val +=2;
        return val;
    }
//    public void printStuff(){
//        System.out.println("I am b2 stuff");
//    }
}
