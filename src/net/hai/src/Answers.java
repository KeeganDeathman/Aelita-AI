package net.hai.src;

public class Answers 
{
	public static String[] sleepy = new String[2];
	{
		sleepy[0] = "";
		sleepy[1] = "darkface.png";
	}
	
	public static String[] hello = new String[2];
	{
	}
	public static String[] summer = new String[2];
	{
	}
	public static String[] howareyou = new String[2];
	{
	}
	public static String[] about = new String[2];
	{
	}
	public static String[] school = new String[2];
	{
	}
	public static String[] anythingelse = new String[2];
	{
	}
	public static String[] bye = new String[2];
	{
	}
	
	public Answers()
	{
		hello();
		howareyou();
		summer();
		about();
		school();
	}
	
	private void hello()
	{
		int choice = 1 + (int)(Math.random() * ((3 - 1) + 1));
		if(choice == 1)
		{
			hello[0] = "hello";
			hello[1] = "talkeyeopen.png";
		}
		else if(choice == 2)
		{
			hello[0] = "greetings";
			hello[1] = "talkeyeopen.png";
		}
		else if(choice == 3)
		{
			hello[0] = "hi";
			hello[1] = "talkeyeopen.png";
		}
		hello[1] = "talkeyeopen.png";
	}
	
	private void howareyou()
	{
		int choice = 1 + (int)(Math.random() * ((3 - 1) + 1));
		if(choice == 1)
		{
			howareyou[0] = "imgood";
			howareyou[1] = "talkeyeopen.png";
		}
		else if(choice == 2)
		{
			howareyou[0] = "imgreat";
			howareyou[1] = "talkeyeopen.png";
		}
		else if(choice == 3)
		{
			howareyou[0] = "ifeelgreat";
			howareyou[1] = "talkeyeclosed.png";
		}
	}
	
	private void summer()
	{
		int choice = 1 + (int)(Math.random() * ((3 - 1) + 1));
		if(choice == 1)
		{
			summer[0] = "yes";
			summer[1] = "talkeyeopen.png";
		}
		else if(choice == 2)
		{
			summer[0] = "ofcourse";
			summer[1] = "talkeyeclosed.png";
		}
		else if(choice == 3)
		{
			summer[0] = "duh";
			summer[1] = "talkeyeopen.png";
		}
	}
	
	private void about()
	{
		int choice = 1 + (int)(Math.random() * ((3 - 1) + 1));
		if(choice == 1)
		{
			about[0] = "cheese";
			about[1] = "talkeyeclosed.png";
		}
		else if(choice == 2)
		{
			about[0] = "java";
			about[1] = "talkeyeclosed.png";
		}
		else if(choice == 3)
		{
			about[0] = "choose";
			about[1] = "talkeyeclosed.png";
		}
	}
	
	private void school()
	{
		int choice = 1 + (int)(Math.random() * ((3 - 1) + 1));
		if(choice == 1)
		{
			school[0] = "covington";
			school[1] = "talkeyeclosed.png";
		}
		else if(choice == 2)
		{
			school[0] = "cms";
			school[1] = "talkeyeopen.png";
		}
		else if(choice == 3)
		{
			school[0] = "covofcourse";
			school[1] = "talkeyeclosed.png";
		}
	}
}
