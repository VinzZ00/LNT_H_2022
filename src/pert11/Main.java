package pert11;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.sql.Connection;

public class Main {

	private Connection con;
	private Statement st;
	private PreparedStatement ps; 
	private ResultSet rs;
	public Main() {
		// TODO Auto-generated constructor stub
		System.out.println("Hello world");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kelashpert11", "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("Database Connection Error");
		}
		
		try {
			st = con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			rs = st.executeQuery("Select * from table1 where nama like '%an'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Vector<Vector<String>> rows = new Vector<>();
		
		try {
			while (rs.next()) {
				Vector<String> row = new Vector<String>();
				row.add(rs.getString(1));
				row.add(rs.getString(2));
				rows.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JFrame f = new JFrame();
		
		f.setTitle("Database");
		f.setEnabled(true);
		f.setVisible(true);
		f.setSize(500,250);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setResizable(true);
		f.setLayout(new BorderLayout(0, 10));
		
		Vector<String> cn = new Vector<String>();
		
		cn.add("id");
		cn.add("nama");
		
		DefaultTableModel dtm = new DefaultTableModel(rows, cn);
		
		JTable table = new JTable(dtm);
		
		
		f.add(new JScrollPane(table));
		
		try {
			ps = con.prepareStatement("insert into table1 values (?, ?)");
			ps.setInt(1, 10);
			ps.setString(2, "Cilla");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
