package TugasPraktikumPBO_P6;

public class Latihan1_VariasiSyntax {
    public static void main(String[] args) {
        // Variasi 1
        int[] arr1 = new int[3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        // Variasi 2
        int[] arr2 = {10, 20, 30};

        // Variasi 3
        int[] arr3 = new int[]{10, 20, 30};

        System.out.println("Variasi 1 indeks 0: " + arr1[0]);
        System.out.println("Variasi 2 indeks 1: " + arr2[1]);
        System.out.println("Variasi 3 indeks 2: " + arr3[2]);
    }
}
