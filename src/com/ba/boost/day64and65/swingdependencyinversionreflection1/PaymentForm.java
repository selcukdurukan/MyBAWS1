package com.ba.boost.day64and65.swingdependencyinversionreflection1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaymentForm {

	private JFrame frame;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentForm window = new PaymentForm();
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
	public PaymentForm() {
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

		JLabel lblPaymentType = new JLabel("Payment Type:");
		lblPaymentType.setBounds(33, 37, 89, 13);
		frame.getContentPane().add(lblPaymentType);

		JComboBox cmbPaymentMethod = new JComboBox();
		cmbPaymentMethod.setModel(new DefaultComboBoxModel(new String[] {"Choosing..", "CreditCard", "MailOrder", "CryptoCurrency"}));
		cmbPaymentMethod.setBounds(132, 33, 118, 21);
		frame.getContentPane().add(cmbPaymentMethod);

		JLabel lblTotal = new JLabel("Total: ");
		lblTotal.setBounds(33, 76, 74, 13);
		frame.getContentPane().add(lblTotal);

		txtTotal = new JTextField();
		txtTotal.setBounds(132, 73, 118, 19);
		frame.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);

		JLabel lblResult = new JLabel("Result:");
		lblResult.setBounds(10, 207, 416, 13);
		frame.getContentPane().add(lblResult);

		JButton btnDefray = new JButton("Defray");
		btnDefray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PaymentProcessFactory paymentFactory = new PaymentProcessFactory();
				IPaymentType iPaymentType;
				iPaymentType = paymentFactory.create(cmbPaymentMethod.getSelectedItem().toString());
				PaymentProcess paymentProcess = new PaymentProcess(iPaymentType);
				paymentProcess.pay(Double.valueOf(txtTotal.getText()));
				lblResult.setText(paymentProcess.pay(Double.valueOf(txtTotal.getText())));

//				Double.valueOf(txtTotal.getText());
//
//				cmbPaymentMethod.getSelectedItem().toString();
//
//				lblResult.setText("Seçili ödeme yöntemi " + cmbPaymentMethod.getSelectedItem().toString() + "\n"
//						+ " Ödenecek tutar: " + Double.valueOf(txtTotal.getText()));

			}
		});
		btnDefray.setBounds(132, 113, 118, 21);
		frame.getContentPane().add(btnDefray);

	}
}
