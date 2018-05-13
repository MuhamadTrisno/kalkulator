/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trizno12;

import java.util.Scanner;

/**
 *
 * @author Trizno
 */
public class DecimaltoBinary {
        public String toBinary(int n) {
        if (n == 0) {
            return "0";
        }
    String binary = "";
    while (n > 0) {
        int rem = n % 2;
        binary = rem + binary;
        n = n / 2;
    }
    System.out.println("nilai biner nya adalah : " + binary);

    return binary;
    }
        
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("masukan nilai = ");
            int decimal = scanner.nextInt();
            
            DecimaltoBinary dtb = new
            DecimaltoBinary();
            String binary = dtb.toBinary(decimal);
            System.out.println("hasil nilainya = " + binary);
    }
        
}
