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
public interface DatabaseAccessStrategy {
    Customer locateCustomer (final String custId) ;
    
    Product locateProduct (String prodId);
}
