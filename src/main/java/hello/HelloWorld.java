package main.java.hello;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by chenzibin on 2017/9/7.
 */
public class HelloWorld {


    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 1;
            public void run() {
                System.out.println("hello world!!!!" + count++);
            }
        };
        int delay = 1*1000;
        int period = 5*1000;

        timer.schedule(task, delay, period);

    }
}
