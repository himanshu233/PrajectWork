package com.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingImpl {

	static Scanner sc = new Scanner(System.in);
	static int choice;
	public static final String MASTER_KEY = "master";

	private static ArrayList<Shirt> shirtList = new ArrayList<Shirt>();

	public static void storeShirtarray() throws IOException {
		File file = new File("shirtArray.ser");

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(shirtList);
		System.out.println("data written");
	}

	public static ArrayList<Shirt> getShirtarray() throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("shirtArray.ser");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		return (ArrayList<Shirt>) ois.readObject();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// initialiseCategory();
		shirtList = getShirtarray();
		// storeShirtarray();
		System.out.println(":::::::::::::::::::::Z-Shopping::::::::::::::::::::::::");
		System.out.println("\nWelcome to Z Shopping, an easy shopping solution for Z-Generation and all");

		IntroPage();
	}

	private static void IntroPage() throws IOException {

		while (true) {

			System.out.println("\nPlease enter the type of user or 3 to exit");
			System.out.println("1.Customer");
			System.out.println("2.Employee");
			System.out.println("3.Exit");

			choice = Integer.parseInt(sc.next());

			switch (choice) {
			case 1:
				opeartionOnProduct();
				break;
			case 2:
				checkEmployee();
				break;
			case 3:
				storeShirtarray();
				System.exit(0);
				return;
			default:
				System.out.println("\nPlease enter correct input\n");
				break;

			}

		}

	}

	private static void opeartionOnProduct() {
		// TODO Auto-generated method stub
		System.out.println("\nDo you wan to buy or return product");
		System.out.println("1.Buy");
		System.out.println("2.Return");

		choice = Integer.parseInt(sc.next());

		switch (choice) {
		case 1:
			chooseCategory(choice, 0);
			break;
		case 2:
			chooseCategory(choice, 0);
			break;

		default:
			break;

		}

	}

	private static void chooseCategory(int flag, int userFlag) {

		System.out.println("\nPlease choose your category");
		System.out.println("1.Clothes");
		System.out.println("2.Electronics");

		choice = Integer.parseInt(sc.next());

		switch (choice) {
		case 1:
			chooseClothes(flag, userFlag);
			break;
		case 2:
			chooseElectronics(flag, userFlag);
			break;

		default:
			break;

		}

	}

	private static void chooseElectronics(int flag, int userFlag) {

		System.out.println("\nPlease choose your clothing Type");
		System.out.println("1.Shirts");
		System.out.println("2.Pants");

		choice = Integer.parseInt(sc.next());

		switch (choice) {
		case 1:
			chooseShirts(flag, userFlag);
			break;
		case 2:
			choosePants(flag);
			break;

		default:
			break;

		}

	}

	public static void initialiseCategory() {
		Shirt s1 = new Shirt(0, 100, "ARA", "Clothing", 2, "Male", "Shirt", "XL");
		Shirt s2 = new Shirt(1, 100, "ZRA", "Clothing", 2, "Male", "Shirt", "XL");
		Shirt s3 = new Shirt(2, 100, "ZEN", "Clothing", 2, "Male", "Shirt", "XL");
		Shirt s4 = new Shirt(3, 100, "MAKA", "Clothing", 2, "Male", "Shirt", "XL");
		Shirt s5 = new Shirt(4, 100, "PEN", "Clothing", 2, "Male", "Shirt", "XL");
		shirtList.add(s1);
		shirtList.add(s2);
		shirtList.add(s3);
		shirtList.add(s4);
		shirtList.add(s5);
		System.out.println("Shirt category initilized");

	}

	private static void choosePants(int flag) {
		// TODO Auto-generated method stub

	}

	private static void chooseShirts(int flag, int userFlag) {
		switch (userFlag) {

		case 0:

			if (flag == 1) {
				System.out.println("---------------------------");

				for (Shirt shirt : shirtList) {

					System.out.println(shirt.toString());

				}
				System.out.println("---------------------------");
				System.out.println("Please enter the id of the shirt you wanna buy");

				choice = Integer.parseInt(sc.next());
				shirtList.get(choice).buy();

			} else {
				System.out.println("---------------------------");

				for (Shirt shirt : shirtList) {

					System.out.println(shirt.toString());

				}
				System.out.println("---------------------------");

				System.out.println("Please enter the id of the shirt you wanna return");
				choice = Integer.parseInt(sc.next());
				shirtList.get(choice).returnProduct();

			}
			break;

		case 1:

			System.out.println("---------------------------");

			for (Shirt shirt : shirtList) {

				System.out.println(shirt.toString());

			}
			System.out.println("---------------------------");

			System.out.println("Please enter the id of the shirt you wanna update");
			choice = Integer.parseInt(sc.next());
			System.out.println("Please the quanitity you are stocking");
			int updateQuantity = sc.nextInt();

			shirtList.get(choice).update(updateQuantity);

		}

	}

	private static void chooseClothes(int flag, int userFlag) {
		System.out.println("Enter 1 for shirt 2 for pants");

		choice = Integer.parseInt(sc.next());
		switch (choice) {
		case 1:
			chooseShirts(flag, userFlag);
			break;
		case 2:
			// choosePants();
		}

	}

	private static void checkEmployee() {
		String key;
		System.out.println("\nPlease enter the master key\n");
		key = sc.next();
		if (key.equals(MASTER_KEY)) {
			System.out.println("Credentials are right ! Welcome Employee");
			chooseCategory(0, 1);

		} else {
			System.out.println("Please enter correct credentials");
			checkEmployee();
		}

	}

}
