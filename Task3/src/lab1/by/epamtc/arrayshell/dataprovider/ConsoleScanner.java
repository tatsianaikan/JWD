package lab1.by.epamtc.arrayshell.dataprovider;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ConsoleScanner extends AbstractDataSourceInt{

    public List<Integer> entryIntValidation() {
    	Scanner in = null;
    	List<Integer> listInt = new ArrayList<Integer>();
        boolean flag = false;
        
        System.out.println("Enter number. Enter 'exit' to stop entering");
        
        do{
            try{
            	in = new Scanner(System.in);
                int enteredNumber = in.nextInt();
                listInt.add(enteredNumber);                
            }catch (InputMismatchException  e) {
            	if((in.hasNextLine()==true) && (in.nextLine().equals("exit"))) {
                	flag = true;
                } else {     	
	                System.out.println("ERROR: " + e + ". Enter correct number, please try again");
	                flag = false;
                }
			}
        }while(!flag);
        
        in.close();
        return listInt;
    }

}
