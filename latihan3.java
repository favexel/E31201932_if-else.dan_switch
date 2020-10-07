package pengenalanjava;
import java.util.Scanner;
public class latihan3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        // nama
        System.out.print("masukkan nama = ");
        String nama = scan.nextLine();
        
        // jenis kelamin
        System.out.print("jenis kelamin = ");
        String jenis_kelamin = scan.nextLine();
        
        //tinggi badan 
        System.out.print("tinggi badan = ");
        int tinggi_badan = scan.nextInt();
        
        if (jenis_kelamin.equals("laki-laki") && tinggi_badan >= 171 && tinggi_badan <= 230){
            System.out.println("selamat anda lulus");
        }
       
        else if (jenis_kelamin.equals("perempuan") && tinggi_badan >= 161 && tinggi_badan <= 210){
            System.out.println("selamat anda lulus");
        }
        else {
            System.out.println("anda gagal");
        }
    
    }
    
}