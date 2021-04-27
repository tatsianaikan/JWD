package by.epamtc.view;

import java.util.Scanner;
import by.epamtc.dataprovider.ConsoleScanner;
import by.epamtc.dataprovider.FileScanner;


public class SelectSource {
	static String str="";
	
		 public static String setSource() {
		    	Scanner enter = null;
		        boolean flag = false;
		                        
                do {
                	enter = new Scanner(System.in);
                    int enteredNumber = enter.nextInt();
                    
	                switch (enteredNumber) {
					case 1:
						ConsoleScanner consScaner = new ConsoleScanner();
						str = new String(consScaner.entryStringValidation());
						flag=true;
						break;
	
					case 2:
						FileScanner fileScaner = new FileScanner();
						str = new String(fileScaner.entryStringValidation());
						flag=true;		
						break;
						
					default:
						System.out.println("ERROR. Enter correct number, please try again");
		                flag = false;
					}
                }while(!flag);
		        	        
                enter.close();
		        return str;
		    }

}
