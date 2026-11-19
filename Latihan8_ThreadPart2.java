package TugasPraktikumPBO_P6;
class MultiTaskThread extends Thread {
    public MultiTaskThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Menjalankan " + getName() + " pada thread: " + Thread.currentThread().getName());
    }
}
public class Latihan8_ThreadPart2 {
    public static void main(String[] args) {
        int jumlahThread = 5; // Bisa diubah sesuai kebutuhan

        for (int i = 1; i <= jumlahThread; i++) {
            MultiTaskThread thread = new MultiTaskThread("Tugas-" + i);
            thread.start();
        }
    }
}
