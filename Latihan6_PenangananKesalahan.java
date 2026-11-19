package TugasPraktikumPBO_P6;
import java.util.Scanner;
public class Latihan6_PenangananKesalahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah bilangan: ");
            int n = Integer.parseInt(input.nextLine());
            double[] angka = new double[n];
            double jumlah = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                angka[i] = Double.parseDouble(input.nextLine());
                jumlah += angka[i];
            }

            double rataRata = jumlah / n;
            System.out.println("Rata-rata bilangan: " + rataRata);

        } catch (NumberFormatException e) {
            System.out.println("Error: Input harus berupa bilangan valid! (" + e.getMessage() + ")");
        } catch (NegativeArraySizeException | ArithmeticException e) {
            System.out.println("Error: Jumlah bilangan harus lebih dari 0.");
        }
    }
}
