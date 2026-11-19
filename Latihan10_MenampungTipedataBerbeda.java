package TugasPraktikumPBO_P6;
import java.util.ArrayList;
public class Latihan10_MenampungTipedataBerbeda {
    public static void main(String[] args) {
        ArrayList<Object> dataCampuran = new ArrayList<>();
        dataCampuran.add(19);
        dataCampuran.add(0.2);
        dataCampuran.add('C');
        dataCampuran.add("Java");
        dataCampuran.add(true);

        System.out.println("Isi data: " + dataCampuran);
        for (int i = 0; i < dataCampuran.size(); i++) {
            System.out.println("Elemen ke-" + i + " = " + dataCampuran.get(i));
        }
    }
}
