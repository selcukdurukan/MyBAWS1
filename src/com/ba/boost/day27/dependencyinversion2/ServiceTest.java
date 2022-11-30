package com.ba.boost.day27.dependencyinversion2;

public class ServiceTest {
	
	/*
	 * Burada reference olarak Interface kullanıyoruz, aynı interface üzerinden bagımlıgımızı yönetebiliyoruz.
	 */

	private IRepository repo;

	public ServiceTest(IRepository repo) {
		super();
		this.repo = repo;
	}

	public static void main(String[] args) {

		NoSQLRepository NoSql = new NoSQLRepository();
		SQLRepository sql = new SQLRepository();
		ServiceTest test = new ServiceTest(sql);
		System.out.println(test.repo.save());

	}

}
