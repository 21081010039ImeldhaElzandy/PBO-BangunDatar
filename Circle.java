package square;
import java.util.Scanner;
public class Circle {
    public double jariCircle;
        public void LCircle() {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Jari - jari = ");
            jariCircle = input.nextInt();
            System.out.println("L = phi * r * r");
            System.out.println("  = phi * "+jariCircle+" * "+jariCircle);
            System.out.println("K = 2 * phi * r");
            System.out.println("  = 2 * phi * "+jariCircle);
            double LCircle = Math.PI * this.jariCircle * this.jariCircle;
            System.out.println("\nLuas Lingkaran     = "+LCircle+"cm");
                
        }
        public void KCircle() {
            double KCircle = 2 * Math.PI * this.jariCircle;
            System.out.println("Keliling Lingkaran = "+KCircle+"cm"+"\n\n");
        }
}