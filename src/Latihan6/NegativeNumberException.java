/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan6;

/**
 *
 * @author GET THE FUCK OUT
 */
class NegativeNumberException extends Exception {
       private int bilangan;

    NegativeNumberException() {
    }
    NegativeNumberException(String message) {
    super(message);
    }

    public NegativeNumberException(int bilangan, String message) {
        super(message);
        this.bilangan = bilangan;
    }
    public int getBilangan(){
        return bilangan;
    }
    
}

