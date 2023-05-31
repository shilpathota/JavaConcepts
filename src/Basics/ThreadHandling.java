package Basics;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Hi extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
		}
	}
}
class Hello extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
		}
	}
}
public class ThreadHandling {

	public static void method() {
		System.out.println("New thread");
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		obj1.start();
		obj2.start();
	}
}
class HiRun implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
		}
	}
}
class HelloRun implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
		}
	}
}
class ThreadwithInterface2 {
	public static void method2() {
		System.out.println("New thread");
		HiRun obj1 = new HiRun();
		HelloRun obj2 = new HelloRun();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
	}
}
class ThreadwithInterface {

	public static void main(String[] args) {
		System.out.println("New thread");
		Runnable obj1 = new Runnable() {
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Hi");
				}
			}
		};
		Runnable obj2 = ()->
				{for(int i=0;i<5;i++) {
					System.out.println("Hello");
				}
	};		
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
	}

}

class Message {
    private String content;

    public synchronized void send(String message) {
        while (content != null) {
            try {
                wait(); // Waiting for the previous message to be consumed
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        content = message;
        notify(); // Notifying the receiver thread
    }

    public synchronized String receive() {
        while (content == null) {
            try {
                wait(); // Waiting for a message to be sent
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        String message = content;
        content = null;
        notify(); // Notifying the sender thread
        return message;
    }
}
class MyTask implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
class ServiceExecutor{
	public void service() {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		executor.submit(new MyTask());
		executor.shutdown();
		ExecutorService executorcached = Executors.newCachedThreadPool();
		executorcached.submit(new MyTask());
		executorcached.shutdown();
		ExecutorService executorSinglethread = Executors.newSingleThreadExecutor();
		executorSinglethread.submit(new MyTask());
		executorSinglethread.shutdown();
		ScheduledExecutorService executorScheduled = Executors.newScheduledThreadPool(3);
		executorScheduled.schedule(new MyTask(), 10, TimeUnit.SECONDS);
		executorScheduled.shutdown();
		ExecutorService executorWorkstealing = Executors.newWorkStealingPool();
		executorWorkstealing.submit(new MyTask());
		executorWorkstealing.shutdown();
	}
}

class MyClass {
    private ReentrantLock lock = new ReentrantLock();

    public void someMethod() {
        lock.lock();
        try {
            // Synchronized block code
        } finally {
            lock.unlock();
        }
    }
}

public class CompletableFutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Create a CompletableFuture and perform asynchronous computation
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 42);
        // 1. thenApply: Apply a function to the result
        CompletableFuture<String> thenApplyFuture = future.thenApply(result -> "Result: " + result);
        // 2. thenAccept: Perform an action on the result without returning a value
        CompletableFuture<Void> thenAcceptFuture = future.thenAccept(result -> System.out.println("Result: " + result));
        // 3. thenCompose: Chain dependent CompletableFuture
        CompletableFuture<String> thenComposeFuture = future.thenCompose(result -> CompletableFuture.supplyAsync(() -> "Processed: " + result));
        // 4. thenCombine: Combine two CompletableFutures
        CompletableFuture<String> combineFuture = future.thenCombine(CompletableFuture.completedFuture("Extra"), (result1, result2) -> result1 + " " + result2);
        // 5. exceptionally: Handle exceptions
        CompletableFuture<Integer> exceptionallyFuture = future.thenApply(result -> {
            if (result < 0) {
                throw new IllegalArgumentException("Invalid result");
            }
            return result;
        }).exceptionally(ex -> {
            System.out.println("Exception occurred: " + ex.getMessage());
            return 0;
        });
        // 6. handle: Handle both result and exception
        CompletableFuture<Integer> handleFuture = future.handle((result, ex) -> {
            if (ex != null) {
                System.out.println("Exception occurred: " + ex.getMessage());
                return 0;
            }
            return result;
        });
        // 7. allOf: Wait for all CompletableFutures to complete
        CompletableFuture<Void> allOfFuture = CompletableFuture.allOf(thenApplyFuture, thenAcceptFuture, thenComposeFuture, combineFuture, exceptionallyFuture, handleFuture);
        // 8. get: Retrieve the result
        Integer result = future.get();
        // Print the result
        System.out.println("Final result: " + result);
        // Wait for all CompletableFutures to complete
        allOfFuture.join();
    }
}