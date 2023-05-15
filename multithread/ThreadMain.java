package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadMain {

    public static void main (String[] args) {
        System.out.println("Hello there!! In the main Thread!!");
        HelloWorldPrinter hp = new HelloWorldPrinter();// Created a task
        Thread t = new Thread(hp);// create an instance of thread and pass the task to the thread
        //1. Creates an OS thread. This is the thread handed over the OS
        //2. Thread knows about the task from #8
        //3. Thread creted calls the hp.run()
        t.start();



        for (int i=1; i<=100;i++) {
            NumberPrinter np = new NumberPrinter(i);
            Thread npt = new Thread(np);
            npt.start();
        }

        ExecutorService e = Executors.newFixedThreadPool(10);
        for (int i=1; i<=100;i++) {
            NumberPrinter np = new NumberPrinter(i);
            Thread npt = new Thread(np);
            npt.start();
        }

    }
}
