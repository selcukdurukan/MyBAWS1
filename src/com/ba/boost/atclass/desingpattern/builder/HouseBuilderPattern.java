package com.ba.boost.atclass.desingpattern.builder;

public class HouseBuilderPattern {
	
	private String street; 	//must-have
	private String city;	//must-have
	private int doorNumber;	//must-have
	private int numOfStoreys; 	//could-have / optional.
	private int numOfRooms;		//could-have / optional.
	private int numOfWCs;   	//could-have / optional.
	private boolean apartment;	//could-have / optional.
	private int usableSpace;	//could-have / optional.	
	private KitchenType kitchenType;	//could-have / optional.
	private int  numBalconies;	//could-have / optional.	
	private boolean patio;	//could-have / optional.
	private boolean terrace; //could-have / optional.	
	
	/*
	 * Yedinci adım: xxxBuilder objesi alan ve asıl değerleri bir privateyapıcı yöntem tanımlanır.
	 */
	
	private HouseBuilderPattern (HouseBuilder houseBuilder) {
		
		this.street = houseBuilder.street;
		this.city = houseBuilder.city;
		this.doorNumber = houseBuilder.doorNumber;
		this.numOfStoreys = houseBuilder.numOfStoreys;
		this.numOfRooms = houseBuilder.numOfRooms;
		this.numOfWCs = houseBuilder.numOfWCs;
		this.apartment = houseBuilder.apartment;
		this.usableSpace = houseBuilder.usableSpace;
		this.kitchenType = houseBuilder.kitchenType;
		this.numBalconies = houseBuilder.numBalconies;
		this.patio = houseBuilder.patio;
		this.terrace = houseBuilder.terrace;
		
	}
	
	public HouseBuilderPattern(String street, String city, int doorNumber) {
		super();
		this.street = street;
		this.city = city;
		this.doorNumber = doorNumber;
	}
	
	@Override
	public String toString() {
		return "HouseBuilderPattern [street=" + street + ", city=" + city + ", doorNumber=" + doorNumber
				+ ", numOfStoreys=" + numOfStoreys + ", numOfRooms=" + numOfRooms + ", numOfWCs=" + numOfWCs
				+ ", apartment=" + apartment + ", usableSpace=" + usableSpace + ", kitchenType=" + kitchenType
				+ ", numBalconies=" + numBalconies + ", patio=" + patio + ", terrace=" + terrace + "]";
	}
	

	
	/*
	 * İlk adım: Sonu builde rile biten bir iç public static sınıf tanımlanır.
	 */
	
	public static class HouseBuilder {
	
		/*
		 * İkinci adım: Asıl sınıftaki tüm field'lerin bir  kopyası bu iç sınıfa da yazılır.
		 */
		
		private String street; 	
		private String city;
		private int doorNumber;
		private int numOfStoreys;
		private int numOfRooms;
		private int numOfWCs;
		private boolean apartment;
		private int usableSpace;
		private KitchenType kitchenType;
		private int  numBalconies;
		private boolean patio;
		private boolean terrace;
		
		/*
		 * Üçüncü adım: zorunlu tüm fieldleri içeren bir yapıcı method tanımlanır.
		 */
		

		
		
		/*
		 * Dördüncü adım: zorunlu olmayan her field için field'in adı ile bir setter yöntemi yazıyoruz. 
		 * Ama setter'dan farkı olmak yerine kendi örneğini geri dönüyor.
		 */
		
		public HouseBuilder numOfStoreys (int numOfstroyes) {
			this.numOfStoreys = numOfstroyes;
			return this;
		}
		
		public HouseBuilder numOfRooms (int numOfRooms) {
			this.numOfRooms = numOfRooms;
			return this;
		}
		
		public HouseBuilder numOfWCs (int numOfWCs) {
			this.numOfWCs = numOfWCs;
			return this;
		}
		
		public HouseBuilder usableSpace (int usableSpace) {
			this.usableSpace = usableSpace;
			return this;
		}
		
		public HouseBuilder numBalconies (int numBalconies) {
			this.numBalconies = numBalconies;
			return this;
		}
		
		public HouseBuilder apartment (boolean apartment) {
			this.apartment = apartment;
			return this;
		}
		
		public HouseBuilder patio (boolean patio) {
			this.patio = patio;
			return this;
		}
		
		public HouseBuilder terrace (boolean terrace) {
			this.terrace = terrace;
			return this;
		}
		
		public HouseBuilder kitchenType (KitchenType kitchenType) {
			this.kitchenType = kitchenType;
			return this;
		}
		
		/*
		 *  Beşinci adım: Bir build() methodunun oluşturulması. Bu method geriye asıl çalışmak istediğimiz sınıfın bir örneğini dönecek.
		 */
		public HouseBuilderPattern build() {
			HouseBuilderPattern house = new HouseBuilderPattern(this);
			validateHouseBuilderObject(house);
			return null;	
		}
		
		/*
		 * Altıncı (zorunlu olmayan) adım: Üretilen objenin belirli kıstaslara göre doğrulığunu kontrol etmek amacıyla ile kullanılır.
		 */
		 
		private void validateHouseBuilderObject(HouseBuilderPattern house) {
			// Do some validations if needed.
			//Üretilen objenin mantıklı olup olmadığı kontrol edilir.
		}
	}





}
