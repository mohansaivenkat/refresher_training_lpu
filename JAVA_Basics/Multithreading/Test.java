package Multithreading;

public class Test {

    public static void main(String[] args) {

        MusicApp app = new MusicApp();

        Thread t1 = new Thread(() -> {
            app.play();
        });

        Thread t2 = new Thread(() -> {
            app.stop();
        });

        t1.start();
        t2.start();
    }
}
