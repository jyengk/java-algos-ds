package multithread;

public class NumberPrinter implements Runnable{
    int i = Integer.MIN_VALUE;
    @Override
    public void run() {
        System.out.println("Printed by the " + Thread.currentThread().getName() + " value : " + i);
    }

    public NumberPrinter(int i) {
        this.i = i;
    }
}
