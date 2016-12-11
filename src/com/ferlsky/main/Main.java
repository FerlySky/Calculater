package com.ferlsky.main;

import java.text.Normalizer.Form;
import java.util.Scanner;

import javax.swing.JFrame;

import com.ferlsky.calculate.Calculate;
import com.ferlsky.translate.Translater;

public class Main {

	public static void main(String[] args) {
		
		//Form form = 
		MainForm form = new MainForm("Calculate");
		form.create();
		
		//------------------------------------------------------------------------------------
		/**
		 * 计算功能实现
		 */
		Scanner scanner = new Scanner(System.in);
		Translater translater = new Translater(scanner.next());
		System.out.println(translater.translate());
		Calculate calculate = new Calculate(translater.translate());
		System.out.println(calculate.getResult());
		//------------------------------------------------------------------------------------
		
		
		
	}

}
