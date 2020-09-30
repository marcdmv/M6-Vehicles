package com.vehicles.project;
import java.util.*;

public class Main {

    public static void addWheelsVehicle (Vehicle v) throws Exception {
        v.addWheels();
    }

    public static void main(String[] args) throws Exception{
        String type;
        String plate;
        String brand;
        String color;
        Scanner typeInput = new Scanner(System.in);
        System.out.println("Qué tipo de vehículo quiere crear? Coche/Bicicleta:");
        type = typeInput.nextLine().toLowerCase();
        if (!type.equals("coche") && !type.equals("bicicleta")) {
            throw new Exception("El tipo de vehículo no es correcto");
        }

        Scanner plateInput = new Scanner(System.in);
        System.out.println("Introduzca la matrícula del vehículo:");
        plate = plateInput.nextLine();
        Vehicle.checkPlate(plate);

        Scanner brandInput = new Scanner(System.in);
        System.out.println("Introduzca la marca del vehículo:");
        brand = brandInput.nextLine();
        Scanner colorInput = new Scanner(System.in);
        System.out.println("Introduzca el color del vehículo:");
        color = colorInput.nextLine();

        if (type.equals("coche")) {
            Car myCar = new Car(plate,brand,color);
            addWheelsVehicle(myCar);
        }
        else {
            Bike myBike = new Bike(plate,brand,color);
            addWheelsVehicle(myBike);
        }
    }
}