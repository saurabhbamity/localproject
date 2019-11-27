package com.test.concurrency.semaphores;
class PrintingQueueJobHelper implements Runnable
{
   private PrinterQueue printerQueue;
 
   public PrintingQueueJobHelper(PrinterQueue printerQueue)
   {
      this.printerQueue = printerQueue;
   }
 
   @Override
   public void run()
   {
      System.out.printf("%s: Going to print a document\n", Thread.currentThread().getName());
      printerQueue.printJob(new Object());
   }
}