package com.ferlsky.stack;

public class Stack_double {
	private double a[];//定义一个double[]
	private int length;//用作记录栈的容量
    private int n=0;//index
	
    /**
	 * 根据length创建double[]，将栈的容量设置为length
	 * @param length 设置栈的容量
	 */
	public Stack_double(int length){
		this.length=length;
		a = new double[length];
	}
	
	/**
	 * 压栈
	 * @param c 要压入栈的浮点数
	 */
	public void push(double c){
		a[n++]=c;
	}
	
	/**
	 * 弹栈
	 * @return 返回弹出的内容
	 */
	public double pop() {
		return a[--n];
	}
	
	/**
	 * 判断栈是否为空
	 * @return 返回栈是否为空
	 */
	public boolean isEmpty(){
		return n==0;
	}
}
