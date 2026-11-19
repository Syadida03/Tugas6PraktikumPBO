package TugasPraktikumPBO_P6;
class WorkerThread extends Thread {
    private String namaThread;

    public WorkerThread(String namaThread) {
        this.namaThread = namaThread;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(namaThread + " sedang berjalan - iterasi ke-" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(namaThread + " terganggu.");
            }
        }
    }
}
public class Latihan7_Thread {
    public static void main(String[] args) {
        WorkerThread t1 = new WorkerThread("Thread-Anak-1");
        t1.start(); // Memulai eksekusi thread baru
    }
}
