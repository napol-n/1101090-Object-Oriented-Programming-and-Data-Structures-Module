package shop;

import java.util.Scanner;

public class Command {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// รับข้อมูลลูกค้า
        System.out.print("Enter your customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter your discount percentage: ");
        double discount = scanner.nextDouble();

// ล้างค่าออก
        scanner.nextLine();

// รับข้อมูลสินค้า
        System.out.print("Enter an ordered product: ");
        String productName = scanner.nextLine();
        System.out.print("Enter the product price: ");
        double price = scanner.nextDouble();

// สร้างวัตถุ
        Customer customer = new Customer(customerName, discount);
        Product product = new Product(productName, price);
        Order order = new Order(customer, product);

// คำนวณราคา
        double discountedPrice = price * (1 - discount / 100);

// แสดงผลลัพธ์
        System.out.printf("%s orders %s with price %.2f Baht.\n",
                order.getCustomer().getName(), order.getProduct().getName(), discountedPrice);

    }
}