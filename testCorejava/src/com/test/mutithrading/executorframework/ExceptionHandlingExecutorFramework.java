package com.test.mutithrading.executorframework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ExceptionHandlingExecutorFramework {

	public static void main(String[] args) {

		// bad Example -- start
		Runnable badTask = () -> {
			throw new RuntimeException("Throwing exception  from  task execution...");
		};

		// normal Example -- start
		Runnable normaltask = () -> {
			throw new RuntimeException("Throwing exception  from  task execution...");
		};

		ExecutorService exec = Executors.newSingleThreadExecutor();
		exec.execute(badTask);
		// exec.submit(badTask);
		exec.shutdown();

		// bad Example -- ends

		/*
		 * DOCS**** When actions are enclosed in tasks (such as FutureTask) either
		 * explicitly or via methods such as submit, these task objects catch and
		 * maintain computational exceptions, and so they do not cause abrupt
		 * termination, and the internal exceptions are not passed to this method.
		 */
		// good Example -- start
		Callable<Object> badTaskCallable = () -> {
			throw new RuntimeException("Throwing exception from task execution...");
		};
		ExecutorService execcallable = Executors.newSingleThreadExecutor();
		Future<Object> submittedTask = execcallable.submit(badTaskCallable);
		try {
			Object result = submittedTask.get();
		} catch (ExecutionException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause().getMessage());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		exec.shutdown();

		// good Example -- start
		System.out.println("this is over !");

	}

}
