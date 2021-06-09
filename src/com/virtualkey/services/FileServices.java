package com.virtualkey.services;

import java.io.File;

import com.virtualkey.entities.FileEntities;

public class FileServices {
private static FileEntities fileEntities = new FileEntities();
    
    public static void PrintFiles() {
    	
    	fileEntities.fillFiles();

        for (File file : FileServices.getFileDirectory().getFiles())
        {
            System.out.println(file.getName());
        }
    }
    public static FileEntities getFileDirectory() {
        return fileEntities;
    }

    public static void setFileDirectory(FileEntities fileDirectory) {
       FileServices.fileEntities = fileDirectory;
    }

}
