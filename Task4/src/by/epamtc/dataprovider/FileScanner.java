package by.epamtc.dataprovider;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileScanner implements IDataSource {

	 public String entryStringValidation(){
		File file = new File("./resources/Text.txt");
	 	String str ="";
	 	Scanner in = null;
        
        try {	
        	in = new Scanner(file);
        	do {				
				str = in.nextLine().trim();
        	 } while(in.hasNextLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			in.close();
		}
        
        return str;
      }
}
