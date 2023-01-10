package com.ba.boost.day57.constructorexample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CarOrderForm {

	private JFrame frame;
	private JTextField txtBrand;
	private JLabel lblDoorType;
	private JLabel lblDoorNumber;
	private JTextField txtDoorNumber;
	private JTextField txtPrice;
	private JLabel lblResult;
	private JComboBox cmbDoorType;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarOrderForm window = new CarOrderForm();
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
	public CarOrderForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBrand = new JLabel("Brand:");
		lblBrand.setBounds(67, 49, 92, 13);
		frame.getContentPane().add(lblBrand);
		
		txtBrand = new JTextField();
		txtBrand.setBounds(154, 46, 118, 19);
		frame.getContentPane().add(txtBrand);
		txtBrand.setColumns(10);
		
		lblDoorType = new JLabel("Door Type:");
		lblDoorType.setBounds(67, 103, 92, 13);
		frame.getContentPane().add(lblDoorType);
		
		lblDoorNumber = new JLabel("Door Number:");
		lblDoorNumber.setBounds(67, 156, 92, 13);
		frame.getContentPane().add(lblDoorNumber);
		
		txtDoorNumber = new JTextField();
		txtDoorNumber.setBounds(154, 153, 118, 19);
		frame.getContentPane().add(txtDoorNumber);
		txtDoorNumber.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setBounds(67, 207, 92, 13);
		frame.getContentPane().add(lblPrice);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(154, 204, 118, 19);
		frame.getContentPane().add(txtPrice);
		txtPrice.setColumns(10);
		
		cmbDoorType = new JComboBox();
		cmbDoorType.setModel(new DefaultComboBoxModel(DoorType.values()));
		cmbDoorType.setBounds(154, 99, 118, 21);
		frame.getContentPane().add(cmbDoorType);
		
		JButton btnOrder = new JButton("Click To Order");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DoorNumber doorNumber = new DoorNumber(Integer.valueOf(txtDoorNumber.getText()));
				Brand brand = new Brand(txtBrand.getText());
				Door door = new Door((DoorType) cmbDoorType.getSelectedItem());
				Coachbuilder coachbuilder = new Coachbuilder(door, brand, doorNumber);
				Car car = new Car(Double.valueOf(txtPrice.getText()), coachbuilder);
				System.out.println(car);
				lblResult.setText(car.toString());
			}
		});
		btnOrder.setBounds(154, 262, 118, 21);
		frame.getContentPane().add(btnOrder);
		
		lblResult = new JLabel("Result:");
		lblResult.setBounds(10, 309, 766, 13);
		frame.getContentPane().add(lblResult);
	}
}
