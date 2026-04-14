package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        CellPhone cellPhone = createCellPhoneFromInput();
        displayCellPhone(cellPhone);
    }

    private static CellPhone createCellPhoneFromInput() {
        CellPhone cellPhone = new CellPhone();

        prompt("What is the serial number?");
        cellPhone.setSerialNumber(readInt());

        prompt("What model is the phone?");
        cellPhone.setModel(readString());

        prompt("Who is the carrier?");
        cellPhone.setCarrier(readString());

        prompt("What is the phone number?");
        cellPhone.setPhoneNumber(readString());

        prompt("Who is the owner of the phone?");
        cellPhone.setOwner(readString());
        return cellPhone;
    }

    private static void displayCellPhone(CellPhone cellPhone) {
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Phone Number:" + cellPhone.getPhoneNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Owner: " + cellPhone.getOwner());
    }


    private static void prompt(String label) {
        System.out.print(label + ": ");
    }

    private static String readString() {
        return input.nextLine();
    }

    private static int readInt() {
        int value = input.nextInt();
        input.nextLine();
        return value;
    }
}
