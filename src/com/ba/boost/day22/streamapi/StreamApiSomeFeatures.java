package com.ba.boost.day22.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiSomeFeatures {

	public static void main(String[] args) {

		List<User> users = new ArrayList<>();

		users.add(new User(56, "Samet"));
		users.add(new User(2, "Ahmet"));
		users.add(new User(3, "Zehra"));
		users.add(new User(4, "Murat"));
		users.add(new User(5, "Yildiz"));
		users.add(new User(6, "Levent"));
		users.add(new User(7, "Elvan"));

		users.stream().forEach(s -> System.out.println(s));

		// Birden fazla işlem yapmak istersek.
		users.stream().forEach(s -> {
			System.out.print("Java ");
			System.out.print(s.getName() + " ");
			System.out.println(s.getId());
		});

		// Her bir user için tanımladığımız talk methodunu çagıralım.
		users.stream().forEach(s -> s.talk());

		// Method reference with Class
		users.stream().forEach(User::talk);

		// User id'si 5'ten büyük olan kaç kişi var?
		System.out.println(users.stream().filter(s -> s.getId() > 5).count());

		// Filtreledigim elemanları listelemek istiyorum.
		List<User> filteredLists = users.stream().filter(s -> s.getId() > 5).collect(Collectors.toList());
		System.out.println(filteredLists);

		filteredLists.stream().forEach(s -> s.talk());
		
		//Map user üzerinde değişiklik yapıp onları yeni birer elemana maplememizi sağlar. --LİST (COLLECTİON)
		List<User> listLists = users.stream().map(s -> new User(s.getId() + 100, s.getName())).collect(Collectors.toList());
		listLists.stream().forEach(s -> System.out.println(s));
		
		//Map user üzerinde değişiklik yapıp onları yeni birer elemana maplememizi sağlar. --SET (COLLECTİON)
		Set<User> setLists = users.stream().map(s -> new User(s.getId() + 100, s.getName())).collect(Collectors.toSet());
		setLists.stream().forEach(s -> System.out.println(s));
		
		//Map user üzerinde değişiklik yapıp onları yeni birer elemana maplememizi sağlar. --MAP (COLLECTİON)
		Map<Integer, String> mapLists = users.stream().collect(Collectors.toMap(s -> s.getId(), i -> i.getName()));
		mapLists.forEach((k,v) -> System.out.println(k + " - " + v));
		mapLists.forEach((k,v) -> System.out.println(k));
	
		
		

	}

}
