package com.ba.boost.day28;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class HelloWorld {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorld window = new HelloWorld();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelloWorld() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 726, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Merhaba ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("Merhaba Dünya");
			}
		});
		btnNewButton.setBounds(282, 96, 96, 21);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(282, 173, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton_1 = new JButton("İçeriği Temizle");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_1.setBounds(255, 272, 152, 21);
		frame.getContentPane().add(btnNewButton_1);
	}
}
