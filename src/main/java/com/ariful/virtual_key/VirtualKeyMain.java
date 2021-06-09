package com.ariful.virtual_key;

import com.ariful.virtual_key.screens.HomeScreen;

public class VirtualKeyMain {

    public static void main(String[] args) {
    	HomeScreen home = new HomeScreen();
    	
    	System.out.println("Hello! \n I'm Md. Ariful Islam");
        System.out.println("From Dhaka, Bangldesh");
        System.out.println("\n");        
    	
    	home.MenuList();
    	home.InputFromUser();

    }
}
