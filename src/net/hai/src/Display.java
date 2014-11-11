package net.hai.src;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Timer;
import java.util.TimerTask;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.TargetDataLine;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display extends JFrame implements ActionListener
{
	public static String path = "darkface.png";
	public static String answer = " ";
	
	private JPanel panel = new JPanel();
	private JLabel face = new JLabel();
	private JLabel textoutput = new JLabel("");
	
	public Display()
	{
		Toolkit toolkit =  Toolkit.getDefaultToolkit ();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		Dimension dim = toolkit.getScreenSize();
		this.setSize(dim.width, dim.height);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		createFace();
		createOutput();
		createInput();
		add(panel);
		setResizable(false);
		this.setTitle("Aelita");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equalsIgnoreCase("Hello HAI"))
		{
			Answers answers = new Answers();
			path = answers .hello[1];
			PlaySound.playSound(answers.hello[0]);
			System.out.println(Answers.hello[1]);
			System.out.println(path);
			panel.remove(face);
			panel.remove(textoutput);
			createFace();
			createOutput();
			panel.repaint();
			repaint();
			closeMouth();
		}
		else if(e.getActionCommand().equalsIgnoreCase("Good, good. Are you excited for summer?"))
		{
			Answers answers = new Answers();
			path = answers .summer[1];
			PlaySound.playSound(Answers.summer[0]);
			System.out.println(Answers.summer[1]);
			System.out.println(path);
			panel.remove(face);
			panel.remove(textoutput);
			createFace();
			createOutput();
			panel.repaint();
			repaint();
			closeMouth();
		}
		else if(e.getActionCommand().equalsIgnoreCase("Great. How are you?"))
		{
			Answers answers = new Answers();
			path = answers.howareyou[1];
			PlaySound.playSound(Answers.howareyou[0]);
			System.out.println(Answers.howareyou[1]);
			System.out.println(path);
			panel.remove(face);
			panel.remove(textoutput);
			createFace();
			createOutput();
			panel.repaint();
			repaint();
			closeMouth();
		}
		else if(e.getActionCommand().equalsIgnoreCase("Thought so. Can you tell us about yourself?"))
		{
			Answers answers = new Answers();
			path = answers.about[1];
			PlaySound.playSound(Answers.about[0]);
			System.out.println(Answers.about[1]);
			System.out.println(path);
			panel.remove(face);
			panel.remove(textoutput);
			createFace();
			createOutput();
			panel.repaint();
			repaint();
			closeMouth();
		}
		else if(e.getActionCommand().equalsIgnoreCase("Interesting. Whats your favorite school?"))
		{
			Answers answers = new Answers();
			path = answers.school[1];
			PlaySound.playSound(Answers.school[0]);
			System.out.println(Answers.school[1]);
			System.out.println(path);
			panel.remove(face);
			panel.remove(textoutput);
			createFace();
			createOutput();
			panel.repaint();
			repaint();
			closeMouth();
		}
		else if(e.getActionCommand().equalsIgnoreCase("Well of course. Got any thing else to say?"))
		{
			path = "talkeyeclosed.png";
			PlaySound.playSound("gocolts");
			System.out.println("GO COLTS!");
			System.out.println(path);
			panel.remove(face);
			panel.remove(textoutput);
			createFace();
			createOutput();
			panel.repaint();
			repaint();
			closeMouth();
		}
		else if(e.getActionCommand().equalsIgnoreCase("Great. Bye!"))
		{
			path = "talkeyeclosed.png";
			PlaySound.playSound("bye");
			System.out.println(Answers.school[1]);
			System.out.println(path);
			panel.remove(face);
			panel.remove(textoutput);
			createFace();
			createOutput();
			panel.repaint();
			repaint();
			sleep();
		}
		else if(e.getActionCommand().equalsIgnoreCase("Poem"))
		{
			path = "talkeyeclosed.png";
			PlaySound.playSound("poem");
			System.out.println("poem");
			System.out.println(path);
			panel.remove(face);
			panel.remove(textoutput);
			createFace();
			createOutput();
			panel.repaint();
			repaint();
			closeMouthDelay();
		}
		else
		{
			System.out.println("Illegal question!" + e.getActionCommand());
		}

	}
	public void closeMouth()
	{
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			  @Override
			  public void run() {
			    // Your database code here
			  
				path = "eyeopen.png";
				panel.remove(face);
				panel.remove(textoutput);
				createFace();
				createOutput();
				panel.repaint();
				repaint();
			  }
		}, 5*1000);
	}
	
	public void closeMouthDelay()
	{
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			  @Override
			  public void run() {
			    // Your database code here
			  
				path = "eyeopen.png";
				panel.remove(face);
				panel.remove(textoutput);
				createFace();
				createOutput();
				panel.repaint();
				repaint();
			  }
		}, 500*1000);
	}
	
	public void sleep()
	{
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			  @Override
			  public void run() {
			    // Your database code here
			  
				path = "darkface.png";
				panel.remove(face);
				panel.remove(textoutput);
				createFace();
				createOutput();
				panel.repaint();
				repaint();
			  }
		}, 5*1000);
	}
	
	public void createInput()
	{
		panel.setLayout(new FlowLayout());
		JButton hello = new JButton("Hello HAI");
		hello.setActionCommand("Hello HAI");
		hello.addActionListener(this);
		JButton howru = new JButton("Great. How are you?");
		howru.setActionCommand("Great. How are you?");
		howru.addActionListener(this);
		JButton summer = new JButton("Good, good. Are you excited for summer?");
		summer.setActionCommand("Good, good. Are you excited for summer?");
		summer.addActionListener(this);
		JButton about = new JButton("Thought so. Can you tell us about yourself?");
		about.setActionCommand("Thought so. Can you tell us about yourself?");
		about.addActionListener(this);
		JButton bye = new JButton("Great. Bye!");
		bye.setActionCommand("Great. Bye!");
		bye.addActionListener(this);
		JButton poem = new JButton("Read le Poem");
		poem.setActionCommand("Poem");
		poem.addActionListener(this);
		panel.add(hello);
		panel.add(howru);
		panel.add(summer);
		panel.add(about);
		panel.add(bye);
		panel.add(poem);
		repaint();
	}
	
	public void createOutput()
	{
		textoutput.setSize(getWidth(), 50);
		textoutput.setText(answer);
		panel.add(textoutput);
		repaint();
	}
	
	public void createFace()
	{
		ImageIcon faceIcon = createImageIcon(path, "Humanoid Artificial Intelligence");
		Image image = faceIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(getWidth(), getHeight()-100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		faceIcon = new ImageIcon(newimg);
		face.setIcon(faceIcon);
		panel.add(face);
		panel.repaint();
		repaint();
	}
	
	protected ImageIcon createImageIcon(String path, String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
	
}
