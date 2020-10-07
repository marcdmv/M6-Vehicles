package itacademy;

import java.util.*;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	public void addWheels() throws Exception {
		List<String> lados = Arrays.asList("delantera","trasera");

		List<Wheel> frontWheels = new ArrayList<>();
		List<Wheel> backWheels = new ArrayList<>();

		for (String lado : lados){
			String wheelBrand;
			Scanner wheelBrandInput = new Scanner(System.in);
			System.out.println("Introduzca la marca de la rueda " + lado + ":");
			wheelBrand = wheelBrandInput.nextLine();
			double wheelDiameter;
			Scanner wheelDiameterInput = new Scanner(System.in);
			System.out.println("Y ahora introduzca su diámetro (entre 0.4 y 4):");
			try {
				wheelDiameter = wheelDiameterInput.nextDouble();
			}
			catch (InputMismatchException e){
				throw new Exception("El diámetro tiene que ser numérico. Error: " + e);
			}
			Wheel wheel = new Wheel(wheelBrand,wheelDiameter);
			if (lado.equals("delantera")) {
				frontWheels.add(wheel);
			}
			else if (lado.equals("trasera")) {
				backWheels.add(wheel);
			}
		}

		addOneWheel(frontWheels);
		addOneWheel(backWheels);
		System.out.println("Vehículo Bicicleta creado correctamente.");
	}

	public void addOneWheel(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 1)	throw new Exception("El eje debe tener 1 rueda");

		if (getWheelDiameter(wheels.get(0)) <= 0.4 || getWheelDiameter(wheels.get(0)) >= 4) throw new Exception("El diámetro es incorrecto");
		this.wheels.add(wheels.get(0));
	}
}