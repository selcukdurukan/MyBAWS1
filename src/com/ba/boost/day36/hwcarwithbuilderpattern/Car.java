package com.ba.boost.day36.hwcarwithbuilderpattern;

public class Car {

	private ColorType color; // MustHave,
	private int horsePower; // MustHave
	private boolean isSunroof; // couldHave
	private boolean isAuto; // couldHave

	public Car(CarBuilder builder) {
		this.color = builder.color;
		this.horsePower = builder.horsePower;
		this.isSunroof = builder.isSunroof;
		this.isAuto = builder.isAuto;
	}

	public ColorType getColor() {
		return color;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public boolean isSunroof() {
		return isSunroof;
	}

	public boolean isAuto() {
		return isAuto;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", horsePower=" + horsePower + ", isSunroof=" + isSunroof + ", isAuto=" + isAuto
				+ "]";
	}

	public static class CarBuilder {

		private ColorType color; // MustHave,
		private int horsePower; // MustHave
		private boolean isSunroof; // couldHave
		private boolean isAuto; // couldHave

		public CarBuilder(ColorType color, int horsePower) {
			super();
			this.color = color;
			this.horsePower = horsePower;
		}

		public CarBuilder setSunroof(boolean isSunroof) {
			this.isSunroof = isSunroof;
			return this;
		}

		public CarBuilder setAuto(boolean isAuto) {
			this.isAuto = isAuto;
			return this;
		}

		public Car build() {
			Car newCar = new Car(this);
			validate(newCar);
			return new Car(this);
		}

		private void validate(Car newCar) {
			System.out.println("New car has been created.");
		}

	}

}
