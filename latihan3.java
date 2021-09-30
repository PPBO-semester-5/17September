import java.util.Scanner;

public class latihan3 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        double Harga;
        double HargaJual;
        char Pilihan;
        double Cicilan;
        double Disc;

        System.out.println("\nPENJUALAN MOTOR");
        System.out.println("---------------\n");

        System.out.println("Harga Motor : ");
        Harga = input.nextInt();

        System.out.println("Jual Tunai (Y/N) : ");
        Pilihan = input.next().charAt(0);

        if (Pilihan == 'Y'){
            Disc = Harga * 0.05;
            HargaJual = Harga - Disc;
            System.out.print("Harga jual: " + HargaJual);
        }
        else {
            Cicilan = (Harga +  (Harga * 0.2)) / 12;
            System.out.println("Cicilan Perbulan : " + Cicilan);
        }
    }
}