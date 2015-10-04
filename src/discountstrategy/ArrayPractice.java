/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author alancerio18
 */
public class ArrayPractice {

    public static void main(String[] args) {
        String[] name = new String[0];
        String[] temp = new String[name.length + 1];
        for (int i = 0; i < name.length; i++) {
            temp[i] = name[i];
        }
        temp[temp.length - 1] = "bob";
        name = temp;
        temp = null;
    }
}
