
import java.util.Scanner;

public class Tugas2_23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jumlahAtlet = 5;
        String namaAtlet;

        System.out.print("Masukkan jumlah politeknik yang daftar : ");
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= jumlahPoliteknik; i++) {
            System.out.println("");
            System.out.println("Politeknik ke - " + i);

            System.out.println("Cabang Olahraga : Badminton");
            for (int j = 1; j <= jumlahAtlet; j++) {
                System.out.print("Nama atlet " + j + " : ");
                namaAtlet = sc.nextLine();
            }

            System.out.println("Cabang Olahraga : Tenis Meja");
            for (int j = 1; j <= jumlahAtlet; j++) {
                System.out.print("Nama atlet " + j + " : ");
                namaAtlet = sc.nextLine();
            }

            System.out.println("Cabang Olahraga : Bola Basket");
            for (int j = 1; j <= jumlahAtlet; j++) {
                System.out.print("Nama atlet " + j + " : ");
                namaAtlet = sc.nextLine();
            }

            System.out.println("Cabang Olahraga : Bola Voli");
            for (int j = 1; j <= jumlahAtlet; j++) {
                System.out.print("Nama atlet " + j + " : ");
                namaAtlet = sc.nextLine();
            }
        }
    }
}
