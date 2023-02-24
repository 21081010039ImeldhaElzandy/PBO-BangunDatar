package square;
import java.util.Scanner;
public class Rectangle {
    public int panjangRectangle;
    public int lebarRectangle;
        public void LRectangle(){
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Panjang = ");
            panjangRectangle = input.nextInt();
            System.out.print("Masukkan Lebar   = ");
            lebarRectangle = input.nextInt();
            System.out.println("L = p * l");
            System.out.println("  = "+panjangRectangle+" * "+lebarRectangle);
            System.out.println("K = 2 * (p + l)");
            System.out.println("  = 2 * ("+panjangRectangle+" + "+lebarRectangle+")");
            int LRectangle = this.panjangRectangle * this.lebarRectangle;
            System.out.println("\nLuas Persegi Panjang     = "+LRectangle+"cm");
        }
        public void KRectangle(){
            int KRectangle = 2 * (this.panjangRectangle + this.lebarRectangle);
            System.out.println("Keliling Persegi Panjang = "+KRectangle+"cm"+"\n\n");
        }
}