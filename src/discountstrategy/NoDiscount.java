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
public class NoDiscount implements DiscountStrategy {
    private int discountRate;

    public NoDiscount() {
    }
    
    @Override
    public double getAmountSaved(double unitPrice, int quantity) {
       return 0;
    }

    @Override
    public double getDiscountProductTotal(double unitPrice, int quantity) {
        return (unitPrice * quantity) - getAmountSaved(unitPrice,quantity);
    }

    @Override
    public double getDiscountRate() {
        return 0;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = 0;
    }
    
}
