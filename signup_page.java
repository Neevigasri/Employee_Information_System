package app;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JTextField;


public class signup_page extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup_page frame = new signup_page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public signup_page() {
		setBackground(new Color(176, 224, 230));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 712);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setFont(new Font("Perpetua Titling MT", Font.BOLD, 21));
		lblNewLabel.setBounds(198, 31, 167, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblName.setBounds(25, 139, 167, 26);
		contentPane.add(lblName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblEmail.setBounds(25, 203, 167, 26);
		contentPane.add(lblEmail);
		
		JLabel lblDateOfBirth = new JLabel("D.O.B");
		lblDateOfBirth.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblDateOfBirth.setBounds(25, 264, 115, 26);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblGender.setBounds(25, 326, 167, 26);
		contentPane.add(lblGender);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblAddress.setBounds(25, 380, 167, 26);
		contentPane.add(lblAddress);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblDepartment.setBounds(25, 442, 167, 26);
		contentPane.add(lblDepartment);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblPassword.setBounds(25, 510, 167, 26);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.setFont(new Font("Calibri Light", Font.PLAIN, 21));
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	try {
		    		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Nethra23@");
		            
		            // Query to check if the email already exists
		            String checkQuery = "SELECT COUNT(*) FROM signup WHERE email = ?";
		            PreparedStatement checkPst = connection.prepareStatement(checkQuery);
		            checkPst.setString(1, textField_3.getText()); // Assuming email is in textField_3
		            
		            ResultSet rs = checkPst.executeQuery();
		            rs.next();
		            int count = rs.getInt(1);
		            
		            if (count > 0) {
		                // Email is already registered
		                JLabel errorLabel = new JLabel();
		                errorLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		                errorLabel.setForeground(Color.RED);
		                errorLabel.setBounds(150, 650, 300, 30);
		                contentPane.add(errorLabel);
		                contentPane.repaint();
		                contentPane.revalidate();
		                plslogin pl = new plslogin();
				        pl.setVisible(true);
				        dispose();
		            
		            } else {
		                // Insert new user details into the database 		
		    		String query="insert into signup (Name,email,DOB,Gender,Address,Department,Password) values (?,?,?,?,?,?,?)";
					PreparedStatement pst= connection.prepareStatement(query);
					pst.setString(1, textField_4.getText()); // Name
					pst.setString(2, textField_3.getText()); // Email
					pst.setString(3, textField_2.getText()); // DOB
					pst.setString(4, textField_6.getText()); // Gender
					pst.setString(5, textField_1.getText()); // Address
					pst.setString(6, textField.getText());  // Department
					pst.setString(7, textField_5.getText()); // Password
		    		
		    		pst.executeUpdate();
		    		pst.close();
		    		connection.close();
		    		
		    		 // Show success page
		    		 regsuccess rg = new regsuccess();
				        rg.setVisible(true);
				        dispose();
		            }
		            rs.close();
		            checkPst.close();
		    	}catch (Exception s) {
		    		s.printStackTrace();
		    	}
		    	
		       
		    }
		});
		btnNewButton.setBounds(198, 590, 132, 50);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		textField.setBounds(164, 450, 326, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(164, 388, 326, 27);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(164, 272, 326, 27);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(164, 211, 326, 27);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(164, 147, 326, 27);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(164, 510, 326, 27);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(164, 326, 326, 27);
		contentPane.add(textField_6);
	}
}
