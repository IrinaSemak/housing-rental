public class Apartment {
    private String address;
    private double price;
    private double area;

    public Apartment(String address, double price, double area) {
        this.address = address;
        this.price = price;
        this.area = area;
    }

    public String getAddress() { return address; }
    public double getPrice() { return price; }
    public double getArea() { return area; }
}