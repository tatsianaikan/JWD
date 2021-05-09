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
		System.out
				.println("The machines in the stock: name, number of passengers, ranging, type, aircraft cost" + "\n");
		System.out.println("\nIn total: " + source.totalMachinesInStock());

		// The total Number of passengers of all the machines in stock(for info)
		System.out.println("\nIn total number of passengers for all the machines in stock: "
				+ source.totalNumberOfPassengersOfAllMachines());

		// Requests to the quantity machines for Airline
		System.out.println("-----------------------------------------");
		System.out.println("How many machines are need? ");
		long quantityNeedMachines = LogicProcessor.testInt();
		source.getQuantityNeedMachines(quantityNeedMachines);

		System.out.println("Enter the amount of money which you have: ");
		long money = LogicProcessor.testInt();

		// Get the list of machines for Airline
		System.out.println("*******************************************");
		List<Aviations> listMachines = source.getMachinesForAirline(quantityNeedMachines, money);
		try {
			if (listMachines.size() != 0) {
				System.out.println(new Airline(listMachines).getNameAirline() + ":\n");
				for (Aviations machines : listMachines) {
					System.out.println("The " + machines + " was added in Airline: ");
				}
				System.out.println("*******************************************");

				System.out.println(
						"The cheapest  machines in your Airline is : " + source.getMinCostElement(listMachines));
			}
		} catch (NullPointerException e) {
			e.getMessage();
		}
	}

}