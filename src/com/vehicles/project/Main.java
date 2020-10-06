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
        System.out.println("Qué tipo de vehículo quiere crear? \n" +
                "1. Coche \n" +
                "2. Bicicleta");
        type = typeInput.nextLine().toLowerCase();

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

        if (type.equals("1")) {
            Car myCar = new Car(plate,brand,color);
            System.out.println("Chásis del Coche creado correctamente.");
            addWheelsVehicle(myCar);
        }
        else if (type.equals("2")){
            Bike myBike = new Bike(plate,brand,color);
            System.out.println("Cuadro de la Bicicleta creado correctamente.");
            addWheelsVehicle(myBike);
        }
        else {
            throw new Exception("El tipo de vehículo no es correcto");
        }
    }
}