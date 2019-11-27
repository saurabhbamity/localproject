package com.test.mutithrading;

public class WaitExample13 {

    public static void main(String[] args) {

        MyThreadSum1000Number mt = new MyThreadSum1000Number();
        mt.start();

        synchronized (mt) {
            try {
                /*
                 * called sleep is time consuming as we are not sure how much
                 * time the child thread will take to exucute run method.
                 */
                // Thread.currentThread().sleep(1000);

                /*
                 * called join will also execute the all code exist on run
                 * method, regardless to know once sum completed some main
                 * thread is waiting for to show the result to customer.
                 */
                // mt.join();
                System.out.println("inside main , before wait call on object mt1000Numbersum");
                mt.wait();

            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //join will guarantee that main will finish first
        try {
            mt.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("main Thread : count of sum of numbers: "+mt.sumNumber);

    }

}

class MyThreadSum1000Number extends Thread {
    int sumNumber = 0;

    public void run() {
        synchronized (this) {

            for (int i = 0; i <= 1000; i++) {
                sumNumber = sumNumber + i;
            }
            this.notify();
            // from here onward two thread are running samultaniously. main and MyThreadSum1000Number
            // so put child thread in sleep to finish main Thread rest execution, child contain long process 
            // 20 min process , so letting the main thread finish first
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(
                "huge code lie here that take around 20 min to get executed");
    }
}
