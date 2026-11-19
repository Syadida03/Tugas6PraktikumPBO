package TugasPraktikumPBO_P6;

public class Latihan10_MenampungTipedataBerbeda {
    public static void main(String[] args) {
        Object[] campuran = {19, 0.2, 'C', "Java", true};

        for (int i = 0; i < campuran.length; i++) {
            System.out.println("Elemen ke-" + i + ": " + campuran[i] +
                               " (Tipe: " + campuran[i].getClass().getSimpleName() + ")");
        }
    }
}
