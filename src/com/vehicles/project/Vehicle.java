package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<>();

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
	public void addWheels() throws Exception{

	}

	public String getWheelBrand (Wheel wheel) {
		return wheel.brand;
	}

	public double getWheelDiameter (Wheel wheel) {
		return wheel.diameter;
	}
}