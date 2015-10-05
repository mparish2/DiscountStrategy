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
public class Reciept {
   DatabaseAccessStrategy db = new FakeDataBase();
    
   private Customer [] cust;
   
   private Product [] p;
   
   private LineItem [] li;

    public Customer[] getCust() {
        return cust;
    }

    public void setCust(Customer[] cust) {
        this.cust = cust;
    }

    public Product[] getP() {
        return p;
    }

    public void setP(Product[] p) {
        this.p = p;
    }

    public LineItem[] getLi() {
        return li;
    }

    public void setLi(LineItem[] li) {
        this.li = li;
    }
   
   
   
} 