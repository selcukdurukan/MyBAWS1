package com.ba.boost.day27.tender;

import java.util.Scanner;

import com.ba.boost.day27.tender.i18n.Messages;

public class TenderingSystemTest {

	private Scanner sc = new Scanner(System.in);

//	public TenderingSystemTest() {
//		super();
//		this.sc = new Scanner(System.in);
//	}

	public static void main(String[] args) {
		TenderingSystemTest system = new TenderingSystemTest();
		system.menu();
		system.sc.close();

	}

	private void menu() {
		
//		showTitle();
			
		System.out.print(Messages.getString("TenderingSystemTest.LANGUAGE")); //$NON-NLS-1$
		String language = this.sc.nextLine();
		Messages.init(language);
		
		while (true) {
			showTitle();
			System.out.print(Messages.getString("TenderingSystemTest.MATERIAL"));
			String material = sc.nextLine();
			try {
				System.out.println("Secilen malzeme: " + Material.getMaterialByLocalName(material));
			} catch (MaterialNotFoundException e) {
				e.printStackTrace();
			}
		}
		

	}

	private void showTitle() {
		System.out.println(Messages.getString("TenderingSystemTest.SPLITTER")); //$NON-NLS-1$
		System.out.println(Messages.getString("TenderingSystemTest.TITTLE")); //$NON-NLS-1$
		System.out.println(Messages.getString("TenderingSystemTest.SPLITTER")); //$NON-NLS-1$
	}
}
