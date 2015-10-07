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
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CashRegister cR = new CashRegister();

        // Customer 1
        cR.startSale("300", new FakeDataBase());
        cR.addItem("B205", 2);
        cR.addItem("A101", 1);
        cR.endSaleAndDisplayReciept();

        // Customer 2
        cR.startSale("100", new FakeDataBase());
        cR.addItem("C222", 4);
        cR.addItem("B205", 6);
        cR.endSaleAndDisplayReciept();
    }
}


