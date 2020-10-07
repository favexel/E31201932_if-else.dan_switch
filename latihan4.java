package pengenalanjava;

import java.util.Scanner;

public class latihan4 {
   public static void main(String[] args) {
        Scanner kode = new Scanner(System.in);
        System.out.print("Masukkan Huruf : ");
        String grade = kode.nextLine();



        switch(grade) {
            case "A" :
                System.out.println("4");
                break;
            case "B" :
                System.out.println("3");
                break;
            case "C" :
                System.out.println("2");
                break;
            case "D" :
                System.out.println("1");
                break;
            case "E" :
                System.out.println("0");
                break;
            default :
                System.out.println("Grade tidak ditemukan");
        }

    }
}