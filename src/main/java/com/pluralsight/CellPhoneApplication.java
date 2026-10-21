
package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        // Scanner
        Scanner read = new Scanner(System.in);

        // Create a new cellphone object
        CellPhone phone1 = new CellPhone();

        // Prompt the user for Phone 1's information
        System.out.println("==== PHONE 1 INFORMATION ====");

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

        System.out.println();

        // Create another cellphone object
        CellPhone phone2 = new CellPhone();

        // Prompt the user for Phone 2's information
        System.out.println("==== PHONE 2 INFORMATION ====");

        System.out.print("What is the serial number? ");
        int serialNumber2 = read.nextInt();
        read.nextLine(); // Consume leftover newline

        System.out.print("What model is the phone? ");
        String model2 = read.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier2 = read.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber2 = read.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner2 = read.nextLine();

        // Store Phone 2 information using setters
        phone2.setSerialNumber(serialNumber2);
        phone2.setModel(model2);
        phone2.setCarrier(carrier2);
        phone2.setPhoneNumber(phoneNumber2);
        phone2.setOwner(owner2);

        // Display both phones' information
        display(phone1);
        display(phone2);

        // Phone 1 calls Phone 2
        phone1.dial(phone2.getPhoneNumber());

        // Phone 2 calls Phone 1
        phone2.dial(phone1.getPhoneNumber());

        // New phone object
        CellPhone phone3 = new CellPhone(123456, "Oppo Find X9 Pro", "Mint", "408-582-3305", "Ronell");
        display(phone3);
        // Phone 3 calls Phone 1 using the original method
        phone3.dial(phone1.getPhoneNumber());
        // Phone 1 calls Phone 3 using the overloaded method
        phone1.dial(phone3);

        read.close();
    }

    // Method to display phone information using getters
    public static void display(CellPhone phone) {

        System.out.println("\n==== PHONE INFORMATION ====");

        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}

