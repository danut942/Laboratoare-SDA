package ro.usv;

public class laptop implements Comparable<laptop>{
    public laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int ram;
    private int price;

    @Override
    public int compareTo(laptop lap2) {
        if(this.getRam()> lap2.getRam())
            return 1;
        else
            return -1;
    }
}
