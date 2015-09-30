/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author mparish2
 */
public class Product {
    private String prodId;
    private String name;
    private double unitPrice;
    private DiscountStrategy discount;

    
       //---------------------Boss class of Discount (dicount is the abstraction and quatitiydiscount and percent off are the low level modules)--
    
    
    
    
    public Product(String prodId, String Name, double unitPrice, DiscountStrategy discount) {
        this.prodId = prodId;
        this.name = Name;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }
    
     public double getDiscountProductTotal( int quantity){
        return discount.getDiscountProductTotal(unitPrice,quantity);
    }

    public double getAmountSaved( int quantity){
        return discount.getAmountSaved(unitPrice, quantity);
    }
    
    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    public static void main(String[] args) {
        Product product = new Product("A100","Hat",20.00,new PercentOffDiscount(.10));
        double amountSaved= product.getAmountSaved(2);
        System.out.println("Expect 2.00, and got:" + amountSaved);
    }
    
}
