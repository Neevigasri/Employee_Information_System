package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class Pls_signup extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pls_signup frame = new Pls_signup();
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
	public Pls_signup() {
		setBackground(new Color(211, 211, 211));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 236);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNotRegistered = new JLabel("Not Registered ");
		lblNotRegistered.setBounds(152, 37, 126, 45);
		lblNotRegistered.setFont(new Font("Segoe UI Variable", Font.ITALIC, 17));
		contentPane.add(lblNotRegistered);
		
		JLabel lblPleaseRegister = new JLabel("Please Register");
		lblPleaseRegister.setFont(new Font("Segoe UI Variable", Font.ITALIC, 17));
		lblPleaseRegister.setBounds(114, 76, 132, 58);
		contentPane.add(lblPleaseRegister);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        signup_page s = new signup_page();
		        s.setVisible(true);
		        dispose();
		    }
		});
		btnNewButton.setBounds(240, 98, 113, 21);
		contentPane.add(btnNewButton);
	}

}
