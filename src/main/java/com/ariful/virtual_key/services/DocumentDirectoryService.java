package com.ariful.virtual_key.services;

import java.io.File;

import com.ariful.virtual_key.entities.DocumentDirectory;


public class DocumentDirectoryService {

    private static DocumentDirectory fileDirectory = new DocumentDirectory();
    
    public static void PrintFiles() {
    	
    	fileDirectory.fillFiles();

        for (File file : DocumentDirectoryService.getFileDirectory().getFiles())
        {
            System.out.println(file.getName());
        }
    }
    public static DocumentDirectory getFileDirectory() {
        return fileDirectory;
    }

    public static void setFileDirectory(DocumentDirectory fileDirectory) {
        DocumentDirectoryService.fileDirectory = fileDirectory;
    }


}
