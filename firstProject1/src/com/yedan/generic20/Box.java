package com.yedan.generic20;

public class Box<T> { // T가와도 되고 K가와도되고 ~~ 타입 파라메타
	private T obj;
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return this.obj;
	}

}
