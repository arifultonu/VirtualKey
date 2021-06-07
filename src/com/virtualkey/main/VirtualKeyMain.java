package com.virtualkey.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class VirtualKeyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Index Page!! \n ");
		System.out.println("Hi! I'm Ariful Islam, From Dhaka, Bangladesh \n "		       
				+ "Welcome to my Lockedme.com Application. \n "
				+ "This is a Document Management System.");
		
		System.out.println("\n");
		showMainMenu();
		inputFromUser();
	}
	
	private static ArrayList<String> menuList = new ArrayList<String>();
	
		public static void showMainMenu() {
			System.out.println("Menu List:");
			menuList.add("1. Show All Files");
			menuList.add("2. Add New File");
			menuList.add("3. Delete File");
			menuList.add("4. Search File");
			menuList.add("5. Close Application");
			
			for (String s : menuList ) {
				System.out.println(s);
			}		

		}
		
		private static void inputFromUser(){
			int choseMenu = 0;
			while ((choseMenu = getMenuName())!= 5)  {
				BrowseMenu(choseMenu);
			}
		}

		
		private static int getMenuName() {
	        Scanner in = new Scanner(System.in);
	        int getMenuNumber = 0;
	       
	        try {
	        	getMenuNumber = in.nextInt();
	        }
	        catch (InputMismatchException ex) {
	        }
	        return getMenuNumber;
	    }
		
		public static void BrowseMenu(int option) {
	        switch(option) {

	            case 1: // Show Files in Directory
	               // this.ShowFiles();
	                
	               // this.Show();
	                
	                break;
	                
	            case 2: // Show File Options menu
//	            	ScreenService.setCurrentScreen(ScreenService.FileOptionsScreen);
//	                ScreenService.getCurrentScreen().Show();
//	                ScreenService.getCurrentScreen().GetUserInput();
	                
	               // this.Show();
	                
	                break;
	                
	            default:
	                System.out.println("Sorry Wrong Menu Selected !!!");
	                break;
	        }
	        
	    }
		
}
