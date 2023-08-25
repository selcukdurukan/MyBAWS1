package com.ba.boost.day64and65.swingdependencyinversionreflection2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogForm {

	private JFrame frame;
	private JTextField textError;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogForm window = new LogForm();
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
	public LogForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogType = new JLabel("Log Type: ");
		lblLogType.setBounds(45, 63, 91, 13);
		frame.getContentPane().add(lblLogType);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choosing...", "DbLog", "XmlLog", "TxtLog"}));
		comboBox.setBounds(141, 59, 105, 21);
		frame.getContentPane().add(comboBox);
		
		JLabel lblError = new JLabel("Error:");
		lblError.setBounds(45, 96, 45, 13);
		frame.getContentPane().add(lblError);
		
		textError = new JTextField();
		textError.setBounds(141, 93, 105, 19);
		frame.getContentPane().add(textError);
		textError.setColumns(10);
		
		JLabel lblResult = new JLabel("");
		lblResult.setBounds(10, 215, 426, 13);
		frame.getContentPane().add(lblResult);
		
		JButton btnNewButton = new JButton("Create Log");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LogFactory logFactory = new LogFactory();
				ILog ilog = logFactory.create(comboBox.getSelectedItem().toString());
				Logger logger = new Logger(ilog);
				logger.writeLog(textError.getText());
				lblResult.setText(logger.writeLog(textError.getText()));
			}
		});
		btnNewButton.setBounds(141, 134, 105, 21);
		frame.getContentPane().add(btnNewButton);
		

	}
}
