package kr.ft.seoul.App;

import kr.ft.seoul.App.Counter.*;
import java.lang.Thread;


class routineThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(CounterSingletonLazyHolder.getInstance().getCount() + " ");
        }
    }
}

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        for (int i = 0; i < 100; i++) {
            routineThread thread = new routineThread();
            thread.start();
        }
    }
}