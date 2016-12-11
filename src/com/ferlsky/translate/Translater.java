package com.ferlsky.translate;

import com.ferlsky.stack.Stack_char;

/**
 * 把中缀表达式转为后缀表达式
 * @author FerlySky
 */
public class Translater {
	private Stack_char sChar;
	private String outtmp = "",input,output="";
	
	public Translater(String string){
		input = string;
		sChar = new Stack_char(input.length());
	}
	
	public String translate(){
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			switch (c) {
			case '+':
			case '-':
				output += outtmp;
				outtmp = "";
				getOper(c,1);
				break;
			case '*':
			case '/':
				output += outtmp;
				outtmp = "";
				getOper(c,2);
				break;
			case '(':
				output += outtmp;
				outtmp = "";
				sChar.push(c);
				break;
			case ')':
				output += outtmp;
				outtmp = "";
				getParen(c);
				break;
			default:
				getOut(c);
				break;
			}
		}
		output+=outtmp;
		outtmp="";
		while (!sChar.isEmpty()) {
			output += sChar.pop();
		}
		return output;
	}

	private void getOut(char c) {
		if (outtmp=="") {
			outtmp = new String(new char[]{'(',c,')'});	
		} else {
			StringBuilder stringBuilder = new StringBuilder(outtmp);
			stringBuilder.insert(outtmp.length()-1, c);
			outtmp = stringBuilder.toString();
		}
	}

	private void getParen(char c) {
		while (!sChar.isEmpty()) {
			char ch = sChar.pop();
			if (ch=='(') {
				break;
			} else {
				output += ch;
			}
		}
	}

	private void getOper(char c, int i) {
		while (!sChar.isEmpty()) {
			char onTop = sChar.pop();
			if (onTop=='(') {
				sChar.push(onTop);
				break;
			} else {
				int n2;
				switch (onTop) {
				case '+':
				case '-':
					n2=1;
					break;
				case '*':
				case '/':
					n2=2;
					break;
				default:
					n2=-1;
					output = "Error!";
					System.out.println(output);
					break;
				}
				if (n2<i) {
					sChar.push(onTop);
					break;
				} else {
					output += onTop;
				}
			}
		}
		sChar.push(c);
	}
}
