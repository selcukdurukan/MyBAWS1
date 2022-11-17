package com.ba.boost.day17.bakkal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.ba.boost.day17.bakkal.model.AnimalProductType;
import com.ba.boost.day17.bakkal.model.BakeryProduct;
import com.ba.boost.day17.bakkal.model.Cheese;
import com.ba.boost.day17.bakkal.model.Customer;
import com.ba.boost.day17.bakkal.model.Employee;
import com.ba.boost.day17.bakkal.model.Perishable;
import com.ba.boost.day17.bakkal.model.Person;
import com.ba.boost.day17.bakkal.model.Product;
import com.ba.boost.day17.bakkal.model.UnitType;

public class TheBakkalDay19 {

	private Set<Person> persons = new HashSet<>(); // her bir person'dan sadece bir adet olabilecek - set.
	private Map<String, Customer> customersById = new TreeMap<>(); // Isme göre sıralı bir map.
	private Map<String, Customer> customersByFullName = new LinkedHashMap<>(); // giriş sirasina göre listeleyen map.
	private List<Product> products = new ArrayList<>(); //Ürün listesi çok sık değişmeyen ama sürekli sorgulanan liste.
	private List<Perishable> perishibleProducts = new LinkedList<>(); //bozulabilir ürün listesi sıklıkla yeni ögelerin eklendiği veya çıkarıldığı bir liste.

//	public void MMMMMBakkal() {
//		this.persons = new HashSet<>(); // sadece tek bir person tutan set.
//		this.customersByFullName = new TreeMap<>(); // Isme göre sıralı bir map.
//		this.customersById = new LinkedHashMap<>(); // giriş sirasina göre listeleyen map.
//	}

	public static void main(String[] args) {

//		Employee e1 = new Employee("Selcuk", "Durukan");
//		Customer c1 = new Customer("Jack", "London");
//		
//		System.out.println(e1);
//		System.out.println(c1);

		TheBakkalDay19 bakkal = new TheBakkalDay19();
		bakkal.addCustomer();
		bakkal.listCustomers();
		bakkal.addProduct();
	
//		bakkal.addEmployee();
//		bakkal.listEmployees();
		
		Customer c = bakkal.findCustomerByFullName("Babur Somer");
		System.out.println(c);
		c = bakkal.findCustomerById("CUS-0001");
		System.out.println(c);
		
		if (c !=  null) {
			System.out.println(c);
		} else {
			System.out.println("Customer is not found.");
		}

	}

	private void addProduct() {
	Cheese mProd = new Cheese("Beyaz Peynir", UnitType.KG, 50, 5, LocalDate.of(2022, 9, 5), AnimalProductType.COW, false, false);
	this.products.add(mProd);
	this.perishibleProducts.add(mProd);
	
	Product prod = new BakeryProduct("Pasta", UnitType.PACKAGE, 120, 5, LocalDate.of(2022, 8, 23));
	this.products.add(prod);
//	this.perishibleProducts.add(prod);  //Olmaz çünkü bu liste sadece bozulabilir arayüzünü imlemente eden ürünleri barındarabiliyor.
	
}

	private Customer findCustomerByFullName(String fullName) {
		Customer found = null;
		found = this.customersByFullName.get(fullName);
		return found;

	}

	private Customer findCustomerById(String Id) {
		Customer found = null;
		found = this.customersById.get(Id);
		return found;

	}

	private void listCustomers() {
		System.out.println("Musteri Listesi");
		for (Person person : persons) {
			if (person instanceof Customer) {
				System.out.println(person);
			}
		}
	}
	
	private void listEmployees() {
		System.out.println("Calisan Listesi");
		for (Person person : persons) {
			if (person instanceof Employee) {
				System.out.println(person);
			}
		}
	}

	private void addCustomer() {
		Customer c1 = new Customer("Babur", "Somer");
		this.persons.add(c1);
		this.customersById.put(c1.getId(), c1);
		this.customersByFullName.put(c1.getFullName(), c1);

		Customer c2 = new Customer("Ali", "Veli");
		this.persons.add(c1);
		this.customersById.put(c1.getId(), c1);
		this.customersByFullName.put(c1.getFullName(), c1);
	}
	
	private void addEmployee() {
		Employee e1 = new Employee("Ersan", "Kuneri");
		this.persons.add(e1);
		
		Employee e2 = new Employee("Ayşe", "Fatma");
		this.persons.add(e2);
	}

}
