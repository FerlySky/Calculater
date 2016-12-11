package com.ferlsky.calculate;

import com.ferlsky.stack.Stack_double;

public class Calculate {
	private String input,tmp = ",";
	private Stack_double sDouble;
	
	public Calculate(String string){
		this.input = string;
		sDouble = new Stack_double(string.length());
	}
	public double getResult() {
		double i1,i2,tmp_i=0,tmp_d=0,n=1;
		boolean isInt = true;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			switch (c) {
			case '(':
				tmp_i=0;
				tmp_d=0;
				n=1;
				isInt = true;
				break;
			case ')':
				sDouble.push(tmp_i+tmp_d);
				break;
			case '+':
				i2=sDouble.pop();
				i1=sDouble.pop();
				sDouble.push(i1+i2);
				break;
			case '-':
				i2=sDouble.pop();
				i1=sDouble.pop();
				sDouble.push(i1-i2);
				break;
			case '*':
				i2=sDouble.pop();
				i1=sDouble.pop();
				sDouble.push(i1*i2);
				break;
			case '/':
				i2=sDouble.pop();
				i1=sDouble.pop();
				sDouble.push(i1/i2);
				break;
			case '.':
				isInt=false;
				break;
			default:
				if (isInt) {
					tmp_i=tmp_i*10+c-48;
				} else {
					n*=0.1;
					tmp_d = tmp_d+(c-48)*n;
				}
				break;
			}
		}
		return sDouble.pop();
	}
}
