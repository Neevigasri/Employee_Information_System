package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JButton;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setBackground(new Color(176, 224, 230));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 405);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblNewLabel.setBounds(26, 81, 124, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblEmail.setBounds(26, 141, 124, 51);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblPassword.setBounds(26, 202, 124, 51);
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(144, 157, 269, 27);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(144, 218, 269, 27);
		contentPane.add(textField_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(144, 101, 269, 27);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            // Establish connection to the database
		            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Nethra23@");
		            
		            // Query to check if the email and password match
		            String query = "SELECT * FROM signup WHERE email = ? AND password = ?";
		            PreparedStatement pst = connection.prepareStatement(query);
		            pst.setString(1, textField_1.getText()); // Assuming email is in textField_1
		            pst.setString(2, textField_2.getText()); // Assuming password is in textField_2
		            
		            ResultSet rs = pst.executeQuery();
		            
		            if (rs.next()) {
		            	    String name = rs.getString("name");
		            	    String email = rs.getString("email");
		            	    String dob = rs.getString("dob");
		            	    String gender = rs.getString("gender");
		            	    String empId = rs.getString("id");
		            	    String department = rs.getString("department");
		            	    String address = rs.getString("address");

		            	    // Pass values to the Detail page
		            	    Detail detailPage = new Detail(name, email, dob, gender, empId, department, address);
		            	    detailPage.setVisible(true);
		            	    dispose(); // Close the login frame
		            	
		               
		            } else {
		                // If no match, show an error message
		            	 Pls_signup ps = new Pls_signup();
					        ps.setVisible(true);
					        dispose();
		            }
		            
		            // Close connections
		            rs.close();
		            pst.close();
		            connection.close();
		        } catch (SQLException ex) {
		            ex.printStackTrace();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		    }
		})
		;

		btnNewButton.setBounds(161, 277, 117, 51);
		contentPane.add(btnNewButton);
		
	}

	}


