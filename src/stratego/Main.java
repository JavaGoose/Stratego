import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.net.*;
import java.io.*;
public class Main extends JPanel implements ActionListener{
	public Image Background;
	
	public Main(){

	}

/*
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.BLACK);
		ImageIcon ic = new ImageIcon(this.getClass().getResource("stratego.jpg"));
		Background = ic.getImage();
		Graphics2D g3g = (Graphics2D)g;
	    g3g.drawImage(Background, 50, 100,this);

	}
*/

	//Action Listener
	@Override
	public void actionPerformed(ActionEvent button) {
		
	}

	//main class
	public static void main(String args[]) {
			//frame 
			JFrame frame = new JFrame("Stratego");
			//panel
			JPanel panel = new JPanel();
			//button
			JButton button = new JButton("Play");
			panel.setLayout(null);
			//placement of button
			button.setBounds(380,340,150,70);
			panel.add(button);
			//adding panel to frame
			panel.setBackground(Color.BLACK);
			frame.add(panel);			
			//frame set up
			frame.setTitle("Stratego");
			frame.setSize(800,800);
			frame.setVisible(true);
			frame.setResizable(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	

}
