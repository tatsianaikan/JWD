package lab1.by.epamtc.arrayshell.dataprovider;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileScanner extends AbstractDataSourceInt {

	 public List<Integer> entryIntValidation(){
		File file = new File("./resources/numbers.txt");
	 	List<Integer> listInt = new ArrayList<Integer>();
	 	Scanner in = null;
        
        try {	
        	in = new Scanner(file);
        	do {				
				int enteredNumber = Integer.parseInt(in.nextLine().trim());
				listInt.add(enteredNumber);
        	 } while(in.hasNextLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			in.close();
		}
        
        return listInt;
      }
}
