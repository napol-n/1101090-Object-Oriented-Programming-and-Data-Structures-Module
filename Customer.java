package shop;

class Customer {

    private String name;
    private double discount;

    public Customer(String name, double discount) {
        this.name = name;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }
}