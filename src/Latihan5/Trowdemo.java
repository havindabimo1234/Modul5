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
public class Trowdemo {
      public static void main(String[] args) {
        DataMhs obj = new DataMhs();
        obj.SetNim("101533402134");
        obj.setNama("bimo");
        obj.setNilai(80);
        
        System.out.println("NIM : " + obj.getNim());
        System.out.println("Nama : " + obj.getNama());
        System.out.println("Nilai : " + obj.getNilai());
        
    }
}

