

import java.io.File;
import java.io.IOException;
 
public class CreateNewFile {
    public static void main(String[] args){
        try {
        	File file = new File("C:\\Users\\Govind Singh Rathore\\eclipse-workspace\\LockedMe\\src\\project\\notes.txt");
        	
        	if (file.createNewFile()) {
        		System.out.println("New File is Created!");
        	} else {
        		if(file.exists()) {
        			System.out.println("File already exists!");
        		}else {
        			System.out.println("File does not exist!");
        		}
        	}
        }catch ( IOException e) {
        	e.printStackTrace();
        }
    }
 }