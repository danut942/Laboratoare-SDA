package ro.usv;

public class Main {
    public static void main(String[] args) {
        EcuatieGrad1 ec = new EcuatieGrad1(7,10);
        EcuatieGrad1 ec2 = new EcuatieGrad1(13,9);
        EcuatieGrad1 ec3 = new EcuatieGrad1(10,7);

        System.out.println(ec);
        ec.rezolva();
        System.out.println(ec2);
        ec2.rezolva();
        System.out.println(ec3);
        ec3.rezolva();
    }
}
