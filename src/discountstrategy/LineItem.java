/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Matthew_2
 */
public class LineItem {
    private int prodQty;
    private Product product;        

    public LineItem(int prodQty, Product product) {
        this.prodQty = prodQty;
        this.product = product;
    }

    public int getProdQty() {
        return prodQty;
    }

    public Product getProduct() {
        return product;
    }
    //--------------------Line item is the boss class of product---------------------------------------------------------------
    public String getProductId(){
        return product.getProdId();
    }
    public String getName(){
        return product.getName();
    }
    public double getUnitPrice(){
        return product.getUnitPrice();
    }

    
    
     //-----------------------------------------------------------------------------------
    public void setProdQty(int prodQty) {
        this.prodQty = prodQty;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
     
    
    public static void main(String[] args) {
        LineItem item1 = new LineItem(2,new Product("A100","Hat",20.00,new PercentOffDiscount(.10)));
        
        System.out.println(item1.getProductId() + " " + item1.getName()  + " " +  item1.getProdQty() + " " + item1.getUnitPrice() + " " );
    }
    
    
    
}
