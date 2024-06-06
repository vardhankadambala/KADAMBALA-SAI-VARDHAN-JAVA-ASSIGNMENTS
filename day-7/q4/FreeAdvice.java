package com.ey.q4;

public class FreeAdvice {
	public static void main(String[] args) {
		
		String s[]= {"Never begin to stop and never stop to begin","Only destination isn’t important, one should enjoy the \r\n"
				+ "    journey."," impossible itself says ‘i m possible"};
		
		
		FreeAdviceService fs= new FreeAdviceService();
		String s1=fs.Free(s);
		Thread t=new Thread();
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s1);
	}

}
