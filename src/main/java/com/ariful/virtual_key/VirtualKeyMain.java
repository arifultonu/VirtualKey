package com.ariful.virtual_key;

import com.ariful.virtual_key.screens.HomeScreen;

public class VirtualKeyMain {

    public static void main(String[] args) {
    	HomeScreen home = new HomeScreen();
    	
    	System.out.println("Project Name: VirtualKey");
    	System.out.println("Developer Name: Md. Ariful Islam");
        System.out.println("From Dhaka, Bangldesh");
    	home.MenuList();
    	home.InputFromUser();

    }
}
