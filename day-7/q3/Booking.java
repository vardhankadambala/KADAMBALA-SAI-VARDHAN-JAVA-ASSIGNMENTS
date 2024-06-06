package com.ey.q3;

class Q1  {
	int n;
	boolean valueset = false;
	
	 synchronized 	 int  get( ) {
		if (!valueset)
		try {
			wait( );//producer to wait
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		} 
		System.out.println( "Room occupied by manager-1: " + n);
		valueset = false;
		notify( );
		return n;
	}

	 synchronized	 void put( int n) {
		if (valueset)
		try {
			wait( ); //consumer to wait
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		} 
		this.n = n;
		valueset = true;
		System.out.println( "Room occupied by manager-2: " + n); 
		notify( );
	}
}
class manager1 implements Runnable {
	Q1 q;
	manager1 ( Q1 q) {
		this.q = q;
		new Thread( this, "manager1").start( );
	}
	
	public void run( ){
		int i = 0; 
		for(int index=1;index<=5;index++) {
			q.put (i++); 
		}
	}
}

class manager2 implements Runnable {
	Q1 q;
	manager2 ( Q1 q) {
		this.q = q;
		new Thread (this, "manager2").start( );
	} 
	
	public void run( ) {
		for(int index=1;index<=5;index++) {
			q.get( );
		}
	}
}


public class Booking {
	public static void main (String args [ ] ){
		Q1 q = new Q1( );
		new manager1 (q);
		new manager2 (q);
		System.out.println("Press Control-C to stop");
	}

}
