
import java.util.Scanner;

public class RataNilai23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float nilai, rataNilai;

        int i = 1;
        while (i <= 5) {
            int totalNilai = 0;

            System.out.println("Input nilai mahasiswa ke-" + i);

            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " : ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;

            System.out.println("Rata - rata nilai mahasiswa ke-" + i + " adalah : " + rataNilai);
            i++;
        }
    }
}
