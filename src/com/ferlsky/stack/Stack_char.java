package com.ferlsky.stack;

public class Stack_char {
	private char a[];//定义一个char[]
	private int length;//用作记录栈的容量
    private int n=0;//index
	
	/**
	 * 根据length创建char[]，将栈的容量设置为length
	 * @param length 设置栈的容量
	 */
	public Stack_char(int length){
		this.length=length;
		a = new char[length];
	}
	
	
	/**
	 * 压栈
	 * @param c 要压入栈的字符
	 */
	public void push(char c){
		a[n++]=c;
	}
	
	/**
	 * 弹栈
	 * @return 返回弹出的内容
	 */
	public char pop() {
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
