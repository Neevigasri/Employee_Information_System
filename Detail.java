package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Detail extends JFrame {

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
	                Detail frame = new Detail("John Doe", "john.doe@example.com", "01-01-2000", "Male", "E12345", "IT", "123 Street Name");
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
	public Detail(String name, String email, String dob, String gender, String empId, String department, String address) {
		setBackground(new Color(32, 178, 170));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 702);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDetail = new JLabel("DETAIL");
		lblDetail.setBounds(168, 60, 89, 26);
		lblDetail.setFont(new Font("Perpetua Titling MT", Font.BOLD, 21));
		contentPane.add(lblDetail);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblName.setBounds(10, 138, 80, 26);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(156, 140, 270, 27);
		textField.setText(name); // Set name value
		contentPane.add(textField);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblEmail.setBounds(10, 211, 80, 26);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(156, 213, 270, 27);
		textField_1.setText(email); // Set the passed email value
		contentPane.add(textField_1);
		
		JLabel lblDateOfBirth = new JLabel("D.O.B");
		lblDateOfBirth.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblDateOfBirth.setBounds(10, 285, 71, 26);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblGender.setBounds(10, 345, 96, 26);
		contentPane.add(lblGender);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(156, 287, 270, 27);
		textField_2.setText(dob); // Set the passed DOB value
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(156, 347, 270, 27);
		textField_3.setText(gender); // Set the passed employee ID value
		contentPane.add(textField_3);
		
		JLabel lblAddress = new JLabel("Employee ID");
		lblAddress.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblAddress.setBounds(10, 417, 167, 26);
		contentPane.add(lblAddress);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblDepartment.setBounds(10, 479, 167, 26);
		contentPane.add(lblDepartment);
		
		JLabel lblPassword = new JLabel("Address");
		lblPassword.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblPassword.setBounds(10, 538, 167, 26);
		contentPane.add(lblPassword);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(155, 416, 271, 27);
		textField_4.setText(empId); // Set the passed department value
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(155, 479, 271, 27);
		textField_5.setText(department); // Set the passed department value
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(155, 538, 271, 27);
		textField_6.setText(address); // Set the passed department value
		contentPane.add(textField_6);
		

	}
}
