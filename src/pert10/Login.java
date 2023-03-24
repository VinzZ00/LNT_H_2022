package pert10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame implements ActionListener{

	JLabel loginH, emailL, passwordL;
	JTextField emailF;
	JPasswordField passwordF;
	JPanel north, center, south;
	JButton submitB, clearB;
	Color bgSubmit;
	
	String email = "Andi@binus.ac.id", password = "Andi123";
	void init() {
		Font fHeader = new Font(Font.SANS_SERIF, Font.BOLD, 32);
		Font fForm = new Font(Font.SERIF, Font.PLAIN, 15);
		
		loginH = new JLabel("Login", SwingConstants.CENTER);
		loginH.setFont(fHeader);
		emailL = new JLabel("Email");
		emailL.setFont(fForm);
		passwordL = new JLabel("Password");
		passwordL.setFont(fForm);
		
		emailF = new JTextField();
		passwordF = new JPasswordField();
		passwordF.setEchoChar('*');
		
		submitB = new JButton("Submit");
		clearB = new JButton("Clear");
		clearB.addActionListener(this);
		submitB.addActionListener(this);
		
		// Jpanel default layout => Flow layout
		north = new JPanel();
		center = new JPanel(new GridLayout(2, 2, 0, 10));
		center.setBorder(new EmptyBorder(0,10,0,10));
		south = new JPanel();
		
		north.add(loginH);
		center.add(emailL);
		center.add(emailF);
		center.add(passwordL);
		center.add(passwordF);
		
		south.add(submitB);
		south.add(clearB);
	}
	
	public Login() {
		
		// TODO Auto-generated constructor stub
		// Default Layout manager untuk Jframe adalah border layout, bisa diubah dengan method setlayout();
		setTitle("Login");
		setEnabled(true);
		setVisible(true);
		setSize(500,250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setLayout(new BorderLayout(0, 10));
		
		init();
		
		submitB.addMouseListener(new MouseListener() {
			int clicked = 0;
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
				
				submitB.setBackground(bgSubmit);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				bgSubmit = submitB.getBackground();
				submitB.setBackground(Color.cyan);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Mouse has been clicked " + (++clicked));
			}
		});
		
		passwordF.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == e.VK_ENTER) {
					auth();
				}
			}
		});
		
		add(north, BorderLayout.NORTH);
		add(south, BorderLayout.SOUTH);
		add(center, BorderLayout.CENTER);
		
		
	}
	
	public static void main(String[] args) {
		new Login();
	}

	void auth() {
		if (String.valueOf(passwordF.getPassword()).isEmpty() && emailF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Please input all the field first", "WARNING", JOptionPane.WARNING_MESSAGE );
		} else {
			String email = emailF.getText();
			String password = String.valueOf(passwordF.getPassword());
			System.out.println("email " + email);
			System.out.println("Password " + password);
			if (email.equals(this.email)) {
				if (password.equals(this.password)) {
					System.out.println("Welcome Home");
					System.out.printf("Your email is %s, and your password is %s\n", email, password);
				} else {
					JOptionPane.showMessageDialog(this, "Password Invalid", "Error", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(this, "Email Invalid", "Error", JOptionPane.ERROR_MESSAGE);
			} 
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == submitB) {
			auth();
		} else if(e.getSource() == clearB) {
			emailF.setText("");
			passwordF.setText("");
		}
	}

}
