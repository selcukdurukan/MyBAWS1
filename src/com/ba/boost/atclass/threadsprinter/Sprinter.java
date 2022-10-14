package com.ba.boost.atclass.threadsprinter;

public class Sprinter implements Runnable{

	private String name;
	

	@Override
	public void run() {
		for (int i = 10; i <=100; i += 10) {
			System.out.println(Thread.currentThread()+ " " +i+ " . metrede");
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


	public Sprinter(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
