package com.ba.boost.atclass;

public class ThreadProcess extends Thread{

	public static void main(String[] args) {
		
		int processors = Runtime.getRuntime().availableProcessors();
		for(int i=0; i < processors; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		  ThreadProcess yourThread = new ThreadProcess();
		  yourThread.start();;
		}

		
	}

}
