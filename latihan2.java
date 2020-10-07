package pengenalanjava;
import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        int nilai;
        Scanner scan = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        nilai = scan.nextInt();
        if (nilai >=0 && nilai <=55 ){
            System.out.println("E");
        }
        else if (nilai >=55 && nilai <=65){
            System.out.println("D");
        }
        else if (nilai >=65 && nilai <=75){
            System.out.println("C");
        }
        else if (nilai >=75 && nilai <=85){
            System.out.println("B");
        }
        else if (nilai >=85 && nilai <=100){
            System.out.println("A");
        }
        else {
            System.err.println(" ERROR ");
        }
        
            
        }
                
    }
    

