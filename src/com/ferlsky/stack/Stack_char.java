package com.ferlsky.stack;

public class Stack_char {
	private char a[];//����һ��char[]
	private int length;//������¼ջ������
    private int n=0;//index
	
	/**
	 * ����length����char[]����ջ����������Ϊlength
	 * @param length ����ջ������
	 */
	public Stack_char(int length){
		this.length=length;
		a = new char[length];
	}
	
	
	/**
	 * ѹջ
	 * @param c Ҫѹ��ջ���ַ�
	 */
	public void push(char c){
		a[n++]=c;
	}
	
	/**
	 * ��ջ
	 * @return ���ص���������
	 */
	public char pop() {
		return a[--n];
	}
	
	/**
	 * �ж�ջ�Ƿ�Ϊ��
	 * @return ����ջ�Ƿ�Ϊ��
	 */
	public boolean isEmpty(){
		return n==0;
	}
}
