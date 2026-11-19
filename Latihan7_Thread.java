package TugasPraktikumPBO_P6;
// 1. Kelas baru yang mewarisi Thread
class TugasThread extends Thread {

    // 2. Mendefinisikan ulang (override) method run()
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread baru sedang jalan - hitungan ke-" + i);
            try {
                Thread.sleep(500); // jeda 0,5 detik agar terlihat prosesnya
            } catch (InterruptedException e) {
                System.out.println("Thread terganggu");
            }
        }
    }
}
public class Latihan7_Thread {
    public static void main(String[] args) {
        // 3. Membuat objek dari kelas pewaris Thread
        TugasThread t1 = new TugasThread();

        // 4. Memanggil start() untuk memulai eksekusi thread baru
        t1.start();

        System.out.println("Pesan ini dicetak dari thread utama (main)");
    }
}
