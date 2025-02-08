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

import javax.swing.JButton;

public class plslogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					plslogin frame = new plslogin();
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
	public plslogin() {
		setBackground(new Color(211, 211, 211));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 287);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlreadyRegisteredPlease = new JLabel("Already registered !");
		lblAlreadyRegisteredPlease.setFont(new Font("Segoe UI Variable", Font.ITALIC, 17));
		lblAlreadyRegisteredPlease.setBounds(142, 40, 186, 45);
		contentPane.add(lblAlreadyRegisteredPlease);
		
		JLabel lblPleaseLogin = new JLabel("Please ");
		lblPleaseLogin.setFont(new Font("Segoe UI Variable", Font.ITALIC, 17));
		lblPleaseLogin.setBounds(129, 95, 67, 45);
		contentPane.add(lblPleaseLogin);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Century Schoolbook", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				l.setVisible(true);				
				dispose();
			}
		});
		btnNewButton.setBounds(195, 108, 85, 21);
		contentPane.add(btnNewButton);
		
	}

}
