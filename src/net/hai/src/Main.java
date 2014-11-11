package net.hai.src;

import java.io.File;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) 
	{
		System.out.println(new File(".").getAbsolutePath());
		JFrame frame = new Display();
	}

}
