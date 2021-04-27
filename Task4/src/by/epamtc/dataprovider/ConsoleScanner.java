package by.epamtc.dataprovider;


import java.util.Scanner;

public class ConsoleScanner implements IDataSource{

    public String entryStringValidation() {
    	Scanner in = null;
    	String str="";
    	String fullText="";
        boolean flag = false;
        
        System.out.println("Enter some text. Enter 'exit' to stop entering");
        
        do{
        	in = new Scanner(System.in);
            str = in.nextLine();      
            
        	if(str.equals("exit")) {
            	flag = true;
            	break;
            }
        	
        	fullText = fullText + str;  
        }while(!flag);
        
        in.close();
        return fullText;
    }

}
