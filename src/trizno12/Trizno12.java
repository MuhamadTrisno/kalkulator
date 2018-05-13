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
public class Trizno12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Kami sedang belajar java");
//        System.out.println("Jangan diganggu...!");
//        int jumlah;
//        jumlah = 10;
//        System.out.println("jumlah = " +jumlah);
//        String Nama ="Muhamad Trisno";
//        String Umur = "17";
//        String Alamat = "Kp. Sarongge";
//                
//        System.out.println("Nama Saya : " + Nama);
//        System.out.println("Alamat saya : " + Alamat);
//        System.out.println("Umur Saya : " + Umur);
//        System.out.println("saya erorr :v");

//        System.out.println("Kalkulator Penghitung Luas Trapesium");
//        
//        Scanner masuk = new Scanner(System.in);
//         int BC,AD,t,I,Jumlah;
//            System.out.print("Silahkan masukan nilai BC = ");
//         BC = masuk.nextInt();
//         
//            System.out.print("Silahkan masukan nilai AD = ");
//         AD = masuk.nextInt();
//         
//            System.out.print("Silahkan masukan nilai t = ");
//         t = masuk.nextInt();
//         
//         I = 2;
//         
//         Jumlah = (BC + AD) * t / + I ;
//         
//            System.out.println("HASIL = " + Jumlah);
//            System.out.println("Terima Kasih");
//            
//        System.out.println("Kalkulator Penghitung Keliling Trapesium");
//        
//        Scanner masuk = new Scanner(System.in);
//         int AB,BC,CD,DA,Jumlah;
//            System.out.print("Silahkan masukan nilai AB = ");
//         AB = masuk.nextInt();
//         
//            System.out.print("Silahkan masukan nilai BC = ");
//         BC = masuk.nextInt();
//         
//            System.out.print("Silahkan masukan nilai CD = ");
//         CD = masuk.nextInt();
//         
//            System.out.print("Silahkan masukan nilai DA = ");
//         DA = masuk.nextInt();
//         Jumlah = AB + BC + CD + DA;
//            System.out.println("HASIL = " + Jumlah);
//            System.out.println("Terima Kasih");
//            

// Scanner masuk = new Scanner(System.in);
//           int pil;
//           System.out.println("Masukan Pilihan ");
//           pil = masuk.nextInt();
//           
//           if (pil==1)
//               System.out.println("Jurusan Anda Android Programmer");
//            else if (pil==2)
//                System.out.println("Jurusan Web programmer");
//            else if (pil==3)
//                System.out.println("Network Engineer");
//            else if (pil==4)
//                System.out.println("Network System Administrator");
//            else if (pil==5)
//                System.out.println("Database Administrator");
//           else 
//                System.out.println("Pilihan Salah!!!");

        Scanner masuk = new Scanner(System.in);
        int pil;
          System.out.println("Masukan Pilihan ");
           pil = masuk.nextInt();
           switch (pil) {
               case 1:System.out.println("Jurusan Android programmer");break;
               case 2:System.out.println("Jurusan Web programmer");break;
               case 3:System.out.println("Jurusan Network engineer");break;
               case 4:System.out.println("Jurusan Network system administrator");break;
               case 5:System.out.println("Jurusan database administrator");break;
               default:System.out.println("Pilihan Salah!!!");
               break;
    }
           
    }
    
}
