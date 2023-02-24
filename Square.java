package square;
import java.util.Scanner;
public class Square {
    public int sisiSquare;
        public void LSquare(){
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Panjang Sisi = ");
            sisiSquare = input.nextInt();
            System.out.println("L = s * s");
            System.out.println("  = "+sisiSquare+" * "+sisiSquare);
            System.out.println("K = 4 * s");
            System.out.println("  = 4 * "+sisiSquare);
            int LSquare = this.sisiSquare * this.sisiSquare;
            System.out.println("\nLuas Persegi     = "+LSquare+"cm");
            
        }
        public void KSquare(){
            int KSquare = this.sisiSquare * 4;
            System.out.println("Keliling Persegi = "+KSquare+"cm"+"\n\n");
        }   
    }