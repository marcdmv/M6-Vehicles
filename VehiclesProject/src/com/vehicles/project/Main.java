package com.vehicles.project;
import java.util.*;

//FASE 1
public class Main {
    public static void main(String[] args) throws Exception{
        // 1
        String plate;
        String brand;
        String color;
        Scanner plateInput = new Scanner(System.in);
        System.out.println("Introduzca la matrícula del vehículo:");
        plate = plateInput.nextLine();
        Scanner brandInput = new Scanner(System.in);
        System.out.println("Introduzca la marca del vehículo:");
        brand = brandInput.nextLine();
        Scanner colorInput = new Scanner(System.in);
        System.out.println("Introduzca el color del vehículo:");
        color = colorInput.nextLine();

        // 2
        Car myCar = new Car(plate,brand,color);
        //System.out.println(myCar.getBrand());

        // 3
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
        System.out.println("Introduzca la marca de la rueda izquierda posterior:");
        leftBackWheelBrand = leftBackWheelBrandInput.nextLine();
        double leftBackWheelDiameter;
        Scanner leftBackWheelDiameterInput = new Scanner(System.in);
        System.out.println("Introduzca el diámetro de la rueda izquierda posterior:");
        leftBackWheelDiameter = leftBackWheelDiameterInput.nextDouble();
        Wheel backLeftWheel = new Wheel(leftBackWheelBrand,leftBackWheelDiameter);
        List<Wheel> backWheels = new ArrayList<Wheel>();
        backWheels.add(backRightWheel);
        backWheels.add(backLeftWheel);

        myCar.addWheels(frontWheels,backWheels);

    }
}
