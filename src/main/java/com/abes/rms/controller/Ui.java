package com.abes.rms.controller;

import java.io.IOException;
import java.util.Scanner;

public class Ui {
	public static void UiBuilder() throws IOException {
		System.out.println("---------------------------------- 😊😊  Welcome to our Hotel 😊😊 -----------------------------------------------");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗🎗️🎗️🎗🎗️  WHO ARE YOU ❓  🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️");
			System.out.println();
			System.out.println("                                             1:Admin 😊");
			System.out.println("                                             2:Regular User 😊");
			System.out.println("                                             3:Resource Manager 😊");  
			System.out.println("                                             4:Exit 😊");
			System.out.println();
			System.out.println("                                         Enter your choice ➡️➡️");
			String choice=sc.nextLine();

			switch(choice) {
			case "1":{AdminUi.adminPortal(sc);}break;
			case "2":{ManagerUi.managerPortal(sc);}break;
			case "3":{UserUi.userPortal(sc);}break;
			case "4":{System.out.println("--------------------------------------- Thanku 🤗..Visit us Again 💦 ‼️‼️ ---------------------------------------------");
					System.exit(0);}break;
			default:{
				System.out.println("Incorrect Choice");
			}
			}
			
		}
		
			
	}
}