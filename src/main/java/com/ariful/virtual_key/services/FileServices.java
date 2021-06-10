package com.ariful.virtual_key.services;

import com.ariful.virtual_key.entities.FileDirectory;
import com.ariful.virtual_key.screens.FileScreen;
import com.ariful.virtual_key.screens.ScreenInterface;
import com.ariful.virtual_key.screens.HomeScreen;


public class FileServices {
	
	public static HomeScreen HomeScreen = new HomeScreen();
    public static FileScreen FileScreen = new FileScreen();    
    
    public static ScreenInterface CurrentScreen = HomeScreen;

    
    public static ScreenInterface getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(ScreenInterface currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}
