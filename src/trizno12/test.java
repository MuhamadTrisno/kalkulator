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
public class test {
       public static void main(String args[]){
           Scanner masuk = new Scanner(System.in);
           int bil;
           System.out.println("Masukan bilangan = ");
           bil = masuk.nextInt();
           
           if (bil==0)
               System.out.println("Bilangan Nol");
           else
               System.out.println("Bilangan Bukan Nol");
       }
}
 
