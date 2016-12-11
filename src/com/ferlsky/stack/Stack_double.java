package com.ferlsky.stack;

public class Stack_double {
	private double a[];//����һ��double[]
	private int length;//������¼ջ������
    private int n=0;//index
	
    /**
	 * ����length����double[]����ջ����������Ϊlength
	 * @param length ����ջ������
	 */
	public Stack_double(int length){
		this.length=length;
		a = new double[length];
	}
	
	/**
	 * ѹջ
	 * @param c Ҫѹ��ջ�ĸ�����
	 */
	public void push(double c){
		a[n++]=c;
	}
	
	/**
	 * ��ջ
	 * @return ���ص���������
	 */
	public double pop() {
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
