package me.wrj.concurrent.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsTest {

	private static final int TASK_LIST_SIZE = 10;
	public static void main(String[] args) {
		
		//ExecutorService exec1 = Executors.newSingleThreadExecutor();
		//ExecutorService exec1 = Executors.newFixedThreadPool(5);
		ExecutorService exec1 =Executors.newScheduledThreadPool(5);
		MyTask myTask = new MyTask();
	    for(int i = 0; i < TASK_LIST_SIZE; i++){
	    	exec1.submit(myTask);
	    }
	    exec1.shutdown();
	    
		
		
	}
	
	
}

class MyTask implements Runnable{

	@Override
	public void run() {
		System.out.println(System.currentTimeMillis()+":"+Thread.currentThread().getId());		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			//忽略中断
			e.printStackTrace();
		}
	}
	
}



