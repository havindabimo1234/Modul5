/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author GET THE FUCK OUT
 */
public class DemoThrows2 {
    public static void uji(int angka)throws NullPointerException,ArithmeticException{
    if (angka < 0){
        throw new NullPointerException("Kesalahan: null pointer exception");
    }else{
        throw new ArithmeticException("Kesalahan : arithmetic exception");
    }    
    }
    public static void main(String[] args){
        try{
            uji(0);
        }catch(Exception e){
            System.out.println("Exception ditangkap disini ....");
            System.out.println(e.getMessage());
        }
        System.out.println("Statemen setelah blok try-catch");
    }
}
