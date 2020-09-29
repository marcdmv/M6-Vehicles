package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}

	public static void checkPlate(String plate) throws Exception { // Asumimos que la matrícula de las bicicletas tiene las mismas
		// condiciones que la de los coches.
		char[] plateChars = plate.toCharArray();
		int letters = 0;
		int chars = 0;
		for (char plateChar : plateChars) {
			if (Character.isDigit(plateChar)) letters++;
			if (Character.isLetter(plateChar)) chars++;
		}
		if (letters != 4) throw new Exception("La matrícula debe contener 4 números");
		if (chars < 2 || chars > 3)	throw new Exception("La matrícula debe tener 2 o 3 letras");
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels, String type) throws Exception {
		if (type.equals("coche")) {
			addTwoWheels(frontWheels);
			addTwoWheels(backWheels);
		}
		else if (type.equals("bicicleta")) {
			addOneWheel(frontWheels);
			addOneWheel(backWheels);
		}
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		// FASE 3.1, 4.1
		if (wheels.size() != 2)	throw new Exception("El eje debe tener 2 ruedas");
		for (Wheel wheel : wheels) {
			if (getWheelDiameter(wheel) <= 0.4 || getWheelDiameter(wheel) >= 4) throw new Exception("El diámetro es incorrecto");
		}
		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!getWheelBrand(rightWheel).equals(getWheelBrand(leftWheel))) throw new Exception("La marca de las ruedas del eje no es la misma");
		if (getWheelDiameter(rightWheel) != (getWheelDiameter(leftWheel))) throw new Exception("El diámetro de las ruedas del eje no es el mismo");

		this.wheels.add(rightWheel);
		this.wheels.add(leftWheel);
	}
	public void addOneWheel(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 1)	throw new Exception("El eje debe tener 1 rueda");

		if (getWheelDiameter(wheels.get(0)) <= 0.4 || getWheelDiameter(wheels.get(0)) >= 4) throw new Exception("El diámetro es incorrecto");
		this.wheels.add(wheels.get(0));
	}

	public String getWheelBrand (Wheel wheel) {
		return wheel.brand;
	}

	public double getWheelDiameter (Wheel wheel) {
		return wheel.diameter;
	}
}