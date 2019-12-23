package com.jetbrains;
//Created By Lakshman on 2/27/2019

class Personn {
    protected String name;
    protected String id;

    public Personn(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

class Customers extends Personn {
    private String address;

    public Customers(String name, String id, String address) {
        super(name, id);
        this.address = address;
    }


    public String getAddress() {
        return address;
    }

    public void customerInfo() {
        System.out.println("Customer Name : " + super.name);
        System.out.println("Customer ID : " + super.id);
        System.out.println("Customer Address : " + this.address);
        System.out.println();
    }
}

class SelesPersons extends Personn {
    public SelesPersons(String name, String id) {
        super(name, id);
    }


    public void selesPersonsInfo() {
        System.out.println("SelesPersons Name : " + super.name);
        System.out.println("SelesPersons ID : " + super.id);
        System.out.println();
    }
}

class Products {
    private String produtsId;
    private String productName;
    private double productPrice;
    private boolean productAvailability;

    public Products(String produtsId, String name, double price, boolean availability) {
        this.produtsId = produtsId;
        this.productName = name;
        this.productPrice = price;
        this.productAvailability = availability;
    }

    public String getProdutsId() {
        return produtsId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public boolean isProductAvailability() {
        return productAvailability;
    }

    public void productsInfo() {
        System.out.println("Product ID : " + this.produtsId);
        System.out.println("Product Name : " + this.productName);
        System.out.println("Product Price : " + this.productPrice);
        System.out.println("Product Available : " + this.productAvailability);
        System.out.println();
    }
}

class Payment {
    private double totalPurchasePrice;
    private String customerType;
    private double tax = 0.02;
    private double discount;
    private Products pr;
    private double needToPay;
    private double totalTax;
    private double totalDiscunt;

    public Payment(double totalPurchasePrice, String customerType, Products pr) {
        this.totalPurchasePrice = totalPurchasePrice;
        this.customerType = customerType;
        this.pr = pr;
        if (!this.pr.isProductAvailability()) {
            System.out.println("Products not available.");
        } else {
            if (customerType.equalsIgnoreCase("regular")) {
                this.discount = 0;
                this.totalTax = this.totalPurchasePrice * this.tax;
                this.needToPay = this.totalPurchasePrice + this.totalTax;

            } else {
                this.discount = 0.05;
                this.totalTax = this.totalPurchasePrice * this.tax;
                this.totalDiscunt = this.totalPurchasePrice * this.discount;
                this.needToPay = (this.totalPurchasePrice + this.totalTax) - this.totalDiscunt;
            }
            paymentInfo();
        }
    }

    public void paymentInfo() {
        System.out.println("Customer Type : "+ this.customerType);
        System.out.println("Purchase Price : " + this.totalPurchasePrice);
        System.out.println("Tax(2%) : " + this.totalTax);
        System.out.println("Discount : " + this.totalDiscunt);
        System.out.println("Total Price : " + this.needToPay);
        System.out.println();
    }
}

public class AgoraSuperStore {
    public static void main(String[] args) {

        SelesPersons sp = new SelesPersons("Liton", "147-55");
        sp.selesPersonsInfo();

        Customers customers = new Customers("Farhan", "158-58", "Dhaka");
        customers.customerInfo();

        Products pr = new Products("11", "Wheat", 400.99, true);
        pr.productsInfo();

        Payment payment = new Payment(1500, "member", pr);
    }
}
