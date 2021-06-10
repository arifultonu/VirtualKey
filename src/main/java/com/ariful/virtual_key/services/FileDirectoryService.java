package com.ariful.virtual_key.services;

import java.io.File;

import com.ariful.virtual_key.entities.FileDirectory;


public class FileDirectoryService {

    private static FileDirectory fileDirectory = new FileDirectory();
    
    public static void PrintFiles() {
    	
    	fileDirectory.fillFiles();

        for (File file : FileDirectoryService.getFileDirectory().getFiles())
        {
            System.out.println(file.getName());
        }
    }
    public static FileDirectory getFileDirectory() {
        return fileDirectory;
    }

    public static void setFileDirectory(FileDirectory fileDirectory) {
        FileDirectoryService.fileDirectory = fileDirectory;
    }


}
