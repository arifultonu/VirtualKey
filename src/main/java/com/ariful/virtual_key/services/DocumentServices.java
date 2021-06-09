package com.ariful.virtual_key.services;

import com.ariful.virtual_key.entities.DocumentDirectory;
import com.ariful.virtual_key.screens.DocumentScreen;
import com.ariful.virtual_key.screens.Screen;
import com.ariful.virtual_key.screens.HomeScreen;


public class DocumentServices {
	
	public static HomeScreen HomeScreen = new HomeScreen();
    public static DocumentScreen DocumentScreen = new DocumentScreen();    
    
    public static Screen CurrentScreen = HomeScreen;

    
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}
