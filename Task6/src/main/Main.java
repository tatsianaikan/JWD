package main;

import java.util.List;
import pojos.*;
import service.LogicProcessor;
import view.ViewProcessor;

public class Main {

	public static void main(String[] args) {

		// Select Data Source
		System.out.println("Whitch data do you want to use?");
		System.out.println("1 - Local data");
		System.out.println("2 - From file");
		LogicProcessor source = new LogicProcessor(new ViewProcessor().selectMenuData());

		// Total machines in stock(for info)
		System.out.println("The machines in the stock: name, number of passengers, carrying, type, aircraft cost" + "\n");
		System.out.println("\nTotal machines in the stock: " + source.totalMachinesInStock());

		// The total Number of passengers of all the machines in stock(for info)
		System.out.println("\nTotal number of passengers for all the machines in stock: " + source.totalPassengers());
		
		// The total carrying of all the machines in stock(for info)
		System.out.println("\nTotal carrying for all the machines in stock: " + source.totalCarrying());

		// Requests to the quantity machines for Airline
		System.out.println("-----------------------------------------");
		System.out.println("How many machines are needed? ");
		long quantityNeedMachines = LogicProcessor.testInt();
		source.getQuantityNeedMachines(quantityNeedMachines);

		System.out.println("Enter the amount of money which you have: ");
		long money = LogicProcessor.testInt();

		// Get the list of machines for Airline
		System.out.println("*******************************************");
		List<Aviations> listMachines = source.getMachinesForAirline(quantityNeedMachines, money);
		
		System.out.println("*******************************************");
		System.out.println("The cheapest  machines in your Airline is : " + source.getMinCostElement(listMachines));
	}

}