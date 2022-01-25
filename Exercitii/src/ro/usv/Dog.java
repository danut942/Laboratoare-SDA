package ro.usv;

public abstract class Dog {
        String breed;

        public void bark(){
            System.out.println("Bark !");
        }
        public abstract void poop();
}
