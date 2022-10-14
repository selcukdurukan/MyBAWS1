package com.ba.boost.day14.bakkal;

import java.util.Scanner;

public class TheBakkal {

	private static final int MAX_ITEMS = 5; // Bir sabit tanımlamadık, listemizin büyüklüğünü belirlemek için.
	private Scanner sc;
	private Item[] items;
	private int itemCount;

	public static void main(String[] args) {

		TheBakkal bakkal = new TheBakkal();
		bakkal.itemCount = 0;
		bakkal.items = new Item[MAX_ITEMS]; // bir array yaratılma yolu. MAX_ITEMS kadar öğesi olan bir array yarrattık.

//		int[] ints = new int[5]; 

		bakkal.menu();
		System.out.println("Bakkalimizi ziyaret ettiginiz icin tesekkur ederiz.");
	}

	private void menu() {

		this.sc = new Scanner(System.in);
		while (true) {
			System.out.println("==============");
			System.out.println("Kardesler Gida");
			System.out.println("==============");
			System.out.println("1 - Yeni urun girisi");
			System.out.println("2 - Urunleri listele");
			System.out.println("3 - Alisveris yap");
			System.out.println("4 - Eve don");
			System.out.print("Lutfen bir secim yapiniz: ");;
			int selection = this.sc.nextInt();
			this.sc.nextLine(); // her sayi bilgisi girdikten sonra girişte hata yaşamamak için nextLine()
								// metodunu çağır. bu problem buffer'dan kaynaklanıyor.
			if (selection == 4) {
				break;
			}
			if (!this.processSelecetion(selection)) {
				System.out.println("Yanlis secim yaptiniz. Lutfen tekrarlayiniz.");
				continue;
			}
		}
		this.sc.close();
	}

	private boolean processSelecetion(int selection) {
		boolean returnValue = true;
		switch (selection) {
		case 1:
			this.createGood();
			break;
		case 2:
			this.listGoods();
			break;
		case 3:
			this.shop();
			break;
		default:
			returnValue = false;
			break;
		}
		return returnValue;
	}

	private void shop() {
		boolean continueShopping = true;
		
		if (itemCount == 0) { //bunun yerine if (items[0] == null) is ok.
			System.err.println("Depoda urun yok.");
		}
		System.out.println("Alisveris listesi");
		double totalPrice = 0.0;
		do {
			System.out.print("Almak istediginiz urunu belirtiniz (bitirmek icin TAMAM yazin): ");
			String itemName = this.sc.nextLine();
			if (itemName.equalsIgnoreCase("tamam")) {
				System.out.println("Bye...");
				continueShopping = false;   //Do-while göstermek için böyle yazdık aslında break olurdu.
			}else {
				Item item = itemExists(itemName);
				if (item == null) {
					System.out.println("Istediginiz urun depoda bulunamamakta. Baska nasil yardimci olabilirim? ");
					continue;
				}
				System.out.print("Kac " + item.getUnit() + " " + item.getName() + " almak istiyorsunuz?");
				double amount = this.sc.nextDouble();
				this.sc.nextLine();
				if (amount > item.getAmount()) {
					System.out.println("Istediginiz miktarda " + item.getName() + " yok. En fazla " + item.getAmount()+ " " + item.getUnit() + " alabilirsiniz.");
				} else {
					double price = (amount * item.getUnitPrice()) * (1 + item.getVatRate() / 100);
					System.out.println(amount +  " " + item.getUnit() + " icin toplam KDV dahil fiyat: " + price);
					totalPrice += price;
					item.setAmount(item.getAmount() - amount);
				}
			}
			
		} while (continueShopping);
		
		if (totalPrice == 0.0) {
			System.out.println("Alisveris yapmadan ayriliyorsunuz. ");
		}else {
			System.out.println("Lutfen kasada " + totalPrice + " TL odeyiniz.");
		}
		
	}

	private Item itemExists(String itemName) {
		Item retVal = null;
		
		for (int i = 0; i < items.length; i++) {
			if(items[i] == null) {
				break;
			}
			if(items[i].getName().equalsIgnoreCase(itemName) && items[i].getAmount() > 0.0) {
				retVal = items[i];
				break;
			}	
		}
		
		return retVal;
	}

	private void listGoods() {
		System.out.println("Urunleri listele\n");

		if (itemCount == 0) {
			System.err.println("Depoda urun yok.");
		} else {
			for (int i = 0; i < items.length; i++) { // items.length --> MAX_ITEMS
				if (items[i]==null) {
					break;
				}
				System.out.println((i + 1) + ". urun " +items[i]);
			}
		}
	}

	private void createGood() {

		if (itemCount == MAX_ITEMS) {
			System.err.println("Depoda yer kalmadi.");
			return;
		}

		System.out.println("Yeni urun girisi\n");
		System.out.println("================\n");
		System.out.print("Urun ismini giriniz: ");
		String itemName = this.sc.nextLine();
		System.out.print("Urun birimini giriniz: ");
		String unit = this.sc.nextLine();
		System.out.print("Urun birim fiyatini giriniz: ");
		double unitPrice = this.sc.nextDouble();
		this.sc.nextLine();
		System.out.print("Urun KDV oranini giriniz: ");
		int vat = this.sc.nextInt();
		this.sc.nextLine();
		System.out.print("Urun miktarini giriniz: ");
		double amount = this.sc.nextInt();
		this.sc.nextLine();

		Item item = new Item();
		item.setName(itemName);
		item.setUnit(unit);
		item.setUnitPrice(unitPrice);
		item.setVatRate(vat);
		item.setAmount(amount);

		items[itemCount++] = item;
		/*
		 * Yukaridaki ifade yerine bunlar da kullanilabilir. itemCount++; itemCount +=1;
		 * itemCount = itemCount + 1;
		 */
		System.out.println(item + "\n");
		
	}

}
