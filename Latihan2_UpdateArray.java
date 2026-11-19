package TugasPraktikumPBO_P6;

public class Latihan2_UpdateArray {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                mobil[i] = "Honda"; 
                System.out.println("Indeks " + i + " berhasil diubah menjadi: " + mobil[i]);
            }
        }
    }
}
