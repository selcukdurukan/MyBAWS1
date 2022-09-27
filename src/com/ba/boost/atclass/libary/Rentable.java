package com.ba.boost.atclass.libary;

public interface Rentable {
	int getAvaibleAmountInfo();
	String getNameInfo();
	void updateAmountInfo(int amount);
	
	
	
	default void rent(int amount, Period rentalPeriod, int rentalTime) {
		if (amount < this.getAvaibleAmountInfo()) {
			System.out.println(amount + " adet " + this.getNameInfo() + " adlı ürün kiraya verildi.");
			this.updateAmountInfo(this.getAvaibleAmountInfo() - amount);
		} else {
			System.err.println("Almak istediğiniz üründen yeteri kadar yok.");
		}

	}

    default void returnRenatal(int amount) {
		this.updateAmountInfo(this.getAvaibleAmountInfo() + amount);
	}
}

