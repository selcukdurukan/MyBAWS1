package com.ba.boost.day35.factory2;

public class PlanFactory {

	public static Plan create(String planType) {
		if (planType.equalsIgnoreCase("Commercial")) {
			return new CommercialPlan();
		}
		if (planType.equalsIgnoreCase("Domestic")) {
			return new DomesticPlan();
		}
		if (planType.equalsIgnoreCase("Institutional")) {
			return new InstitutionalPlan();
		}
		return null;
	}
	
	
	

}
