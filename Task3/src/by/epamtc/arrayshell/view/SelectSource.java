package by.epamtc.arrayshell.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import by.epamtc.arrayshell.dataprovider.ConsoleScanner;
import by.epamtc.arrayshell.dataprovider.FileScanner;
import by.epamtc.arrayshell.dataprovider.NumberGeneration;
import by.epamtc.arrayshell.servise.ArrayShell;

public class SelectSource {

	static ArrayShell arrShell;
	
		 public static ArrayShell setSource() {
		    	Scanner enter = null;
		        boolean flag = false;
		                        
                do {
                	enter = new Scanner(System.in);
                    int enteredNumber = enter.nextInt();
                    
	                switch (enteredNumber) {
					case 1:
						ConsoleScanner consScaner = new ConsoleScanner();
						arrShell = new ArrayShell(consScaner.entryIntValidation());
						flag=true;
						break;
	
					case 2:
						FileScanner fileScaner = new FileScanner();
						arrShell = new ArrayShell(fileScaner.entryIntValidation());
						flag=true;		
						break;
					case 3:
						NumberGeneration numGen = new NumberGeneration();
						arrShell = new ArrayShell(numGen.entryIntValidation());
						flag=true;
						break;
						
					default:
						System.out.println("ERROR. Enter correct number, please try again");
		                flag = false;
					}
                }while(!flag);
		        	        
                enter.close();
		        return arrShell;
		    }

}
