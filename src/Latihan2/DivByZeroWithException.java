/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author GET THE FUCK OUT
 */
public class DivByZeroWithException {
    public static void main(String args[]){
        try{
            System.out.println(5/0);
            System.out.println("Keluaran progam");
        }
        catch(ArithmeticException exc){
           System.out.println("Exception yang ditangkap :"+exc);
        }
        System.out.println("Setelah exception");
    }
}
