package lab1.by.epamtc.main;

import lab1.by.epamtc.arrayshell.pojos.Array;
import lab1.by.epamtc.arrayshell.servise.ArrayShell;
import lab1.by.epamtc.arrayshell.view.SelectSource;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Please select data source:");
		System.out.println("1 - Console");
		System.out.println("2 - File");
		System.out.println("3 - Generation number");
		
		Array array = SelectSource.setSource();
		ArrayShell arrShell = new ArrayShell(array);
		
		
		System.out.println("Size of array: " + arrShell.size());
		System.out.println("Is array empty: " + arrShell.isEmpty());
		System.out.println("Array contains: " + arrShell.values());
		System.out.println("Max value: " + arrShell.maxValue());
		System.out.println("Min value: " + arrShell.minValue());
		System.out.println("Simple shearch (second element): " + arrShell.searchElement(1));
		
		ArrayShell.sortBySelection(array);
		System.out.println("Sort by Selection: " + array.toString());
		
		ArrayShell.sortByBubble(array);
		System.out.println("Sort by Bubble(): " + array.toString());
		
		ArrayShell.sortByShella(array);
		System.out.println("Sort by Shella(): " + array.toString());
				
		
	}

}
