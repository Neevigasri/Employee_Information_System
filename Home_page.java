package app;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Home_page extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_page frame = new Home_page();
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
	public Home_page() {
		setForeground(new Color(0, 139, 139));
		setBackground(new Color(173, 216, 230));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 453);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMPLOYEE DATA MANAGEMENT");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 22));
		lblNewLabel.setBounds(34, 60, 372, 32);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Dubai Medium", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				l.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton.setBounds(235, 184, 156, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("sign up");
		btnNewButton_1.setFont(new Font("Dubai Medium", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        signup_page s = new signup_page();
		        s.setVisible(true);
		        dispose();
		    }
		});
		btnNewButton_1.setBounds(235, 302, 156, 42);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Already registered click here");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 183, 277, 42);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New User click here");
		lblNewLabel_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(34, 301, 182, 42);
		contentPane.add(lblNewLabel_1_1);
	}
}
