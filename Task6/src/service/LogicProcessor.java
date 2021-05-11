package service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import pojos.Airline;
import pojos.Aviations;
import data.FileDataAviations;
import data.ListDataAviations;
import data.AbstractDataSourse;
import exeptions.ListSizeExeption;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogicProcessor {
  
    private  ArrayList<Aviations> mashinesForAirline = new ArrayList<Aviations>();
    private  AbstractDataSourse dataSourse;
    private static  List<Aviations> listOfAviations;
    
    public LogicProcessor(int i){
        if(i==1){
            this.dataSourse = new ListDataAviations();
            listOfAviations = dataSourse.getStockAviations();
        }else if(i==2){
            this.dataSourse = new FileDataAviations();
            listOfAviations = dataSourse.getStockAviations();
        }
    }
    
	// Returns a list of machines, the number and amount
	public ArrayList<Aviations> getMachinesForAirline(long quantityNeedMachines, long money){
		int col= listOfAviations.size();
		int groupNumber = listOfAviations.size();
		do{
			Aviations cheapMachine = getMinCostElement(listOfAviations);				
			if(cheapMachine.getCost() < money){
				money = money - cheapMachine.getCost();
				listOfAviations.remove(cheapMachine);
				mashinesForAirline.add(cheapMachine);
				System.out.println("The " + cheapMachine + " was selected.");
				quantityNeedMachines--;
			}
			groupNumber--;
		}while(groupNumber != 0);
		System.out.println(" The rest of money: " + money + "\n");
		if(quantityNeedMachines>0){
			if(listOfAviations.size() == col){
				System.out.println("\n Very little money\n");
				return null;
			}
		}
		
		try {
			if (mashinesForAirline.size() != 0) {
				System.out.println(new Airline(mashinesForAirline).getNameAirline() + ":\n");
				for (Aviations machines : mashinesForAirline) {
					System.out.println("The " + machines + " was added in Airline: ");
				}				
			}
		} catch (NullPointerException e) {
			e.getMessage();
		}
        
		writeDataFile(mashinesForAirline);
		
        return mashinesForAirline;
	}
	
	//Write the list machines in the file
	public void writeDataFile(ArrayList<Aviations> mashinesForAirline) {
		 try {
	            AbstractDataSourse.writeInFile(mashinesForAirline);
	        } catch (IOException ex) {
	            System.out.println("Exception " + ex);
	            Logger.getLogger(LogicProcessor.class.getName()).log(Level.SEVERE, null, ex);
	        }      
	}
	
	// Returns the cheapest machine on the list
	public Aviations getMinCostElement(List<Aviations> listMachines){
        Aviations cheapMachine = null;
        try{
            if(!listMachines.isEmpty() && listMachines!=null){
            	cheapMachine = listMachines.get(0);
                int minCost = cheapMachine.getCost();
                for(Aviations mashine:listMachines){	
                     if(minCost > mashine.getCost()){   
                       minCost = mashine.getCost(); 
                       cheapMachine = mashine;
                     }
                }
            }
        }catch (NullPointerException e){
        	System.out.println("ERROR: List is empty. Can not display correct data");
        }
       return cheapMachine;
	}
        
    // Total machines in the stock
    public int totalMachinesInStock(){	
        listOfAviations.forEach(mashine -> System.out.println(mashine));
        return listOfAviations.size();
    }
        
    // The total Number of passengers of all the machines in stock
    public int totalPassengers(){
    	int number = 0; 
		for(Aviations mashine:listOfAviations){
			number = number+ mashine.getNumberOfPassengers();
		}
		return number;
	}
     
    // The total carrying of all the machines in stock
    public int totalCarrying(){
    	int carrying = 0; 
		for(Aviations mashine:listOfAviations){
			carrying = carrying+ mashine.getÑarrying();
		}
		return carrying;
	}
    
    // Set Quantity needed machines from the stock
    public long setQuantityNeedMachines(){	
	    boolean flag;
	    long quantityNeedMachines=LogicProcessor.testInt();
		 	do{
	    	 if(quantityNeedMachines > listOfAviations.size()){
		            System.out.println("Not as many mashines  in stock! Try again");
		            flag = false;
		            quantityNeedMachines = LogicProcessor.testInt();
		        }else {
		            flag = true;
		        }
		    }while(!flag);     
		 return quantityNeedMachines;
    }
	
	 @SuppressWarnings("resource")
	public static long testInt(){
         boolean flag = true;
         do{
             try{
                  long enteredNumber = new Scanner(System.in).nextLong();
		          System.out.println("Ok");
                  return enteredNumber;
             }catch (InputMismatchException e) {
                   System.out.println("ERROR: " + e + ". Enter correct number, please ");
                   flag = false;
             } 
         }while(!flag);
         return 0;           
     }
}
