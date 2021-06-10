package com.ariful.virtual_key.screens;


import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.ariful.virtual_key.entities.FileDirectory;
import com.ariful.virtual_key.services.FileServices;


public class FileScreen implements ScreenInterface {
	
	private FileDirectory dir = new FileDirectory();	
	private ArrayList<String> options = new ArrayList<>();

    public FileScreen() {
    	
    	options.add("1. Add File");
        options.add("2. Delete File");
        options.add("3. Search File");
        options.add("4. Return to Main Menu");
        
    }
    
    @Override
    public void MainMenu() {
    	System.out.println("File Options Menu");
        for (String s : options) {
            System.out.println(s);
        }

    }

    public void InputFromUser() {
        int selectedOption;
        while ((selectedOption = this.getOption()) != 4) {
            this.MenuOption(selectedOption);
        }
    }

    @Override
    public void MenuOption(int option) {
        
    	switch(option) {

            case 1:
                this.AddFile();                
                this.MainMenu();
                break;
                
            case 2: 
                this.DeleteFile();                
                this.MainMenu();
                break;
                
            case 3: 
                this.SearchFile();
                this.MainMenu();
                break;
                
            default:
                System.out.println("Menu Not Found!");
                break;                
                
        }

    }
   
    public void AddFile() {
        System.out.println("Please Enter the File Name:");
        String fileName = this.getInputString();
        System.out.println("You are adding a File named: " + fileName);
        
		try {
			Path path = FileSystems.getDefault().getPath(FileDirectory.name + fileName).toAbsolutePath();
			File file = new File(dir.getName() + fileName);
			
		      if (file.createNewFile()) {
		    	  System.out.println("File Created Successfully! " + file.getName());
		    	  dir.getFiles().add(file);
		    	  
		      } else {
		        System.out.println("Sorry You Can't Add Duplicate File!");
		      }
		}catch (IOException e){
			System.out.println(e);
		}
	}
        
    
    
    public void DeleteFile() {    	
    	System.out.println("Please Enter the File name:");
        String fileName = this.getInputString();
        System.out.println("Are You Sure to Delete File: " + fileName);
        
		Path path = FileSystems.getDefault().getPath(FileDirectory.name + fileName).toAbsolutePath();
		File file = path.toFile();
	      if (file.delete()) {
	    	  System.out.println("File Deleted Successfully: " + file.getName());
	    	  dir.getFiles().remove(file);
	      } else {
	        System.out.println("Sorry You Can't Delete:" + fileName + ", Doc Was Not Found!");
	      }
    }
    
    public void SearchFile() {    	
    	Boolean found = false;    	
    	System.out.println("Please Enter the Filename:");
        String fileName = this.getInputString();
        System.out.println("You are searching for a file named: " + fileName);       
        ArrayList<File> files = dir.getFiles();
        
        for(int i = 0; i < files.size(); i++) {
			if(files.get(i).getName().equals(fileName)) {
				System.out.println("Found: " + fileName);
				found = true;
			}
        }
        if (found == false) {
        	System.out.println("File not found");
        }
    }
    
    private String getInputString() {
        Scanner in = new Scanner(System.in);
        return(in.nextLine());
    }
    
    private int getOption() {
        Scanner in = new Scanner(System.in);
        int returnOption = 0;
        try {
            returnOption = in.nextInt();
        }
        catch (InputMismatchException ex) {
        	System.out.println("Invalid input");
        }
        return returnOption;
    }

}
