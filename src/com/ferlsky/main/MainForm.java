package com.ferlsky.main;

import java.awt.GraphicsConfiguration;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainForm {
	JFrame jFrame;
	public MainForm(){
		jFrame = new JFrame();
	}
	public MainForm(String title){
		jFrame = new JFrame(title);
	}
	public MainForm(GraphicsConfiguration gc){
		jFrame = new JFrame(gc);
	}
	public MainForm(String title,GraphicsConfiguration gc){
		jFrame = new JFrame(title, gc);
	}
	
	public void create() {
		jFrame.setSize(300, 400);//设置窗口宽高
		jFrame.setResizable(false);//设置窗口不可修改宽高
		jFrame.show();
	}
}
