package com.vehicles.project;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        String type;
        String plate;
        String brand;
        String color;
        Scanner typeInput = new Scanner(System.in);
        System.out.println("Qué tipo de vehículo quiere crear? [Coche]/Bicicleta:");
        type = typeInput.nextLine().toLowerCase();
        if (type.equals("")) {
            type = "coche";
        }
        else if (!type.equals("coche") && !type.equals("bicicleta")){
            throw new Exception("El tipo de vehículo no es correcto");
        }

        Scanner plateInput = new Scanner(System.in);
        System.out.println("Introduzca la matrícula del vehículo de tipo '" + type + "':");
        plate = plateInput.nextLine();
        Vehicle.checkPlate(plate);

        Scanner brandInput = new Scanner(System.in);
        System.out.println("Introduzca la marca del vehículo de tipo '" + type + "':");
        brand = brandInput.nextLine();
        Scanner colorInput = new Scanner(System.in);
        System.out.println("Introduzca el color del vehículo de tipo '" + type + "':");
        color = colorInput.nextLine();

        Car myCar;
        Bike myBike;
        List<String> lados = Arrays.asList("derecho","izquierdo");
        List<String> lados2 = Arrays.asList("delantera","trasera");

        if (type.toLowerCase().equals("coche")) {
            myCar = new Car(plate,brand,color);
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
                    System.out.println("Y ahora introduzca su diámetro:");
                    wheelDiameter = wheelDiameterInput.nextDouble();
                    Wheel wheel = new Wheel(wheelBrand,wheelDiameter);
                    if (lado2.equals("delantera")) { frontWheels.add(wheel); }
                    else if (lado2.equals("trasera")) { backWheels.add(wheel); }
                }
            }
            myCar.addWheels(frontWheels,backWheels, type);
        }
        else if (type.toLowerCase().equals("bicicleta")) {
            myBike = new Bike(plate,brand,color);
            List<Wheel> frontWheels = new ArrayList<>();
            List<Wheel> backWheels = new ArrayList<>();
            for (String lado2 : lados2) {
                String wheelBrand;
                Scanner wheelBrandInput = new Scanner(System.in);
                System.out.println("Introduzca la marca de la rueda " + lado2 + ":");
                wheelBrand = wheelBrandInput.nextLine();
                double wheelDiameter;
                Scanner wheelDiameterInput = new Scanner(System.in);
                System.out.println("Y ahora introduzca su diámetro:");
                wheelDiameter = wheelDiameterInput.nextDouble();
                Wheel wheel = new Wheel(wheelBrand, wheelDiameter);
                if (lado2.equals("delantera")) { frontWheels.add(wheel); }
                else if (lado2.equals("trasera")) { backWheels.add(wheel); }
            }
            myBike.addWheels(frontWheels,backWheels,type);
        }
    }
}