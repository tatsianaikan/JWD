package by.epamtc.main;

import by.epamtc.arrayshell.servise.ArrayShell;
import by.epamtc.arrayshell.view.SelectSource;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Please select data source:");
		System.out.println("1 - Console");
		System.out.println("2 - File");
		System.out.println("3 - Generation number");
		
		ArrayShell arrShell = SelectSource.setSource();
		
		
		System.out.println("Size of array: " + arrShell.size());
		System.out.println("Is array empty: " + arrShell.isEmpty());
		System.out.println("Array contains: " + arrShell.values());
		System.out.println("Max value: " + arrShell.maxValue());
		System.out.println("Min value: " + arrShell.minValue());
		System.out.println("Simple shearch of second element: " + arrShell.searchElement(1));
		
		System.out.println("Sort by Selection: " + arrShell.printSortedBySelection());
		System.out.println("Sort by Bubble(): " + arrShell.sortByBubble());
		System.out.println("Sort by Shella(): " + arrShell.sortByShella());
				
		
	}

}
