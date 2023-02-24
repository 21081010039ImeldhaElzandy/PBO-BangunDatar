package square;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        
        while (pilihan != 5) {
        System.out.println("----------------------------------------");
        System.out.println("\tMENU HITUNG BANGUN DATAR\t");
        System.out.println("----------------------------------------");
        System.out.println("1. PERSEGI / SQUARE");
        System.out.println("2. PERSEGI PANJANG / RECTANGLE");
        System.out.println("3. LINGKARAN / CIRCLE");
        System.out.println("4. OVAL / ELIPS");
        System.out.println("5. KELUAR");
        System.out.print("Pilihan Anda = ");
        pilihan = input.nextInt();
        System.out.println("----------------------------------------");
        System.out.println("");
        
        switch(pilihan) {
            case 1:
                Square persegi = new Square();
                persegi.LSquare();
                persegi.KSquare();
                break;
            case 2:
                Rectangle persegiPanjang = new Rectangle();
                persegiPanjang.LRectangle();
                persegiPanjang.KRectangle();
                break;
            case 3:
                Circle lingkaran = new Circle();
                lingkaran.LCircle();
                lingkaran.KCircle();
                break;
            case 4:
                Elips oval = new Elips();
                oval.LElips();
                oval.KElips();
                break;
            case 5:
                System.out.println("TERIMAKASIH");
                break;
            default :
                System.out.println("PILIHAN YANG ANDA PILIH SALAH");
                break;
        }
    }
}
}