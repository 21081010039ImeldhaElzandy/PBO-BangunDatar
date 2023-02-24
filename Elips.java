package square;
import java.util.Scanner;
public class Elips {
    public double panjangElips;
    public double pendekElips;
        public void LElips() {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Sisi Panjang = ");
            panjangElips = input.nextInt();
            System.out.print("Masukkan Sisi Pendek  = ");
            pendekElips = input.nextInt();
            System.out.println("L = 1/2 * phi * (Sisi Panjang * Sisi Pendek)");
            System.out.println("  = 1/2 * phi ("+panjangElips+" * "+pendekElips+")");
            System.out.println("K = 1/2 * phi * (Sisi Panjang + Sisi Pendek)");
            System.out.println("  = 1/2 * phi * ("+panjangElips+" + "+pendekElips+")");
            double LElips = Math.PI * this.panjangElips * this.pendekElips / 2;
            System.out.println("\nLuas Oval     = "+LElips+"cm");
        }
        public void KElips() {
            double KElips = Math.PI * (this.panjangElips + this.pendekElips) / 2;
            System.out.println("Keliling Oval = "+KElips+"cm"+"\n\n");
        }
}