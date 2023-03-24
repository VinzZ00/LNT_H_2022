package pert9;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class LoginPage extends JFrame implements ActionListener {

	private JPanel north, center, south;
	private JLabel pendataanL, nameL, umurL, emailL;
	private JTextField nameF, umurF, emailF;
	private JButton submit;
	
	void init() {
		north = new JPanel();
		center = new JPanel(new GridLayout(3,2,0,10));
		center.setBorder(new EmptyBorder(0, 10, 0, 10));
		south = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		pendataanL = new JLabel("Pendataan");
		pendataanL.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		nameL = new JLabel("Name");
		umurL = new JLabel("Umur");
		emailL = new JLabel("Email");
		
		nameF = new JTextField();
		umurF = new JTextField();
		emailF = new JTextField();
		
		submit = new JButton("Submit");
		submit.setPreferredSize(new Dimension(150,50));
	}
	
	public LoginPage() {
		// TODO Auto-generated constructor stub
		setTitle("Pendataan Page");
		setEnabled(true);
		setVisible(true);
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		
//		init();
		
		north.add(pendataanL);
		
		center.add(nameL);
		center.add(nameF);
		center.add(umurL);
		center.add(umurF);
		center.add(emailL);
		center.add(emailF);
		
		south.add(submit);
		
		add(north, BorderLayout.NORTH);
		add(center, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);
		
		submit.addActionListener(this);
		
//		submit.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == submit) {
			System.out.println("Nama : " + nameF.getText());
			
			int umur = 0;
			try {
				umur = Integer.valueOf(umurF.getText());
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				umur = -1;
			}
			
			System.out.println("Umur : " + ((umur > -1) ? umur : "Error" ));
			
			System.out.println("Email : " + emailF.getText());
		}
	}

}
