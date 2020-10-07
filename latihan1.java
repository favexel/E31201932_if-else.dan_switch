package pengenalanjava;
import java.util.Scanner;
public class latihan1 {
 public static void main(String[] args) {
        //buat Scanner
        Scanner inp = new Scanner (System.in);
        
        //Ambil Nama
        System.out.print("masukkan Nama = ");
        String nama = inp.nextLine();
        
        //Ambil NIM
        System.out.print("masukkan Nim = ");
        String nim = inp.nextLine();
        
        //Ambil Nilai
        System.out.print("masukkan Nilai = ");
        int nilai = inp.nextInt();
        
        //Print
        if (nilai >=75){
            System.out.println(" selamat anda lulus");
        }
        else
        { System.out.println("anda tidak lulus ");
        
             }
        }
   }
