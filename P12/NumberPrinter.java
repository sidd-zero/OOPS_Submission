package P12;
// Problem Statement:
// Write a Java program that creates two threads:
// - The first thread should print numbers from 1 to 5.
// - The second thread should print numbers from 6 to 10.
// Ensure that both threads run concurrently.

class FirstThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
class SecondThread extends Thread {
    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
public class NumberPrinter {
    public static void main(String[] args) {
        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();

        t1.start(); // Start the first thread
        t2.start(); // Start the second thread
    }
}
