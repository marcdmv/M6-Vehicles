package com.vehicles.project;

import java.util.List;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) {

		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		if (frontWheels.size() != 2)
			throw new Exception();
		if (backWheels.size() != 2)
			throw new Exception();
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		System.out.println(getWheelBrand(rightWheel));
		System.out.println(getWheelDiameter(rightWheel));
		System.out.println(getWheelBrand(leftWheel));
		System.out.println(getWheelDiameter(leftWheel));
		System.out.println(rightWheel.hashCode());
		System.out.println(leftWheel.hashCode());

		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(rightWheel);
		this.wheels.add(leftWheel);
	}

	public String getWheelBrand (Wheel wheel) {
		return wheel.brand;
	}
	public double getWheelDiameter (Wheel wheel) {
		return wheel.diameter;
	}

	public String getBrand() throws Exception {
		if (brand.equals("")){
			throw new Exception();
		}
		return brand;
	}

}
