package ExecutorServices;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;
public class CachedThread {
	public static void main(String[]args) {
		ExecutorService executor=Executors.newCachedThreadPool();
		Runnable t1=()->{
			System.out.println("Task 1 Executed by: "+ Thread.currentThread().getName());
		};
		Runnable t2=()->{
			System.out.println("Task 2 Executed by: "+ Thread.currentThread().getName());
		};
		Runnable t3=()->{
			System.out.println("Task 3 Executed by: "+ Thread.currentThread().getName());
		};
		executor.execute(t1);
		executor.execute(t2);
		executor.execute(t3);
		
		executor.shutdown();
	}
}
