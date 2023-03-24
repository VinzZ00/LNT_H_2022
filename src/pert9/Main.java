package pert9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		JFrame f = new JFrame();
		
		f.setTitle("First Page");
		f.setResizable(true);
		f.setEnabled(true);
		f.setVisible(true);
		f.setSize(400,400);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		
		//Layout manager - default -> border layout = peletakan component berdasarkan arah mata angin	(North, south, east, west, dan center)
		
		
		
		 JButton b1 = new JButton();
		 b1.setText("North");
		 JButton b2 = new JButton("South");
		 JButton b3 = new JButton("East");
		 JButton b4 = new JButton("West");
		 JButton b5 = new JButton("Center");
		 b5.setBackground(Color.CYAN);
		 b5.setPreferredSize(new Dimension(150,50));
		 b5.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				b5.setBackground(Color.cyan);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				b5.setBackground(Color.DARK_GRAY);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		 
		 JPanel p = new JPanel();
		 
//		 p.add(b5);
		 p.setBackground(Color.BLUE);
		 JLabel l = new JLabel("Welcome");
		 l.setBounds(0,0,150,30);
		 l.setFont(new Font(Font.SERIF,Font.BOLD,30));
		 p.add(l);
		 p.setBounds(100,100,350,350);
//		 l.setForeground(Color.BLUE.brighter());
//		 f.setBackground(Color.blue.brighter());
//		 f.add(b1, BorderLayout.NORTH);
		 f.add(p);
//		 f.add(b2, BorderLayout.SOUTH);
//		 f.add(b3, BorderLayout.EAST);
//		 f.add(b4, BorderLayout.WEST);
//		 f.add(b5, BorderLayout.CENTER);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new LoginPage();
//		new Main();
	}

}
