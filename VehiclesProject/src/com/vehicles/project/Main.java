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
        System.out.println("Introduzca la matrícula del vehículo '" + type + "':");
        plate = plateInput.nextLine();

        Scanner brandInput = new Scanner(System.in);
        System.out.println("Introduzca la marca del vehículo '" + type + "':");
        brand = brandInput.nextLine();
        Scanner colorInput = new Scanner(System.in);
        System.out.println("Introduzca el color del vehículo '" + type + "':");
        color = colorInput.nextLine();

        Car myCar;
        Bike myBike;
        if (type.toLowerCase().equals("coche")) {
            Car.checkPlate(plate);
            myCar = new Car(plate,brand,color);

            // FASE 1.3
            String rightFrontWheelBrand;
            Scanner rightFrontWheelBrandInput = new Scanner(System.in);
            System.out.println("Introduzca la marca de la rueda derecha delantera:");
            rightFrontWheelBrand = rightFrontWheelBrandInput.nextLine();
            double rightFrontWheelDiameter;
            Scanner rightFrontWheelDiameterInput = new Scanner(System.in);
            System.out.println("Introduzca el diámetro de la rueda derecha delantera:");
            rightFrontWheelDiameter = rightFrontWheelDiameterInput.nextDouble();
            Wheel frontRightWheel = new Wheel(rightFrontWheelBrand,rightFrontWheelDiameter);

            String leftFrontWheelBrand;
            Scanner leftFrontWheelBrandInput = new Scanner(System.in);
            System.out.println("Introduzca la marca de la rueda izquierda delantera:");
            leftFrontWheelBrand = leftFrontWheelBrandInput.nextLine();
            double leftFrontWheelDiameter;
            Scanner leftFrontWheelDiameterInput = new Scanner(System.in);
            System.out.println("Introduzca el diámetro de la rueda izquierda delantera:");
            leftFrontWheelDiameter = leftFrontWheelDiameterInput.nextDouble();
            Wheel frontLeftWheel = new Wheel(leftFrontWheelBrand,leftFrontWheelDiameter);

            List<Wheel> frontWheels = new ArrayList<Wheel>();
            frontWheels.add(frontRightWheel);
            frontWheels.add(frontLeftWheel);

            String rightBackWheelBrand;
            Scanner rightBackWheelBrandInput = new Scanner(System.in);
            System.out.println("Introduzca la marca de la rueda derecha posterior:");
            rightBackWheelBrand = rightBackWheelBrandInput.nextLine();
            double rightBackWheelDiameter;
            Scanner rightBackWheelDiameterInput = new Scanner(System.in);
            System.out.println("Introduzca el diámetro de la rueda derecha posterior:");
            rightBackWheelDiameter = rightBackWheelDiameterInput.nextDouble();
            Wheel backRightWheel = new Wheel(rightBackWheelBrand,rightBackWheelDiameter);
            String leftBackWheelBrand;
            Scanner leftBackWheelBrandInput = new Scanner(System.in);
            System.out.println("Introduzca la marca de la rueda izquierda trasera:");
            leftBackWheelBrand = leftBackWheelBrandInput.nextLine();
            double leftBackWheelDiameter;
            Scanner leftBackWheelDiameterInput = new Scanner(System.in);
            System.out.println("Introduzca el diámetro de la rueda izquierda trasera:");
            leftBackWheelDiameter = leftBackWheelDiameterInput.nextDouble();
            Wheel backLeftWheel = new Wheel(leftBackWheelBrand,leftBackWheelDiameter);
            List<Wheel> backWheels = new ArrayList<Wheel>();
            backWheels.add(backRightWheel);
            backWheels.add(backLeftWheel);

            myCar.addWheels(frontWheels,backWheels, type);
        }
        else if (type.toLowerCase().equals("bicicleta")) {
            Bike.checkPlate(plate);
            myBike = new Bike(plate,brand,color);

            // FASE 3
            String frontWheelBrand;
            Scanner frontWheelBrandInput = new Scanner(System.in);
            System.out.println("Introduzca la marca de la rueda delantera:");
            frontWheelBrand = frontWheelBrandInput.nextLine();
            double frontWheelDiameter;
            Scanner frontWheelDiameterInput = new Scanner(System.in);
            System.out.println("Introduzca el diámetro de la rueda delantera:");
            frontWheelDiameter = frontWheelDiameterInput.nextDouble();
            Wheel frontWheel = new Wheel(frontWheelBrand,frontWheelDiameter);

            List<Wheel> frontWheels = new ArrayList<Wheel>();
            frontWheels.add(frontWheel);

            String backWheelBrand;
            Scanner backWheelBrandInput = new Scanner(System.in);
            System.out.println("Introduzca la marca de la rueda trasera:");
            backWheelBrand = backWheelBrandInput.nextLine();
            double backWheelDiameter;
            Scanner rightBackWheelDiameterInput = new Scanner(System.in);
            System.out.println("Introduzca el diámetro de la rueda derecha trasera:");
            backWheelDiameter = rightBackWheelDiameterInput.nextDouble();
            Wheel backWheel = new Wheel(backWheelBrand,backWheelDiameter);
            List<Wheel> backWheels = new ArrayList<Wheel>();
            backWheels.add(backWheel);

            myBike.addWheels(frontWheels,backWheels,type);
        }
    }
}


