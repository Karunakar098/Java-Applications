package com.codegnan.threads01.runnablethreads;

public class Counter {

	int number;

	public synchronized void increment() {

		number++;// number = number +1;
	}

}
