package com.ba.boost.day13;

public class LocalVariableInstanceVarible {
	
	private int price;
	private double subTotal;
	private String article;
	private boolean taxFree;
	
	
	public static void main(String[] args) {
		
		double taxRate;
		double tax;
		
		
		LocalVariableInstanceVarible var = new LocalVariableInstanceVarible();
		
		var.price =10;
		var.taxFree=false;
		
		if (!var.taxFree) {
			double price = 45;          // var.price and double price are different. Double price is defined in if block.
			taxRate = 0.45;
			tax = var.price * taxRate;
			var.subTotal = (var.price + tax);
		}
		System.out.println(var);
//		System.out.println(taxRate);   // local variable should be initialized, but instance isn't have to be initialized.
		
		
	}


	@Override
	public String toString() {
		return "LocalVariableInstanceVarible [subTotal=" + subTotal + ", article=" + article + ", taxFree=" + taxFree
				+ "]";
	}

}
