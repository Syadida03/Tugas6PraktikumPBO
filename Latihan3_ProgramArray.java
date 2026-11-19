package TugasPraktikumPBO_P6;
import java.util.Arrays;
import java.util.Scanner;
public class Latihan3_ProgramArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a. Masukkan jumlah elemen array 1 dimensi
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int[] data = new int[n];

        // b. Masukkan nilai elemen sesuai jumlahnya
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai indeks ke-" + i + ": ");
            data[i] = input.nextInt();
        }

        // c. Nilai terbesar & terkecil beserta posisi indeksnya
        int max = data[0], idxMax = 0;
        int min = data[0], idxMin = 0;
        int total = 0;
        int jumlahIndeksGanjil = 0; // untuk NPM genap (poin e)

        for (int i = 0; i < n; i++) {
            if (data[i] > max) {
                max = data[i];
                idxMax = i;
            }
            if (data[i] < min) {
                min = data[i];
                idxMin = i;
            }
            // d. Total semua elemen
            total += data[i];

            // e. NPM genap: jumlahkan elemen yang berindeks ganjil (1, 3, 5, ...)
            if (i % 2 != 0) {
                jumlahIndeksGanjil += data[i];
            }
        }

        double rataRata = (double) total / n;

        System.out.println("\n--- Hasil ---");
        System.out.println("Nilai terbesar: " + max + " di indeks ke-" + idxMax);
        System.out.println("Nilai terkecil: " + min + " di indeks ke-" + idxMin);
        System.out.println("Jumlah semua data: " + total);
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Jumlah elemen berindeks ganjil (NPM Genap): " + jumlahIndeksGanjil);

        // g. Cek ganjil/genap dari hasil langkah e
        if (jumlahIndeksGanjil % 2 == 0) {
            System.out.println("Hasil penjumlahan indeks ganjil (" + jumlahIndeksGanjil + ") adalah GENAP.");
        } else {
            System.out.println("Hasil penjumlahan indeks ganjil (" + jumlahIndeksGanjil + ") adalah GANJIL.");
        }

        // h. Urutkan elemen array (ascending)
        int[] sortedData = Arrays.copyOf(data, data.length);
        Arrays.sort(sortedData);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(sortedData));
    }
}
