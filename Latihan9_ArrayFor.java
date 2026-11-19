package TugasPraktikumPBO_P6;

public class Latihan9_ArrayFor {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        // Cara 1: for loop standar
        System.out.println("Menggunakan for loop:");
        for (int i = 0; i < age.length; i++) {
            System.out.println("Indeks " + i + " = " + age[i]);
        }

        // Cara 2: enhanced for loop (for-each)
        System.out.println("\nMenggunakan for-each:");
        for (int nilai : age) {
            System.out.println("Nilai = " + nilai);
        }
    }
}
