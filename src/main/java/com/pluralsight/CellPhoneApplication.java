
package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        // Scanner
        Scanner read = new Scanner(System.in);

        // Create a new cellphone object
        CellPhone phone1 = new CellPhone();

        // Prompt the user for their information
        System.out.print("What is the serial number? ");
        int serialNumber = read.nextInt();
        read.nextLine(); // Consume leftover newline

        System.out.print("What model is the phone? ");
        String model = read.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = read.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = read.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = read.nextLine();

        // Store information using setters
        phone1.setSerialNumber(serialNumber);
        phone1.setModel(model);
        phone1.setCarrier(carrier);
        phone1.setPhoneNumber(phoneNumber);
        phone1.setOwner(owner);

        // Display phone information
        displayPhoneInfo(phone1);

        read.close();
    }

    // Method to display phone information using getters
    public static void displayPhoneInfo(CellPhone phone) {

        System.out.println("\n==== PHONE INFORMATION ====");

        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}

