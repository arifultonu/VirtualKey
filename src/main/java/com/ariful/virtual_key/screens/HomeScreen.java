package com.ariful.virtual_key.screens;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.ariful.virtual_key.services.DocumentDirectoryService;
import com.ariful.virtual_key.services.DocumentServices;


public class HomeScreen implements Screen {   

    private ArrayList<String> menuName = new ArrayList<>();


    public HomeScreen() {
        menuName.add("1. Display All Documents");
        menuName.add("2. Sub Menu");
        menuName.add("3. Close Application");

    }
    
    public void MenuList() {    	
        MainMenu();
    }   
    
    
    @Override
    public void MainMenu() {
    	System.out.println("Menu:");
        for (String allMenu : menuName)  {
            System.out.println(allMenu);
        }

    }

    public void InputFromUser() {
        int selectedOption  = 0;
        while ((selectedOption = this.getOption()) != 3) {
            this.MenuOption(selectedOption);
        }
    }

    @Override
    public void MenuOption(int option) {
        switch(option) {

            case 1: 
                this.ShowFiles();                
                this.MainMenu();                
                break;
                
            case 2: 
            	DocumentServices.setCurrentScreen(DocumentServices.DocumentScreen);
                DocumentServices.getCurrentScreen().MainMenu();
                DocumentServices.getCurrentScreen().InputFromUser();
                
                this.MainMenu();
                
                break;
                
            default:
                System.out.println("Invalid Option");
                break;
        }
        
    }

    public void ShowFiles() {
        System.out.println("List of Files: ");
    	DocumentDirectoryService.PrintFiles();

    }
    
    private int getOption() {
        Scanner in = new Scanner(System.in);

        int returnOption = 0;
        try {
            returnOption = in.nextInt();
        }
        catch (InputMismatchException ex) {

        }
        return returnOption;

    }
}
