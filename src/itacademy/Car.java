package itacademy;

import java.util.*;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	
	public void addWheels() throws Exception {

		List<String> lados = Arrays.asList("derecho","izquierdo");
		List<String> lados2 = Arrays.asList("delantera","trasera");

		List<Wheel> frontWheels = new ArrayList<>();
		List<Wheel> backWheels = new ArrayList<>();

		for (String lado2 : lados2){
			for (String lado : lados) {
				String wheelBrand;
				Scanner wheelBrandInput = new Scanner(System.in);
				System.out.println("Introduzca la marca de la rueda " + lado2 + " del lado " + lado +":");
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
				if (lado2.equals("delantera")) { frontWheels.add(wheel); }
				else if (lado2.equals("trasera")) { backWheels.add(wheel); }
			}
		}

		addTwoWheels(frontWheels);
		System.out.println("Se han añadido las ruedas delanteras correctamente.");
		addTwoWheels(backWheels);
		System.out.println("Se han añadido las ruedas traseras correctamente.");
		System.out.println("Vehículo Coche creado correctamente.");
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2) throw new Exception("El eje debe tener 2 ruedas");
		for (Wheel wheel : wheels) {
			if (getWheelDiameter(wheel) <= 0.4 || getWheelDiameter(wheel) >= 4)
				throw new Exception("El diámetro es incorrecto");
		}
		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!getWheelBrand(rightWheel).equals(getWheelBrand(leftWheel)))
			throw new Exception("La marca de las ruedas del eje no es la misma");
		if (getWheelDiameter(rightWheel) != (getWheelDiameter(leftWheel)))
			throw new Exception("El diámetro de las ruedas del eje no es el mismo");

		this.wheels.add(rightWheel);
		this.wheels.add(leftWheel);
	}
}
