package org.example.thread;

/**
 * @author 徐帆
 * @date 2022/12/20
 */
/**
 * 多线程的四种实现方式之一：通过继承 Thread 类
 * 三个要注意的地方：
 * 1.start() 会新开启一个线程执行；run() 不会新开线程，它只是主线程中的一个任务而已。两者执行的都是 run() 的代码。
 * 2.怎么看是否实现了多线程：如果 myThread 调用的是 start()，那么打印结果将会让主线程和子线程穿插在一起；如果 myThread 调用的是 run()，那么打印结果永远是子线程执行完毕后，主线程再执行；
 * 3.子线程的代码需要放在主线程的上面，否则主线程的无论在子线程上下的代码都会先执行然后执行子线程代码。原因和操作系统接收到指令有关。
 */
public class ThreadDemo01 {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行代码：" + i);
        }

        Thread myThread = new MyThread();
        myThread.start();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程执行代码：" + i);
        }
    }
}
