package lab1.by.epamtc.arrayshell.view;

import java.util.Scanner;
import lab1.by.epamtc.arrayshell.dataprovider.ConsoleScanner;
import lab1.by.epamtc.arrayshell.dataprovider.FileScanner;
import lab1.by.epamtc.arrayshell.dataprovider.NumberGeneration;
import lab1.by.epamtc.arrayshell.pojos.Array;

public class SelectSource {

	static Array arr;
	
		 public static Array setSource() {
		    	Scanner enter = null;
		        boolean flag = false;
		                        
                do {
                	enter = new Scanner(System.in);
                    int enteredNumber = enter.nextInt();
                    
	                switch (enteredNumber) {
					case 1:
						ConsoleScanner consScaner = new ConsoleScanner();
						arr = new Array(consScaner.entryIntValidation());
						flag=true;
						break;
	
					case 2:
						FileScanner fileScaner = new FileScanner();
						arr = new Array(fileScaner.entryIntValidation());
						flag=true;		
						break;
					case 3:
						NumberGeneration numGen = new NumberGeneration();
						arr = new Array(numGen.entryIntValidation());
						flag=true;
						break;
						
					default:
						System.out.println("ERROR. Enter correct number, please try again");
		                flag = false;
					}
                }while(!flag);
		        	        
                enter.close();
		        return arr;
		    }

}
